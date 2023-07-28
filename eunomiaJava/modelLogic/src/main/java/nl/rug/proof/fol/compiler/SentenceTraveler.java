package nl.rug.proof.fol.compiler;

import lombok.extern.slf4j.Slf4j;
import nl.rug.proof.fol.antlrAPI.ProofGrammarParser;
import nl.rug.proof.fol.compiler.commonStrings.ErrorMessage;
import nl.rug.proof.fol.compiler.manager.ProofManager;
import nl.rug.proof.fol.grammar.GrammarNotations;
import nl.rug.proof.fol.grammar.TreeIndexes;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.jetbrains.annotations.NotNull;

import java.util.Stack;

/**
 * A class for traversing the sentence subtree of our proof tree.
 * This class also changes the sentence tree in multiple ways.
 */
@Slf4j
public class SentenceTraveler {

    /**
     * Replaces the node with parentheses with an equivalent node without parentheses.
     * @param ctx the root of the sentence tree.
     * @param childWithNoParenthesis the node without parentheses.
     * @param posChildInTree the position of the node with parentheses in the tree.
     */
    private static void replaceParenthesis(ProofGrammarParser.@NotNull NormalSentenceContext ctx,
                                           ProofGrammarParser.NormalSentenceContext childWithNoParenthesis,
                                           int posChildInTree) {
        Stack<ParseTree> sentenceStack = new Stack<>();

        // Remove and save all the children after the child with no parenthesis
        for(int j = ctx.getChildCount() - 1; j > posChildInTree; j--) {
            sentenceStack.push(ctx.getChild(j));
            ctx.removeLastChild();
        }

        // Make the replacement: With parenthesis -> No parenthesis
        ctx.removeLastChild();
        ctx.addChild(childWithNoParenthesis);

        // Add back the children that were removed
        while(!sentenceStack.isEmpty()) {
            if(sentenceStack.peek() instanceof TerminalNode) {
                ctx.addChild((TerminalNode) sentenceStack.pop());
            } else {
                ctx.addChild((RuleContext) sentenceStack.pop());
            }
        }
    }

    /**
     * Removes the parenthesis from an enveloped sentence.
     * It removes multiple if nested.
     * @param ctx the sentence as a tree.
     * @return the sentence without the parenthesis.
     */
    private static ProofGrammarParser.NormalSentenceContext getNormalSentenceContext(
            ProofGrammarParser.@NotNull ParenthesesSentenceContext ctx) {
        if(ctx.getChild(TreeIndexes.SENTENCE_WITHIN_PARENTHESIS)
                instanceof ProofGrammarParser.ParenthesesSentenceContext child) {
            return getNormalSentenceContext(child);
        } else {
            return (ProofGrammarParser.NormalSentenceContext) ctx.getChild(TreeIndexes.SENTENCE_WITHIN_PARENTHESIS);
        }
    }

    /**
     * Does multiple things in one traversal for efficiency. Instead of traversing the sentence multiple times,
     * we traverse it all at once and do as much as possible.
     * 1. Removes all the parentheses from a sentence.
     * 2. Checks if the bounded variables are bounded and sets the sentence as wrong.
     * @param ctx the sentence tree.
     * @param manager the manager to set the error.
     * @param boundedVariables a stack to keep track of what variables are bounded.
     */
    public static void traverseSentence(ProofGrammarParser.@NotNull NormalSentenceContext ctx, ProofManager manager,
                                        Stack<String> boundedVariables) {

        boolean pushed = false;

        if(ctx.getChild(TreeIndexes.QUANTIFIER).getText().equals(GrammarNotations.UNIVERSAL_QUANTIFIER)
                | ctx.getChild(TreeIndexes.QUANTIFIER).getText().equals(GrammarNotations.EXISTENTIAL_QUANTIFIER)) {
            boundedVariables.push(ctx.getChild(TreeIndexes.BOUNDED_VARIABLE).getText());
            pushed = true;
        }

        for(int i = 0; i < ctx.getChildCount(); i++) {
            if(ctx.getChild(i) instanceof ProofGrammarParser.ParenthesesSentenceContext child) {
                replaceParenthesis(ctx, getNormalSentenceContext(child), i);
                traverseSentence(ctx, manager, boundedVariables);

            } else if(ctx.getChild(i) instanceof ProofGrammarParser.NormalSentenceContext child) {
                traverseSentence(child, manager, boundedVariables);

            } else if(ctx.getChild(i) instanceof ProofGrammarParser.FunctionContext child) {
                String argument = child.getChild(TreeIndexes.FUNCTION_ARGUMENT).getText();

                if(GrammarNotations.VARIABLES.contains(argument) && !boundedVariables.contains(argument)) {
                    manager.setCurrentEvaluationWrong(ErrorMessage.errorVariableBounded(argument));
                } else if(GrammarNotations.CONSTANTS.contains(argument)) {
                    manager.addConstantCurrentLevel(argument);
                }
            }
        }

        if(pushed) {
            boundedVariables.pop();
        }
    }

    /**
     * Checks if a sentence has any ambiguous order of operations.
     * @param ctx the sentence as a tree.
     * @param manager the manager to set errors to.
     */
    private static void checkAmbiguity(ProofGrammarParser.@NotNull NormalSentenceContext ctx, ProofManager manager) {
        String sentence = ctx.getText();
        int numberOperators = 0;
        int segmentStart = 0;
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == ')' || sentence.charAt(i) == '(') {
                numberOperators = 0;
                segmentStart = i + 1;
            }
            if (sentence.charAt(i) == GrammarNotations.DISJUNCTION_SYMBOL.charAt(0)
                    || sentence.charAt(i) == GrammarNotations.CONJUNCTION_SYMBOL.charAt(0)
                    || sentence.charAt(i) == GrammarNotations.IMPLICATION_SYMBOL.charAt(0)
                    || sentence.charAt(i) == GrammarNotations.BICONDITIONAL_SYMBOL.charAt(0)) {
                numberOperators++;
            }
            if (numberOperators > 1) {
                int segmentEnd = i;
                for (int j = segmentStart; j < sentence.length(); j++) {
                    segmentEnd = j;
                    if (sentence.charAt(j) == ')' || sentence.charAt(j) == '(') {
                        break;
                    }
                }
                manager.setCurrentEvaluationWrong(ErrorMessage
                        .errorAmbiguous(sentence, segmentStart, segmentEnd + 1));
                break;
            }

        }

    }

    /**
     * Calls the traversal which does the cleaning.
     * @param ctx the sentence as a tree.
     * @param manager the manager to set errors to.
     */
    public static void exploreSentence(ProofGrammarParser.NormalSentenceContext ctx, ProofManager manager) {
        Stack<String> boundedVariables = new Stack<>();
        checkAmbiguity(ctx, manager);
        traverseSentence(ctx, manager, boundedVariables);
    }

}
