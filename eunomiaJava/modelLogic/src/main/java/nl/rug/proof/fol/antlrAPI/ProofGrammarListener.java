// Generated from D:/CompSci/JavaCode/Eunomia/eunomiaJava/modelLogic/src/main/java/nl/rug/proof/fol/grammar\ProofGrammar.g4 by ANTLR 4.12.0
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
	 * Enter a parse tree produced by {@link ProofGrammarParser#constantIntroLine}.
	 * @param ctx the parse tree
	 */
	void enterConstantIntroLine(ProofGrammarParser.ConstantIntroLineContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProofGrammarParser#constantIntroLine}.
	 * @param ctx the parse tree
	 */
	void exitConstantIntroLine(ProofGrammarParser.ConstantIntroLineContext ctx);
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
	 * Enter a parse tree produced by the {@code NormalSentence}
	 * labeled alternative in {@link ProofGrammarParser#sentence}.
	 * @param ctx the parse tree
	 */
	void enterNormalSentence(ProofGrammarParser.NormalSentenceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NormalSentence}
	 * labeled alternative in {@link ProofGrammarParser#sentence}.
	 * @param ctx the parse tree
	 */
	void exitNormalSentence(ProofGrammarParser.NormalSentenceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParenthesesSentence}
	 * labeled alternative in {@link ProofGrammarParser#sentence}.
	 * @param ctx the parse tree
	 */
	void enterParenthesesSentence(ProofGrammarParser.ParenthesesSentenceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParenthesesSentence}
	 * labeled alternative in {@link ProofGrammarParser#sentence}.
	 * @param ctx the parse tree
	 */
	void exitParenthesesSentence(ProofGrammarParser.ParenthesesSentenceContext ctx);
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
	 * Enter a parse tree produced by the {@code NegationIntro}
	 * labeled alternative in {@link ProofGrammarParser#introduction}.
	 * @param ctx the parse tree
	 */
	void enterNegationIntro(ProofGrammarParser.NegationIntroContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NegationIntro}
	 * labeled alternative in {@link ProofGrammarParser#introduction}.
	 * @param ctx the parse tree
	 */
	void exitNegationIntro(ProofGrammarParser.NegationIntroContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ContradictionIntro}
	 * labeled alternative in {@link ProofGrammarParser#introduction}.
	 * @param ctx the parse tree
	 */
	void enterContradictionIntro(ProofGrammarParser.ContradictionIntroContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ContradictionIntro}
	 * labeled alternative in {@link ProofGrammarParser#introduction}.
	 * @param ctx the parse tree
	 */
	void exitContradictionIntro(ProofGrammarParser.ContradictionIntroContext ctx);
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
	 * Enter a parse tree produced by the {@code IdentityIntro}
	 * labeled alternative in {@link ProofGrammarParser#introduction}.
	 * @param ctx the parse tree
	 */
	void enterIdentityIntro(ProofGrammarParser.IdentityIntroContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IdentityIntro}
	 * labeled alternative in {@link ProofGrammarParser#introduction}.
	 * @param ctx the parse tree
	 */
	void exitIdentityIntro(ProofGrammarParser.IdentityIntroContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ImplicationIntro}
	 * labeled alternative in {@link ProofGrammarParser#introduction}.
	 * @param ctx the parse tree
	 */
	void enterImplicationIntro(ProofGrammarParser.ImplicationIntroContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ImplicationIntro}
	 * labeled alternative in {@link ProofGrammarParser#introduction}.
	 * @param ctx the parse tree
	 */
	void exitImplicationIntro(ProofGrammarParser.ImplicationIntroContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BiconditionalIntro}
	 * labeled alternative in {@link ProofGrammarParser#introduction}.
	 * @param ctx the parse tree
	 */
	void enterBiconditionalIntro(ProofGrammarParser.BiconditionalIntroContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BiconditionalIntro}
	 * labeled alternative in {@link ProofGrammarParser#introduction}.
	 * @param ctx the parse tree
	 */
	void exitBiconditionalIntro(ProofGrammarParser.BiconditionalIntroContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForallIntro}
	 * labeled alternative in {@link ProofGrammarParser#introduction}.
	 * @param ctx the parse tree
	 */
	void enterForallIntro(ProofGrammarParser.ForallIntroContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForallIntro}
	 * labeled alternative in {@link ProofGrammarParser#introduction}.
	 * @param ctx the parse tree
	 */
	void exitForallIntro(ProofGrammarParser.ForallIntroContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExistsIntro}
	 * labeled alternative in {@link ProofGrammarParser#introduction}.
	 * @param ctx the parse tree
	 */
	void enterExistsIntro(ProofGrammarParser.ExistsIntroContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExistsIntro}
	 * labeled alternative in {@link ProofGrammarParser#introduction}.
	 * @param ctx the parse tree
	 */
	void exitExistsIntro(ProofGrammarParser.ExistsIntroContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NegationElim}
	 * labeled alternative in {@link ProofGrammarParser#elimination}.
	 * @param ctx the parse tree
	 */
	void enterNegationElim(ProofGrammarParser.NegationElimContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NegationElim}
	 * labeled alternative in {@link ProofGrammarParser#elimination}.
	 * @param ctx the parse tree
	 */
	void exitNegationElim(ProofGrammarParser.NegationElimContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ContradictionElim}
	 * labeled alternative in {@link ProofGrammarParser#elimination}.
	 * @param ctx the parse tree
	 */
	void enterContradictionElim(ProofGrammarParser.ContradictionElimContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ContradictionElim}
	 * labeled alternative in {@link ProofGrammarParser#elimination}.
	 * @param ctx the parse tree
	 */
	void exitContradictionElim(ProofGrammarParser.ContradictionElimContext ctx);
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
	 * Enter a parse tree produced by the {@code IdentityElim}
	 * labeled alternative in {@link ProofGrammarParser#elimination}.
	 * @param ctx the parse tree
	 */
	void enterIdentityElim(ProofGrammarParser.IdentityElimContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IdentityElim}
	 * labeled alternative in {@link ProofGrammarParser#elimination}.
	 * @param ctx the parse tree
	 */
	void exitIdentityElim(ProofGrammarParser.IdentityElimContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ImplicationElim}
	 * labeled alternative in {@link ProofGrammarParser#elimination}.
	 * @param ctx the parse tree
	 */
	void enterImplicationElim(ProofGrammarParser.ImplicationElimContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ImplicationElim}
	 * labeled alternative in {@link ProofGrammarParser#elimination}.
	 * @param ctx the parse tree
	 */
	void exitImplicationElim(ProofGrammarParser.ImplicationElimContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BiconditionalElim}
	 * labeled alternative in {@link ProofGrammarParser#elimination}.
	 * @param ctx the parse tree
	 */
	void enterBiconditionalElim(ProofGrammarParser.BiconditionalElimContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BiconditionalElim}
	 * labeled alternative in {@link ProofGrammarParser#elimination}.
	 * @param ctx the parse tree
	 */
	void exitBiconditionalElim(ProofGrammarParser.BiconditionalElimContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForallElim}
	 * labeled alternative in {@link ProofGrammarParser#elimination}.
	 * @param ctx the parse tree
	 */
	void enterForallElim(ProofGrammarParser.ForallElimContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForallElim}
	 * labeled alternative in {@link ProofGrammarParser#elimination}.
	 * @param ctx the parse tree
	 */
	void exitForallElim(ProofGrammarParser.ForallElimContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExistsElim}
	 * labeled alternative in {@link ProofGrammarParser#elimination}.
	 * @param ctx the parse tree
	 */
	void enterExistsElim(ProofGrammarParser.ExistsElimContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExistsElim}
	 * labeled alternative in {@link ProofGrammarParser#elimination}.
	 * @param ctx the parse tree
	 */
	void exitExistsElim(ProofGrammarParser.ExistsElimContext ctx);
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
	/**
	 * Enter a parse tree produced by {@link ProofGrammarParser#boxedConstant}.
	 * @param ctx the parse tree
	 */
	void enterBoxedConstant(ProofGrammarParser.BoxedConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProofGrammarParser#boxedConstant}.
	 * @param ctx the parse tree
	 */
	void exitBoxedConstant(ProofGrammarParser.BoxedConstantContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PropositionAtom}
	 * labeled alternative in {@link ProofGrammarParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterPropositionAtom(ProofGrammarParser.PropositionAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PropositionAtom}
	 * labeled alternative in {@link ProofGrammarParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitPropositionAtom(ProofGrammarParser.PropositionAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IdentityAtom}
	 * labeled alternative in {@link ProofGrammarParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterIdentityAtom(ProofGrammarParser.IdentityAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IdentityAtom}
	 * labeled alternative in {@link ProofGrammarParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitIdentityAtom(ProofGrammarParser.IdentityAtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProofGrammarParser#identifierAtom}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierAtom(ProofGrammarParser.IdentifierAtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProofGrammarParser#identifierAtom}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierAtom(ProofGrammarParser.IdentifierAtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProofGrammarParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(ProofGrammarParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProofGrammarParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(ProofGrammarParser.FunctionContext ctx);
}