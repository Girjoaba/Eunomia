package nl.rug.proof.fol.compiler;

import lombok.extern.slf4j.Slf4j;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.*;

/**
 * A manager map that solves the more complex operations of the parser.
 * The operations are tailored for evaluating a formal proof.
 */
@Slf4j
public class ProofManager implements Manager {
    private final Map<Integer, ProofLine> lineMap = new HashMap<>();

    private Integer currentLine = 0;
    private Integer currentLevel = 0;

    /**
     * Goes to the next line in the proof.
     */
    @Override
    public void setCurrentLine(Integer line) {
        currentLine = line;
    }

    @Override
    public void setCurrentEvaluationWrong(String message) {
        lineMap.get(currentLine).setWrongEvaluation(message);
    }

    /**
     * Marks the beginning of a subproof by increasing the level.
     */
    @Override
    public void increaseLevel() {
        currentLevel++;
    }

    /**
     * Marks the ending of a subproof by decreasing the level.
     */
    @Override
    public void decreaseLevel() {
        currentLevel--;
    }

    /**
     * Save a proof line.
     * @param sentence the sentence stored as a tree.
     */
    @Override
    public void addProofLine(ParseTree sentence) {
        lineMap.put(currentLine, new ProofLine(currentLine, currentLevel, sentence));
    }

    @Override
    public Set<Integer> referenceSet() {
        return lineMap.keySet();
    }

    @Override
    public void getLineEvaluation() {
        log.info("Line " + currentLine + " is applied correctly.");
    }

    @Override
    public Integer getLevel(Integer reference) {
        return lineMap.get(reference).getLevel();
    }

    @Override
    public Integer getCurrentLevel() {
        return currentLevel;
    }

    @Override
    public ParseTree getSentence(Integer reference) {
        return lineMap.get(reference).getSentenceTree();
    }

    @Override
    public ParseTree getCurrentSentence() {
        return lineMap.get(currentLine).getSentenceTree();
    }

    @Override
    public Boolean isReference(Integer reference) {
        return lineMap.containsKey(reference);
    }

    @Override
    public Boolean isCorrect(Integer reference) {
        return lineMap.get(reference).isCorrect();
    }

}
