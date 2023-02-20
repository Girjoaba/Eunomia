package nl.rug.proof.fol.compiler.manager;

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
    private PremiseState premiseState = PremiseState.INITIAL;

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
    public PremiseState getPremiseState() {
        return premiseState;
    }

    @Override
    public void setPremiseState(PremiseState premiseState) {
        this.premiseState = premiseState;
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

    @Override
    public Boolean isValidSingleReference(Integer reference) {
        return lineMap.containsKey(reference) && (lineMap.get(reference).getLevel() <= currentLevel);
    }

    @Override
    public Boolean isValidRangeReference(Integer startReference, Integer endReference) {
        return  lineMap.containsKey(startReference) && lineMap.containsKey(endReference)
                && (lineMap.get(startReference).getLevel().equals(lineMap.get(endReference).getLevel()))
                && (lineMap.get(startReference).getLevel() - 1 == currentLevel);
    }

    @Override
    public Boolean isCorrectBinaryExpression(Integer reference, String operator) {
        if(lineMap.get(reference).getSentenceTree().getChildCount() != 3)
            return false;
        return lineMap.get(reference).getSentenceTree().getChild(1).getText().equals(operator);
    }

    @Override
    public Boolean isCurrentCorrectBinaryExpression(String operator) {
        if(lineMap.get(currentLine).getSentenceTree().getChildCount() != 3)
            return false;
        return lineMap.get(currentLine).getSentenceTree().getChild(1).getText().equals(operator);
    }

    @Override
    public Boolean isPartOfBinaryExpression(Integer childReference, Integer parentReference) {
            // Return false if parent reference is not a binary expression
        if(lineMap.get(parentReference).getSentenceTree().getChildCount() != 3)
            return false;

            // Return true if child reference is part of the binary expression
        return lineMap.get(childReference).getSentenceTree().getText()
                .equals(lineMap.get(parentReference).getSentenceTree().getChild(0).getText()) ||
                lineMap.get(childReference).getSentenceTree().getText()
                        .equals(lineMap.get(parentReference).getSentenceTree().getChild(2).getText());
    }

    @Override
    public Boolean isCurrentPartOfBinaryExpression(Integer parentReference) {
            // Return false if parent reference is not a binary expression
        if(lineMap.get(parentReference).getSentenceTree().getChildCount() != 3)
            return false;

            // Return true if child reference is part of the binary expression
        return lineMap.get(currentLine).getSentenceTree().getText()
                .equals(lineMap.get(parentReference).getSentenceTree().getChild(0).getText()) ||
                lineMap.get(currentLine).getSentenceTree().getText()
                        .equals(lineMap.get(parentReference).getSentenceTree().getChild(2).getText());
    }

    @Override
    public Boolean isPartOfCurrentBinaryExpression(Integer childReference) {
        // Return false if parent reference is not a binary expression
        if(lineMap.get(currentLine).getSentenceTree().getChildCount() != 3)
            return false;

        // Return true if child reference is part of the binary expression
        return lineMap.get(childReference).getSentenceTree().getText()
                .equals(lineMap.get(currentLine).getSentenceTree().getChild(0).getText()) ||
                lineMap.get(childReference).getSentenceTree().getText()
                        .equals(lineMap.get(currentLine).getSentenceTree().getChild(2).getText());
    }

}
