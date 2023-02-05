// Generated from java-escape by ANTLR 4.11.1
package nl.rug.proof.fol.antlrAPI;
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
	 * Visit a parse tree produced by the {@code ContradictionInfer}
	 * labeled alternative in {@link ProofGrammarParser#inference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContradictionInfer(ProofGrammarParser.ContradictionInferContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SentenceInfer}
	 * labeled alternative in {@link ProofGrammarParser#inference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentenceInfer(ProofGrammarParser.SentenceInferContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProofGrammarParser#contradiction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContradiction(ProofGrammarParser.ContradictionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Disjunction}
	 * labeled alternative in {@link ProofGrammarParser#sentence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDisjunction(ProofGrammarParser.DisjunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Conjunction}
	 * labeled alternative in {@link ProofGrammarParser#sentence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConjunction(ProofGrammarParser.ConjunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Atomic}
	 * labeled alternative in {@link ProofGrammarParser#sentence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomic(ProofGrammarParser.AtomicContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProofGrammarParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom(ProofGrammarParser.AtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PremiseJust}
	 * labeled alternative in {@link ProofGrammarParser#justification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPremiseJust(ProofGrammarParser.PremiseJustContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ReitJust}
	 * labeled alternative in {@link ProofGrammarParser#justification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReitJust(ProofGrammarParser.ReitJustContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ElimJust}
	 * labeled alternative in {@link ProofGrammarParser#justification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElimJust(ProofGrammarParser.ElimJustContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IntroJust}
	 * labeled alternative in {@link ProofGrammarParser#justification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntroJust(ProofGrammarParser.IntroJustContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProofGrammarParser#premise}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPremise(ProofGrammarParser.PremiseContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProofGrammarParser#reiteration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReiteration(ProofGrammarParser.ReiterationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ConjunctionIntro}
	 * labeled alternative in {@link ProofGrammarParser#introduction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConjunctionIntro(ProofGrammarParser.ConjunctionIntroContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DisjunctionIntro}
	 * labeled alternative in {@link ProofGrammarParser#introduction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDisjunctionIntro(ProofGrammarParser.DisjunctionIntroContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ConjunctionElim}
	 * labeled alternative in {@link ProofGrammarParser#elimination}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConjunctionElim(ProofGrammarParser.ConjunctionElimContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DisjunctionElim}
	 * labeled alternative in {@link ProofGrammarParser#elimination}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDisjunctionElim(ProofGrammarParser.DisjunctionElimContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProofGrammarParser#singleReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleReference(ProofGrammarParser.SingleReferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProofGrammarParser#rangeReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRangeReference(ProofGrammarParser.RangeReferenceContext ctx);
}