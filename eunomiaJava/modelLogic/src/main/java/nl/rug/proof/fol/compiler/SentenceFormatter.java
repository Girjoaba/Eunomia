package nl.rug.proof.fol.compiler;

import lombok.extern.slf4j.Slf4j;
import nl.rug.proof.fol.antlrAPI.ProofGrammarBaseVisitor;
import nl.rug.proof.fol.antlrAPI.ProofGrammarParser;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.Stack;

@Slf4j
public class SentenceFormatter {

    /**
     * An atomic sentence, we just store the atomic value.
     * @param ctx the parse tree
     */
    public static void removeParenthesis(ProofGrammarParser.NormalSentenceContext ctx,
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

    public static void traverseContextTree(ProofGrammarParser.NormalSentenceContext ctx) {
        log.warn("!! Initial: " + ctx.getText() + "\n");

        for(int i = 0; i < ctx.getChildCount(); i++) {
            if(ctx.getChild(i) instanceof ProofGrammarParser.ParenthesesSentenceContext child) {
                removeParenthesis(ctx, (ProofGrammarParser.NormalSentenceContext) child.getChild(1), i);
                traverseContextTree(ctx);
            } else if (ctx.getChild(i) instanceof ProofGrammarParser.NormalSentenceContext child) {
                traverseContextTree(child);
            }
        }
    }

}
