package nl.rug.proof.fol.compiler.manager;

import lombok.extern.slf4j.Slf4j;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.*;

/**
 * A manager map that solves the more complex operations of the parser.
 * The operations are tailored for evaluating a formal proof.
 */
@Slf4j
public class ProofManager {
    private final Map<Integer, ProofLine> lineMap = new HashMap<>();

    private Integer currentLine = 0;
    private Integer currentLevel = 0;

    /**
     * Goes to the next line in the proof.
     * @param line the line number.
     */
    public void setCurrentLine(Integer line) {
        currentLine = line;
    }

    /**
     * Sets the current line as being incorrect.
     * @param message the error message explaining why the line is incorrect.
     */
    public void setCurrentEvaluationWrong(String message) {
        lineMap.get(currentLine).setWrongEvaluation(message);
    }

    /**
     * Marks the beginning of a subproof by increasing the level.
     */
    public void increaseLevel() {
        currentLevel++;
    }

    /**
     * Marks the ending of a subproof by decreasing the level.
     */
    public void decreaseLevel() {
        currentLevel--;
    }

    /**
     * Save a proof line.
     * @param sentence the sentence stored as a tree.
     */
    public void addProofLine(ParseTree sentence) {
        if (!lineMap.containsKey(currentLine)) {
            lineMap.put(currentLine, new ProofLine(currentLine, currentLevel, sentence));
        } else {
            lineMap.put(currentLine, new ProofLine(currentLine, currentLevel, sentence,
                lineMap.get(currentLine).getEvaluation()));
        }
    }

    /**
     * Returns the set of all the indices acting as references.
     * @return the set of references.
     */
    public Set<Integer> referenceSet() {
        return lineMap.keySet();
    }

    /**
     * Get the sentence at a given line.
     * @param reference the reference to that line.
     * @return the sentence as a tree.
     */
    public ParseTree getSentence(Integer reference) {
        return lineMap.get(reference).getSentenceTree();
    }

    /**
     * Get the current sentence.
     * @return the current sentence as a tree.
     */
    public ParseTree getCurrentSentence() {
        return lineMap.get(currentLine).getSentenceTree();
    }

    /**
     * Checks if a given line is correct.
     * @param reference the reference to that line.
     * @return correctness of the line.
     */
    public Boolean isCorrect(Integer reference) {
        return lineMap.get(reference).isCorrect();
    }

    /**
     * Checks if a single reference is valid.
     * @param reference the reference.
     * @return validity of the reference.
     */
    public Boolean isValidSingleReference(Integer reference) {
        return lineMap.containsKey(reference) && (lineMap.get(reference).getLevel() <= currentLevel);
    }

    /**
     * Checks if the range of references is valid.
     * @param startReference the start of the range as an Integer.
     * @param endReference the end of the range as an Integer.
     * @return validity of the range.
     */
    public Boolean isValidRangeReference(Integer startReference, Integer endReference) {
        return  lineMap.containsKey(startReference) && lineMap.containsKey(endReference)
                && (lineMap.get(startReference).getLevel().equals(lineMap.get(endReference).getLevel()))
                && (lineMap.get(startReference).getLevel() - 1 == currentLevel);
    }

    /**
     * Checks if a binary expression is correct.
     * @param reference the reference to that binary expression.
     * @param operator the operator which separates that binary expression.
     * @return the correctness of the binary expression given by the operator and its structure.
     */
    public Boolean isCorrectBinaryExpression(Integer reference, String operator) {
        if(lineMap.get(reference).getSentenceTree().getChildCount() != 3) {
            return false;
        }
        return lineMap.get(reference).getSentenceTree().getChild(1).getText().equals(operator);
    }

    /**
     * Checks if the current line is a correct binary expression.
     * @param operator the operator which separates the current binary expression.
     * @return if the current line is a correct binary expression.
     */
    public Boolean isCurrentCorrectBinaryExpression(String operator) {
        if(lineMap.get(currentLine).getSentenceTree().getChildCount() != 3) {
            return false;
        }
        return lineMap.get(currentLine).getSentenceTree().getChild(1).getText().equals(operator);
    }

    /**
     * Checks if a specified line is part of a binary expression.
     * @param childReference the line that is checked to be part of the binary expression.
     * @param parentReference the expression that is checked to contain the child.
     * @return if the child is part of the binary expression.
     */
    public Boolean isPartOfBinaryExpression(Integer childReference, Integer parentReference) {
        // Return false if parent reference is not a binary expression
        if(lineMap.get(parentReference).getSentenceTree().getChildCount() != 3) {
            return false;
        }

        // Return true if child reference is part of the binary expression
        return lineMap.get(childReference).getSentenceTree().getText()
                .equals(lineMap.get(parentReference).getSentenceTree().getChild(0).getText()) ||
                lineMap.get(childReference).getSentenceTree().getText()
                        .equals(lineMap.get(parentReference).getSentenceTree().getChild(2).getText());
    }

    public Boolean isPartOfBinaryExpression(ParseTree childSentence, Integer parentReference) {
        // Return false if parent reference is not a binary expression
        if(lineMap.get(parentReference).getSentenceTree().getChildCount() != 3) {
            return false;
        }

        // Return true if child reference is part of the binary expression
        return childSentence.getText().equals(lineMap.get(parentReference).getSentenceTree().getChild(0).getText())
            || childSentence.getText().equals(lineMap.get(parentReference).getSentenceTree().getChild(2).getText());
    }

    /**
     * Checks if the current line is part of a binary expression.
     * @param parentReference the expression that is checked to contain the current line.
     * @return if the current line is part of the binary expression.
     */
    public Boolean isCurrentPartOfBinaryExpression(Integer parentReference) {
        // Return false if parent reference is not a binary expression
        if(lineMap.get(parentReference).getSentenceTree().getChildCount() != 3) {
            return false;
        }

        // Return true if child reference is part of the binary expression
        return lineMap.get(currentLine).getSentenceTree().getText()
                .equals(lineMap.get(parentReference).getSentenceTree().getChild(0).getText()) ||
                lineMap.get(currentLine).getSentenceTree().getText()
                        .equals(lineMap.get(parentReference).getSentenceTree().getChild(2).getText());
    }

    /**
     * Checks if the current line is part of a binary expression.
     * @param childReference the line that is checked to be part of the binary expression.
     * @return if the current line is part of the binary expression.
     */
    public Boolean isPartOfCurrentBinaryExpression(Integer childReference) {
        // Return false if parent reference is not a binary expression
        if(lineMap.get(currentLine).getSentenceTree().getChildCount() != 3) {
            return false;
        }

        // Return true if child reference is part of the binary expression
        return lineMap.get(childReference).getSentenceTree().getText()
                .equals(lineMap.get(currentLine).getSentenceTree().getChild(0).getText()) ||
                lineMap.get(childReference).getSentenceTree().getText()
                        .equals(lineMap.get(currentLine).getSentenceTree().getChild(2).getText());
    }

    public Boolean isPartOfCurrentBinaryExpression(ParseTree childTree) {
        // Return false if parent reference is not a binary expression
        if(lineMap.get(currentLine).getSentenceTree().getChildCount() != 3) {
            return false;
        }

        // Return true if child reference is part of the binary expression
        return childTree.getText().equals(lineMap.get(currentLine).getSentenceTree().getChild(0).getText())
            || childTree.getText().equals(lineMap.get(currentLine).getSentenceTree().getChild(2).getText());
    }

//    public void printWrongLines() {
//        for (Map.Entry<Integer, ProofLine> entry : lineMap.entrySet()) {
//            if (!entry.getValue().isCorrect()) {
//                System.out.println(entry.getKey() + " " + entry.getValue().get);
//            }
//        }
//    }

}
