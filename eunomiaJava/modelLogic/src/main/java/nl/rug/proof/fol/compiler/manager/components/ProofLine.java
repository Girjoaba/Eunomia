package nl.rug.proof.fol.compiler.manager.components;

import lombok.extern.slf4j.Slf4j;
import org.antlr.v4.runtime.tree.ParseTree;

/**
 * An object storing the information of one proof line.
 */
@Slf4j
public class ProofLine {
    private final Integer lineNr;
    private final Integer level;
    private final ParseTree sentenceTree;
    private final Evaluation evaluation;
    private final String boxedConstant;

    /**
     * Generic constructor for a proof line.
     * @param lineNr the location of the line in the proof.
     * @param level the level on which the line is placed. Keeping track of subproofs.
     * @param sentenceTree the sentence stored as a tree.
     */
    public ProofLine(Integer lineNr, Integer level, ParseTree sentenceTree) {
        this.lineNr = lineNr;
        this.level = level;
        this.sentenceTree = sentenceTree;
        this.evaluation = new Evaluation(true, "Line " + lineNr + " is applied correctly.");
        this.boxedConstant = null;
    }

    /**
     * Constructor for a proof line with an evaluation.
     * @param lineNr the location of the line in the proof.
     * @param level the level on which the line is placed. Keeping track of subproofs.
     * @param sentenceTree the sentence stored as a tree.
     * @param evaluation the evaluation of the proof line.
     */
    public ProofLine(Integer lineNr, Integer level, ParseTree sentenceTree, Evaluation evaluation) {
        this.lineNr = lineNr;
        this.level = level;
        this.sentenceTree = sentenceTree;
        this.evaluation = evaluation;
        this.boxedConstant = null;
    }

    /**
     * Constructor for a proof line with a constant associated.
     * @param lineNr the location of the line in the proof.
     * @param level the level on which the line is placed. Keeping track of subproofs.
     * @param sentenceTree the sentence stored as a tree.
     * @param boxedConstant the constant associated with the proof line.
     */
    public ProofLine(Integer lineNr, Integer level, ParseTree sentenceTree, String boxedConstant) {
        this.lineNr = lineNr;
        this.level = level;
        this.sentenceTree = sentenceTree;
        this.evaluation = new Evaluation(true, "Line " + lineNr + " is applied correctly.");
        this.boxedConstant = boxedConstant;
    }

    /**
     * Constructor for a proof line with a constant associated and an evaluation.
     * @param lineNr the location of the line in the proof.
     * @param level the level on which the line is placed. Keeping track of subproofs.
     * @param sentenceTree the sentence stored as a tree.
     * @param evaluation the evaluation of the proof line.
     * @param boxedConstant the constant associated with the proof line.
     */
    public ProofLine(Integer lineNr, Integer level, ParseTree sentenceTree, Evaluation evaluation,
                     String boxedConstant) {
        this.lineNr = lineNr;
        this.level = level;
        this.sentenceTree = sentenceTree;
        this.evaluation = evaluation;
        this.boxedConstant = boxedConstant;
    }

    public Evaluation getEvaluation() {
        return evaluation;
    }

    public Integer getLevel() {
        return level;
    }

    public ParseTree getSentenceTree() {
        return sentenceTree;
    }

    public String getBoxedConstant() {
        return boxedConstant;
    }

    /**
     * Sets a proof line as being incorrect.
     * @param message the error message explaining why the line is incorrect.
     */
    public void setWrongEvaluation(String message) {
        message = "Line " + lineNr + ". " + message;
        this.evaluation.setCorrect(false);
        this.evaluation.setMessage(message);
    }

    /**
     * Checks if the proof line is correct.
     * @return true for a correct line, false for an incorrect line.
     */
    public Boolean isCorrect() {
        log.info(evaluation.getMessage());
        return this.evaluation.isCorrect();
    }

    public String getErrorMessage() {
        return evaluation.getMessage();
    }
}
