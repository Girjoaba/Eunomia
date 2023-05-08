package nl.rug.proof.fol.compiler;

import lombok.extern.slf4j.Slf4j;
import nl.rug.proof.fol.antlrAPI.ProofGrammarParser;
import nl.rug.proof.fol.compiler.commonStrings.ErrorMessage;
import nl.rug.proof.fol.compiler.manager.ProofManager;
import nl.rug.proof.fol.grammar.GrammarNotations;
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
        if(ctx.getChild(1) instanceof ProofGrammarParser.ParenthesesSentenceContext child) {
            return getNormalSentenceContext(child);
        } else {
            return (ProofGrammarParser.NormalSentenceContext) ctx.getChild(1);
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

        if(ctx.getChild(0).getText().equals(GrammarNotations.UNIVERSAL_QUANTIFIER)
                | ctx.getChild(0).getText().equals(GrammarNotations.EXISTENTIAL_QUANTIFIER)) {
            boundedVariables.push(ctx.getChild(1).getText());
            pushed = true;
        }

        for(int i = 0; i < ctx.getChildCount(); i++) {
            if(ctx.getChild(i) instanceof ProofGrammarParser.ParenthesesSentenceContext child) {
                replaceParenthesis(ctx, getNormalSentenceContext(child), i);
                traverseSentence(ctx, manager, boundedVariables);

            } else if(ctx.getChild(i) instanceof ProofGrammarParser.NormalSentenceContext child) {
                traverseSentence(child, manager, boundedVariables);

            } else if(ctx.getChild(i) instanceof ProofGrammarParser.FunctionContext child) {
                String identifier = child.getChild(2).getText();

                if(GrammarNotations.VARIABLES.contains(identifier) && !boundedVariables.contains(identifier)) {
                    manager.setCurrentEvaluationWrong(ErrorMessage.getErrorVariableNotBounded(identifier));
                } else if(GrammarNotations.CONSTANTS.contains(identifier)) {
                    manager.addConstantCurrentLevel(identifier);
                }
            }
        }

        if(pushed) {
            boundedVariables.pop();
        }
    }

    /**
     * Calls the traversal which does the cleaning.
     * @param ctx the sentence as a tree.
     * @param manager the manager to set errors to.
     */
    public static void exploreSentence(ProofGrammarParser.NormalSentenceContext ctx, ProofManager manager) {
        Stack<String> boundedVariables = new Stack<>();
        traverseSentence(ctx, manager, boundedVariables);
    }

}
