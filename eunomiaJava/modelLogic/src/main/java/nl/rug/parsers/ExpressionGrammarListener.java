// Generated from java-escape by ANTLR 4.11.1
package nl.rug.parsers;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ExpressionGrammarParser}.
 */
public interface ExpressionGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ExpressionGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(ExpressionGrammarParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(ExpressionGrammarParser.ExprContext ctx);
}