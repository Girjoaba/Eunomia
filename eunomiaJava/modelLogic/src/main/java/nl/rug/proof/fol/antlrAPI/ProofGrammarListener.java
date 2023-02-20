// Generated from java-escape by ANTLR 4.11.1
package nl.rug.proof.fol.antlrAPI;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ProofGrammarParser}.
 */
public interface ProofGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ProofGrammarParser#proof}.
	 * @param ctx the parse tree
	 */
	void enterProof(ProofGrammarParser.ProofContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProofGrammarParser#proof}.
	 * @param ctx the parse tree
	 */
	void exitProof(ProofGrammarParser.ProofContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProofGrammarParser#subproof}.
	 * @param ctx the parse tree
	 */
	void enterSubproof(ProofGrammarParser.SubproofContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProofGrammarParser#subproof}.
	 * @param ctx the parse tree
	 */
	void exitSubproof(ProofGrammarParser.SubproofContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProofGrammarParser#assume}.
	 * @param ctx the parse tree
	 */
	void enterAssume(ProofGrammarParser.AssumeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProofGrammarParser#assume}.
	 * @param ctx the parse tree
	 */
	void exitAssume(ProofGrammarParser.AssumeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProofGrammarParser#qed}.
	 * @param ctx the parse tree
	 */
	void enterQed(ProofGrammarParser.QedContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProofGrammarParser#qed}.
	 * @param ctx the parse tree
	 */
	void exitQed(ProofGrammarParser.QedContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProofGrammarParser#premiseLine}.
	 * @param ctx the parse tree
	 */
	void enterPremiseLine(ProofGrammarParser.PremiseLineContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProofGrammarParser#premiseLine}.
	 * @param ctx the parse tree
	 */
	void exitPremiseLine(ProofGrammarParser.PremiseLineContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProofGrammarParser#proofLine}.
	 * @param ctx the parse tree
	 */
	void enterProofLine(ProofGrammarParser.ProofLineContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProofGrammarParser#proofLine}.
	 * @param ctx the parse tree
	 */
	void exitProofLine(ProofGrammarParser.ProofLineContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProofGrammarParser#conclusionLine}.
	 * @param ctx the parse tree
	 */
	void enterConclusionLine(ProofGrammarParser.ConclusionLineContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProofGrammarParser#conclusionLine}.
	 * @param ctx the parse tree
	 */
	void exitConclusionLine(ProofGrammarParser.ConclusionLineContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProofGrammarParser#proofLineNum}.
	 * @param ctx the parse tree
	 */
	void enterProofLineNum(ProofGrammarParser.ProofLineNumContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProofGrammarParser#proofLineNum}.
	 * @param ctx the parse tree
	 */
	void exitProofLineNum(ProofGrammarParser.ProofLineNumContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PremiseContradictionInfer}
	 * labeled alternative in {@link ProofGrammarParser#premiseInference}.
	 * @param ctx the parse tree
	 */
	void enterPremiseContradictionInfer(ProofGrammarParser.PremiseContradictionInferContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PremiseContradictionInfer}
	 * labeled alternative in {@link ProofGrammarParser#premiseInference}.
	 * @param ctx the parse tree
	 */
	void exitPremiseContradictionInfer(ProofGrammarParser.PremiseContradictionInferContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PremiseSentenceInfer}
	 * labeled alternative in {@link ProofGrammarParser#premiseInference}.
	 * @param ctx the parse tree
	 */
	void enterPremiseSentenceInfer(ProofGrammarParser.PremiseSentenceInferContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PremiseSentenceInfer}
	 * labeled alternative in {@link ProofGrammarParser#premiseInference}.
	 * @param ctx the parse tree
	 */
	void exitPremiseSentenceInfer(ProofGrammarParser.PremiseSentenceInferContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ContradictionInfer}
	 * labeled alternative in {@link ProofGrammarParser#inference}.
	 * @param ctx the parse tree
	 */
	void enterContradictionInfer(ProofGrammarParser.ContradictionInferContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ContradictionInfer}
	 * labeled alternative in {@link ProofGrammarParser#inference}.
	 * @param ctx the parse tree
	 */
	void exitContradictionInfer(ProofGrammarParser.ContradictionInferContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SentenceInfer}
	 * labeled alternative in {@link ProofGrammarParser#inference}.
	 * @param ctx the parse tree
	 */
	void enterSentenceInfer(ProofGrammarParser.SentenceInferContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SentenceInfer}
	 * labeled alternative in {@link ProofGrammarParser#inference}.
	 * @param ctx the parse tree
	 */
	void exitSentenceInfer(ProofGrammarParser.SentenceInferContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProofGrammarParser#contradiction}.
	 * @param ctx the parse tree
	 */
	void enterContradiction(ProofGrammarParser.ContradictionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProofGrammarParser#contradiction}.
	 * @param ctx the parse tree
	 */
	void exitContradiction(ProofGrammarParser.ContradictionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Disjunction}
	 * labeled alternative in {@link ProofGrammarParser#sentence}.
	 * @param ctx the parse tree
	 */
	void enterDisjunction(ProofGrammarParser.DisjunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Disjunction}
	 * labeled alternative in {@link ProofGrammarParser#sentence}.
	 * @param ctx the parse tree
	 */
	void exitDisjunction(ProofGrammarParser.DisjunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Conjunction}
	 * labeled alternative in {@link ProofGrammarParser#sentence}.
	 * @param ctx the parse tree
	 */
	void enterConjunction(ProofGrammarParser.ConjunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Conjunction}
	 * labeled alternative in {@link ProofGrammarParser#sentence}.
	 * @param ctx the parse tree
	 */
	void exitConjunction(ProofGrammarParser.ConjunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Atomic}
	 * labeled alternative in {@link ProofGrammarParser#sentence}.
	 * @param ctx the parse tree
	 */
	void enterAtomic(ProofGrammarParser.AtomicContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Atomic}
	 * labeled alternative in {@link ProofGrammarParser#sentence}.
	 * @param ctx the parse tree
	 */
	void exitAtomic(ProofGrammarParser.AtomicContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProofGrammarParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(ProofGrammarParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProofGrammarParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(ProofGrammarParser.AtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ReitJust}
	 * labeled alternative in {@link ProofGrammarParser#justification}.
	 * @param ctx the parse tree
	 */
	void enterReitJust(ProofGrammarParser.ReitJustContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ReitJust}
	 * labeled alternative in {@link ProofGrammarParser#justification}.
	 * @param ctx the parse tree
	 */
	void exitReitJust(ProofGrammarParser.ReitJustContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ElimJust}
	 * labeled alternative in {@link ProofGrammarParser#justification}.
	 * @param ctx the parse tree
	 */
	void enterElimJust(ProofGrammarParser.ElimJustContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ElimJust}
	 * labeled alternative in {@link ProofGrammarParser#justification}.
	 * @param ctx the parse tree
	 */
	void exitElimJust(ProofGrammarParser.ElimJustContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IntroJust}
	 * labeled alternative in {@link ProofGrammarParser#justification}.
	 * @param ctx the parse tree
	 */
	void enterIntroJust(ProofGrammarParser.IntroJustContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IntroJust}
	 * labeled alternative in {@link ProofGrammarParser#justification}.
	 * @param ctx the parse tree
	 */
	void exitIntroJust(ProofGrammarParser.IntroJustContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProofGrammarParser#premise}.
	 * @param ctx the parse tree
	 */
	void enterPremise(ProofGrammarParser.PremiseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProofGrammarParser#premise}.
	 * @param ctx the parse tree
	 */
	void exitPremise(ProofGrammarParser.PremiseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProofGrammarParser#reiteration}.
	 * @param ctx the parse tree
	 */
	void enterReiteration(ProofGrammarParser.ReiterationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProofGrammarParser#reiteration}.
	 * @param ctx the parse tree
	 */
	void exitReiteration(ProofGrammarParser.ReiterationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ConjunctionIntro}
	 * labeled alternative in {@link ProofGrammarParser#introduction}.
	 * @param ctx the parse tree
	 */
	void enterConjunctionIntro(ProofGrammarParser.ConjunctionIntroContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConjunctionIntro}
	 * labeled alternative in {@link ProofGrammarParser#introduction}.
	 * @param ctx the parse tree
	 */
	void exitConjunctionIntro(ProofGrammarParser.ConjunctionIntroContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DisjunctionIntro}
	 * labeled alternative in {@link ProofGrammarParser#introduction}.
	 * @param ctx the parse tree
	 */
	void enterDisjunctionIntro(ProofGrammarParser.DisjunctionIntroContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DisjunctionIntro}
	 * labeled alternative in {@link ProofGrammarParser#introduction}.
	 * @param ctx the parse tree
	 */
	void exitDisjunctionIntro(ProofGrammarParser.DisjunctionIntroContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ConjunctionElim}
	 * labeled alternative in {@link ProofGrammarParser#elimination}.
	 * @param ctx the parse tree
	 */
	void enterConjunctionElim(ProofGrammarParser.ConjunctionElimContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConjunctionElim}
	 * labeled alternative in {@link ProofGrammarParser#elimination}.
	 * @param ctx the parse tree
	 */
	void exitConjunctionElim(ProofGrammarParser.ConjunctionElimContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DisjunctionElim}
	 * labeled alternative in {@link ProofGrammarParser#elimination}.
	 * @param ctx the parse tree
	 */
	void enterDisjunctionElim(ProofGrammarParser.DisjunctionElimContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DisjunctionElim}
	 * labeled alternative in {@link ProofGrammarParser#elimination}.
	 * @param ctx the parse tree
	 */
	void exitDisjunctionElim(ProofGrammarParser.DisjunctionElimContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProofGrammarParser#singleReference}.
	 * @param ctx the parse tree
	 */
	void enterSingleReference(ProofGrammarParser.SingleReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProofGrammarParser#singleReference}.
	 * @param ctx the parse tree
	 */
	void exitSingleReference(ProofGrammarParser.SingleReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProofGrammarParser#rangeReference}.
	 * @param ctx the parse tree
	 */
	void enterRangeReference(ProofGrammarParser.RangeReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProofGrammarParser#rangeReference}.
	 * @param ctx the parse tree
	 */
	void exitRangeReference(ProofGrammarParser.RangeReferenceContext ctx);
}