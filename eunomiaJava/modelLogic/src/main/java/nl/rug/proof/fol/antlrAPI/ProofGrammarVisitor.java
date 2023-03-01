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
	 * Visit a parse tree produced by {@link ProofGrammarParser#premiseLine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPremiseLine(ProofGrammarParser.PremiseLineContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProofGrammarParser#proofLine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProofLine(ProofGrammarParser.ProofLineContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProofGrammarParser#conclusionLine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConclusionLine(ProofGrammarParser.ConclusionLineContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProofGrammarParser#constantIntroLine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantIntroLine(ProofGrammarParser.ConstantIntroLineContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProofGrammarParser#proofLineNum}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProofLineNum(ProofGrammarParser.ProofLineNumContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PremiseContradictionInfer}
	 * labeled alternative in {@link ProofGrammarParser#premiseInference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPremiseContradictionInfer(ProofGrammarParser.PremiseContradictionInferContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PremiseSentenceInfer}
	 * labeled alternative in {@link ProofGrammarParser#premiseInference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPremiseSentenceInfer(ProofGrammarParser.PremiseSentenceInferContext ctx);
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
	 * Visit a parse tree produced by the {@code NormalSentence}
	 * labeled alternative in {@link ProofGrammarParser#sentence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormalSentence(ProofGrammarParser.NormalSentenceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParenthesesSentence}
	 * labeled alternative in {@link ProofGrammarParser#sentence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesesSentence(ProofGrammarParser.ParenthesesSentenceContext ctx);
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
	 * Visit a parse tree produced by {@link ProofGrammarParser#reiteration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReiteration(ProofGrammarParser.ReiterationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NegationIntro}
	 * labeled alternative in {@link ProofGrammarParser#introduction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegationIntro(ProofGrammarParser.NegationIntroContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ContradictionIntro}
	 * labeled alternative in {@link ProofGrammarParser#introduction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContradictionIntro(ProofGrammarParser.ContradictionIntroContext ctx);
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
	 * Visit a parse tree produced by the {@code IdentityIntro}
	 * labeled alternative in {@link ProofGrammarParser#introduction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentityIntro(ProofGrammarParser.IdentityIntroContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ImplicationIntro}
	 * labeled alternative in {@link ProofGrammarParser#introduction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImplicationIntro(ProofGrammarParser.ImplicationIntroContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BiconditionalIntro}
	 * labeled alternative in {@link ProofGrammarParser#introduction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBiconditionalIntro(ProofGrammarParser.BiconditionalIntroContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ForallIntro}
	 * labeled alternative in {@link ProofGrammarParser#introduction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForallIntro(ProofGrammarParser.ForallIntroContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExistsIntro}
	 * labeled alternative in {@link ProofGrammarParser#introduction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExistsIntro(ProofGrammarParser.ExistsIntroContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NegationElim}
	 * labeled alternative in {@link ProofGrammarParser#elimination}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegationElim(ProofGrammarParser.NegationElimContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ContradictionElim}
	 * labeled alternative in {@link ProofGrammarParser#elimination}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContradictionElim(ProofGrammarParser.ContradictionElimContext ctx);
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
	 * Visit a parse tree produced by the {@code IdentityElim}
	 * labeled alternative in {@link ProofGrammarParser#elimination}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentityElim(ProofGrammarParser.IdentityElimContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ImplicationElim}
	 * labeled alternative in {@link ProofGrammarParser#elimination}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImplicationElim(ProofGrammarParser.ImplicationElimContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BiconditionalElim}
	 * labeled alternative in {@link ProofGrammarParser#elimination}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBiconditionalElim(ProofGrammarParser.BiconditionalElimContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ForallElim}
	 * labeled alternative in {@link ProofGrammarParser#elimination}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForallElim(ProofGrammarParser.ForallElimContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExistsElim}
	 * labeled alternative in {@link ProofGrammarParser#elimination}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExistsElim(ProofGrammarParser.ExistsElimContext ctx);
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
	/**
	 * Visit a parse tree produced by {@link ProofGrammarParser#boxedConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoxedConstant(ProofGrammarParser.BoxedConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProofGrammarParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(ProofGrammarParser.FunctionContext ctx);
}