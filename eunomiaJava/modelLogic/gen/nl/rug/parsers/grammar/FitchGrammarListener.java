// Generated from java-escape by ANTLR 4.11.1
package nl.rug.parsers.grammar;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link FitchGrammarParser}.
 */
public interface FitchGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link FitchGrammarParser#sentence}.
	 * @param ctx the parse tree
	 */
	void enterSentence(FitchGrammarParser.SentenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link FitchGrammarParser#sentence}.
	 * @param ctx the parse tree
	 */
	void exitSentence(FitchGrammarParser.SentenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link FitchGrammarParser#contradiction}.
	 * @param ctx the parse tree
	 */
	void enterContradiction(FitchGrammarParser.ContradictionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FitchGrammarParser#contradiction}.
	 * @param ctx the parse tree
	 */
	void exitContradiction(FitchGrammarParser.ContradictionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FitchGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(FitchGrammarParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FitchGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(FitchGrammarParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FitchGrammarParser#justification}.
	 * @param ctx the parse tree
	 */
	void enterJustification(FitchGrammarParser.JustificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link FitchGrammarParser#justification}.
	 * @param ctx the parse tree
	 */
	void exitJustification(FitchGrammarParser.JustificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link FitchGrammarParser#premise}.
	 * @param ctx the parse tree
	 */
	void enterPremise(FitchGrammarParser.PremiseContext ctx);
	/**
	 * Exit a parse tree produced by {@link FitchGrammarParser#premise}.
	 * @param ctx the parse tree
	 */
	void exitPremise(FitchGrammarParser.PremiseContext ctx);
	/**
	 * Enter a parse tree produced by {@link FitchGrammarParser#introduction}.
	 * @param ctx the parse tree
	 */
	void enterIntroduction(FitchGrammarParser.IntroductionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FitchGrammarParser#introduction}.
	 * @param ctx the parse tree
	 */
	void exitIntroduction(FitchGrammarParser.IntroductionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FitchGrammarParser#elimination}.
	 * @param ctx the parse tree
	 */
	void enterElimination(FitchGrammarParser.EliminationContext ctx);
	/**
	 * Exit a parse tree produced by {@link FitchGrammarParser#elimination}.
	 * @param ctx the parse tree
	 */
	void exitElimination(FitchGrammarParser.EliminationContext ctx);
	/**
	 * Enter a parse tree produced by {@link FitchGrammarParser#single_reference}.
	 * @param ctx the parse tree
	 */
	void enterSingle_reference(FitchGrammarParser.Single_referenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link FitchGrammarParser#single_reference}.
	 * @param ctx the parse tree
	 */
	void exitSingle_reference(FitchGrammarParser.Single_referenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link FitchGrammarParser#multiple_reference}.
	 * @param ctx the parse tree
	 */
	void enterMultiple_reference(FitchGrammarParser.Multiple_referenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link FitchGrammarParser#multiple_reference}.
	 * @param ctx the parse tree
	 */
	void exitMultiple_reference(FitchGrammarParser.Multiple_referenceContext ctx);
}