package nl.rug.proof.fol.compiler.manager;

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

    private Boolean introducedConstant = false;

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

    public ProofLine(Integer lineNr, Integer level, ParseTree sentenceTree, Evaluation evaluation) {
        this.lineNr = lineNr;
        this.level = level;
        this.sentenceTree = sentenceTree;
        this.evaluation = evaluation;
        this.boxedConstant = null;
    }

    public ProofLine(Integer lineNr, Integer level, ParseTree sentenceTree, String boxedConstant) {
        this.lineNr = lineNr;
        this.level = level;
        this.sentenceTree = sentenceTree;
        this.evaluation = new Evaluation(true, "Line " + lineNr + " is applied correctly.");
        this.boxedConstant = boxedConstant;
        introducedConstant = true;
    }

    public ProofLine(Integer lineNr, Integer level, ParseTree sentenceTree, Evaluation evaluation, String boxedConstant) {
        this.lineNr = lineNr;
        this.level = level;
        this.sentenceTree = sentenceTree;
        this.evaluation = evaluation;
        this.boxedConstant = boxedConstant;
        introducedConstant = true;
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
}
