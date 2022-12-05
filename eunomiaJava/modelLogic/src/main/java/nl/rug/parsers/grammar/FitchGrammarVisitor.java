// Generated from java-escape by ANTLR 4.11.1
package nl.rug.parsers.grammar;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link FitchGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface FitchGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link FitchGrammarParser#sentence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentence(FitchGrammarParser.SentenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link FitchGrammarParser#contradiction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContradiction(FitchGrammarParser.ContradictionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FitchGrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(FitchGrammarParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FitchGrammarParser#justification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJustification(FitchGrammarParser.JustificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link FitchGrammarParser#premise}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPremise(FitchGrammarParser.PremiseContext ctx);
	/**
	 * Visit a parse tree produced by {@link FitchGrammarParser#introduction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntroduction(FitchGrammarParser.IntroductionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FitchGrammarParser#elimination}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElimination(FitchGrammarParser.EliminationContext ctx);
	/**
	 * Visit a parse tree produced by {@link FitchGrammarParser#single_reference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingle_reference(FitchGrammarParser.Single_referenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link FitchGrammarParser#multiple_reference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiple_reference(FitchGrammarParser.Multiple_referenceContext ctx);
}