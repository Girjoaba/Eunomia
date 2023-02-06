package nl.rug.proof.fol.compiler.manager;

import lombok.extern.slf4j.Slf4j;
import org.antlr.v4.runtime.tree.ParseTree;

@Slf4j
public class ProofLine {
    private Integer lineNr;
    private Integer level;
    private ParseTree sentenceTree;

    private Evaluation evaluation;

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
    }

    public Integer getLevel() {
        return level;
    }

    public ParseTree getSentenceTree() {
        return sentenceTree;
    }

    public void setWrongEvaluation(String message) {
        message = "Line " + lineNr + ". " + message;
        this.evaluation.setCorrect(false);
        this.evaluation.setMessage(message);
    }

    public Boolean isCorrect() {
        log.info(evaluation.getMessage());
        return this.evaluation.isCorrect();
    }
}
