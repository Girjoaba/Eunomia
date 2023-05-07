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
    ConstantScope constantScope = new ConstantScope();
    private Integer currentLine = 0;
    private Integer currentLevel = 0;

    private final String VARIABLE_STRING = "tuvwxyz";

    public Integer getCurrentLine() {
        return currentLine;
    }

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
        constantScope.removeHigherLevelConstants(currentLevel);
    }

    /**
     * Save a proof line.
     * @param sentence the sentence stored as a tree.
     */
    public void addProofLine(ParseTree sentence) {
        if (!lineMap.containsKey(currentLine)) {
            lineMap.put(currentLine, new ProofLine(currentLine, currentLevel, sentence));
        } else {
            if(lineMap.get(currentLine).getBoxedConstant() != null) {
                lineMap.put(currentLine, new ProofLine(currentLine, currentLevel, sentence,
                        lineMap.get(currentLine).getEvaluation(), lineMap.get(currentLine).getBoxedConstant()));
            } else {
                lineMap.put(currentLine, new ProofLine(currentLine, currentLevel, sentence,
                        lineMap.get(currentLine).getEvaluation()));
            }

        }
    }

    public void addProofLine(ParseTree sentence, String constant) {
        if (!lineMap.containsKey(currentLine)) {
            lineMap.put(currentLine, new ProofLine(currentLine, currentLevel, sentence, constant));
        } else {
            lineMap.put(currentLine, new ProofLine(currentLine, currentLevel, sentence,
                lineMap.get(currentLine).getEvaluation(), constant));
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

    public void addConstantCurrentLevel(String name) {
        try {
            constantScope.addConstant(name, currentLevel);
        } catch (IllegalArgumentException e) {
            setCurrentEvaluationWrong("Constant " + name + " typed wrong.");
        }
    }

    public void verifyConstantIntroduction(String constant, String errorMessage) {
        if(constantScope.contains(constant))  {
            setCurrentEvaluationWrong(errorMessage);
        }
    }

    /* --------------------------------------------------------------------------------------|
     * ------------------------------------- Quantifiers ------------------------------------|
     * -------------------------------------------------------------------------------------*/

    public boolean isUniversalQuantifier(Integer reference) {
        return lineMap.get(reference).getSentenceTree().getChild(0).getText().equals("\\forall");
    }

    public boolean isEqualNoQuantifier(Integer quantifiedReference, Integer reference) {
        String quantifiedSentence = lineMap.get(quantifiedReference).getSentenceTree().getChild(2).getText();
        String sentence = lineMap.get(reference).getSentenceTree().getText();

        quantifiedSentence = quantifiedSentence.replaceAll("\\(.*?\\)", "(Z)");
        sentence = sentence.replaceAll("\\(.*?\\)", "(Z)");

        return quantifiedSentence.equals(sentence);
    }

    public boolean isBoundedVariableCorrectlyReplaced(Integer initialReference, Integer analyzedReference, String variable) {
        String initialSentence = lineMap.get(initialReference).getSentenceTree().getChild(2).getText();
        String analyzedSentence = lineMap.get(analyzedReference).getSentenceTree().getText();

        // Remember the indexes of all the replacements
        List<Integer> replacementsIndexes = new ArrayList<>();

        for(int i = 0; i < initialSentence.length() - 2; i++) {
            if(initialSentence.charAt(i) == '(' && initialSentence.charAt(i + 1) == variable.charAt(0)
                && initialSentence.charAt(i + 2) == ')') {
                replacementsIndexes.add(i + 1);
                initialSentence = initialSentence.substring(0, i + 1) + "Z" + initialSentence.substring(i + 2);
            }
        }

        char firstReplacement = analyzedSentence.charAt(replacementsIndexes.get(0));
        for(int i = 0; i < analyzedSentence.length() - 1; i++) {
            if(replacementsIndexes.contains(i)) {
                if(VARIABLE_STRING.contains(analyzedSentence.charAt(i) + "")) {
                    return false;
                }
                if(firstReplacement != analyzedSentence.charAt(i)) {
                    return false;
                }

                analyzedSentence = analyzedSentence.substring(0, i) + "Z" + analyzedSentence.substring(i + 1);
            }
        }
        return initialSentence.equals(analyzedSentence);
    }

    public boolean isVariableBoundedTwice(Integer reference) {
        String sentence = lineMap.get(reference).getSentenceTree().getText();

        List<String> boundedVariables = new ArrayList<>();
        sentence = sentence.replaceAll("(\\forall | \\exists)", "@");
        for(int i = 0; i < sentence.length() - 1; i++) {
            if(sentence.charAt(i) == '@') {
                if(boundedVariables.contains(sentence.charAt(i + 1) + "")) {
                    return false;
                }
                boundedVariables.add(sentence.charAt(i + 1) + "");
            }
        }

        return true;
    }

    public boolean isIntroducedVariableReplaced(Integer introductionReference, Integer initialReference, Integer changedReference) {
        String initialSentence = lineMap.get(initialReference).getSentenceTree().getText();
        String introducedConstant = lineMap.get(introductionReference).getBoxedConstant();
        String introducedVariable = lineMap.get(changedReference).getSentenceTree().getChild(1).getText();

        for(int i = 0; i < initialSentence.length() - 2; i++) {
            if(initialSentence.charAt(i) == '(' && initialSentence.charAt(i + 1) == introducedConstant.charAt(0)
                && initialSentence.charAt(i + 2) == ')') {
                initialSentence = initialSentence.substring(0, i + 1) + introducedVariable
                    + initialSentence.substring(i + 2);
            }
        }

        return lineMap.get(changedReference).getSentenceTree().getChild(2).getText().equals(initialSentence);
    }

    public boolean isExistentialQuantifier(Integer reference) {
        return lineMap.get(reference).getSentenceTree().getChild(0).getText().equals("\\exists");
    }

    public boolean isOnlyOneConstantReplaced(Integer initialReference, Integer changedReference) {
        String initialSentence = lineMap.get(initialReference).getSentenceTree().getText();
        String changedSentence = lineMap.get(changedReference).getSentenceTree().getChild(2).getText();

        Set<Character> initialConstants = createConstantSet(initialSentence);
        Set<Character> changedConstants = createConstantSet(changedSentence);

        return initialConstants.size() - 1 == changedConstants.size();
    }

    private Set<Character> createConstantSet(String changedSentence) {
        Set<Character> changedConstants = new HashSet<>();
        for(int i = 0; i < changedSentence.length() - 2; i++) {
            if(changedSentence.charAt(i) == '(' && !VARIABLE_STRING.contains(changedSentence.charAt(i + 1) + "")
                    && changedSentence.charAt(i + 2) == ')') {
                changedConstants.add(changedSentence.charAt(i + 1));
            }
        }
        return changedConstants;
    }

    public void isIntroducedConstantReplacingCorrectly(Integer initialReference, Integer introductionReference) {
        String quantifiedVariable = lineMap.get(initialReference).getSentenceTree().getChild(1).getText();
        String initialSentence = lineMap.get(initialReference).getSentenceTree().getChild(2).getText();
        String introducedConstant = lineMap.get(introductionReference).getBoxedConstant();

        for(int i = 0; i < initialSentence.length() - 2; i++) {
            if(initialSentence.charAt(i) == '(' && initialSentence.charAt(i + 1) == quantifiedVariable.charAt(0)
                    && initialSentence.charAt(i + 2) == ')') {
                initialSentence = initialSentence.substring(0, i + 1) + introducedConstant
                        + initialSentence.substring(i + 2);
            }
        }

        if(!lineMap.get(introductionReference).getSentenceTree().getText().equals(initialSentence)) {
            lineMap.get(introductionReference)
                    .setWrongEvaluation("The introduced constant is not replacing correctly the variable.");
        }
    }

    public boolean removedIntroducedConstatn(Integer introducingReference, Integer finalReference) {
        String introducedConstant = lineMap.get(introducingReference).getBoxedConstant();
        String finalSentence = lineMap.get(finalReference).getSentenceTree().getText();

        for(int i = 0; i < finalSentence.length() - 2; i++) {
            if(finalSentence.charAt(i) == '(' && finalSentence.charAt(i + 1) == introducedConstant.charAt(0)
                    && finalSentence.charAt(i + 2) == ')') {
                return false;
            }
        }

        return true;
    }
}
