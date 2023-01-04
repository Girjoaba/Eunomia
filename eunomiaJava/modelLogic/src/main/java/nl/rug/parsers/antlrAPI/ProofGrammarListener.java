// Generated from java-escape by ANTLR 4.11.1
package nl.rug.parsers.antlrAPI;
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
	 * Enter a parse tree produced by {@link ProofGrammarParser#inference}.
	 * @param ctx the parse tree
	 */
	void enterInference(ProofGrammarParser.InferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProofGrammarParser#inference}.
	 * @param ctx the parse tree
	 */
	void exitInference(ProofGrammarParser.InferenceContext ctx);
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
	 * Enter a parse tree produced by {@link ProofGrammarParser#sentence}.
	 * @param ctx the parse tree
	 */
	void enterSentence(ProofGrammarParser.SentenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProofGrammarParser#sentence}.
	 * @param ctx the parse tree
	 */
	void exitSentence(ProofGrammarParser.SentenceContext ctx);
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
	 * Enter a parse tree produced by {@link ProofGrammarParser#justification}.
	 * @param ctx the parse tree
	 */
	void enterJustification(ProofGrammarParser.JustificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProofGrammarParser#justification}.
	 * @param ctx the parse tree
	 */
	void exitJustification(ProofGrammarParser.JustificationContext ctx);
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
	 * Enter a parse tree produced by {@link ProofGrammarParser#introduction}.
	 * @param ctx the parse tree
	 */
	void enterIntroduction(ProofGrammarParser.IntroductionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProofGrammarParser#introduction}.
	 * @param ctx the parse tree
	 */
	void exitIntroduction(ProofGrammarParser.IntroductionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProofGrammarParser#elimination}.
	 * @param ctx the parse tree
	 */
	void enterElimination(ProofGrammarParser.EliminationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProofGrammarParser#elimination}.
	 * @param ctx the parse tree
	 */
	void exitElimination(ProofGrammarParser.EliminationContext ctx);
}