package nl.rug.proof.fol.compiler;

import lombok.extern.slf4j.Slf4j;
import nl.rug.proof.fol.antlrAPI.ProofGrammarParser;
import nl.rug.proof.fol.compiler.manager.ProofManager;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.Stack;

@Slf4j
public class SentenceTraveler {

    /**
     * An atomic sentence, we just store the atomic value.
     * @param ctx the parse tree
     */
    private static void removeParenthesis(ProofGrammarParser.NormalSentenceContext ctx,
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
        ctx.addChild((RuleContext) childWithNoParenthesis);

        // Add back the children that were removed
        while(!sentenceStack.isEmpty()) {
            if(sentenceStack.peek() instanceof TerminalNode) {
                ctx.addChild((TerminalNode) sentenceStack.pop());
            } else {
                ctx.addChild((RuleContext) sentenceStack.pop());
            }
        }
    }

    private static ProofGrammarParser.NormalSentenceContext getNormalSentenceContext(ProofGrammarParser.ParenthesesSentenceContext ctx) {
        // Take into consideration that nested parentheses are possible
        if(ctx.getChild(1) instanceof ProofGrammarParser.ParenthesesSentenceContext child) {
            return getNormalSentenceContext(child);
        } else {
            return (ProofGrammarParser.NormalSentenceContext) ctx.getChild(1);
        }
    }

    public static void removeParentheses(ProofGrammarParser.NormalSentenceContext ctx) {

        for(int i = 0; i < ctx.getChildCount(); i++) {
            if(ctx.getChild(i) instanceof ProofGrammarParser.ParenthesesSentenceContext child) {
                removeParenthesis(ctx, getNormalSentenceContext(child), i);
                removeParentheses(ctx);
            } else if (ctx.getChild(i) instanceof ProofGrammarParser.NormalSentenceContext child) {
                removeParentheses(child);
            }
        }
    }

    public static void checkBoundedVariables(ProofGrammarParser.NormalSentenceContext ctx, ProofManager manager) {
        Stack<String> boundedVariables = new Stack<>();
        for(int i = 0; i < ctx.getChildCount(); i++) {
            if (ctx.getChild(i) instanceof ProofGrammarParser.NormalSentenceContext child) {
                checkBoundedVariables(child, manager);
            } else if(ctx.getChild(i) instanceof ProofGrammarParser.FunctionContext child) {
                if(!boundedVariables.contains(child.getChild(2).getText())) {
                    manager.setCurrentEvaluationWrong("Variable " + child.getChild(2).getText() + " is not bounded");
                }
            }
        }
    }
}
