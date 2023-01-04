// Generated from java-escape by ANTLR 4.11.1
package nl.rug.parsers.antlrAPI;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ProofGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ProofGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ProofGrammarParser#proof}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProof(ProofGrammarParser.ProofContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProofGrammarParser#subproof}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubproof(ProofGrammarParser.SubproofContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProofGrammarParser#assume}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssume(ProofGrammarParser.AssumeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProofGrammarParser#qed}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQed(ProofGrammarParser.QedContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProofGrammarParser#proofLine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProofLine(ProofGrammarParser.ProofLineContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProofGrammarParser#proofLineNum}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProofLineNum(ProofGrammarParser.ProofLineNumContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProofGrammarParser#inference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInference(ProofGrammarParser.InferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProofGrammarParser#contradiction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContradiction(ProofGrammarParser.ContradictionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProofGrammarParser#sentence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentence(ProofGrammarParser.SentenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProofGrammarParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom(ProofGrammarParser.AtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProofGrammarParser#justification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJustification(ProofGrammarParser.JustificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProofGrammarParser#premise}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPremise(ProofGrammarParser.PremiseContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProofGrammarParser#introduction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntroduction(ProofGrammarParser.IntroductionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProofGrammarParser#elimination}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElimination(ProofGrammarParser.EliminationContext ctx);
}