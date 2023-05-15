package nl.rug.proof.fol.compiler.manager;

import lombok.extern.slf4j.Slf4j;
import nl.rug.proof.fol.compiler.commonStrings.ErrorMessage;
import nl.rug.proof.fol.grammar.GrammarNotations;
import org.antlr.v4.runtime.tree.ParseTree;

import static nl.rug.proof.fol.grammar.TreeIndexes.*;

import java.util.*;

/**
 * A manager map that solves the more complex operations of the parser.
 * The operations are tailored for evaluating a formal proof.
 */
@Slf4j
public class ProofManager {
    private final Map<Integer, ProofLine> lineMap = new HashMap<>();
    private final ConstantScope constantScope = new ConstantScope();
    private Integer currentLine = 0;
    private Integer currentLevel = 0;

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
     * If an evaluation was already attached to the line, it saves the old evaluation. This is used for the case in
     * which something is evaluated as wrong before the complete analysis of the line is done.
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

    /**
     * Save a proof line that also introduces a constant.
     * If an evaluation was already attached to the line, it saves the old evaluation. This is used for the case in
     * which something is evaluated as wrong before the complete analysis of the line is done.
     * @param sentence the sentence stored as a tree.
     * @param constant the boxed constant.
     */
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
        return lineMap.get(reference).getSentenceTree().getChild(BINARY_OPERATOR).getText().equals(operator);
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
        return lineMap.get(currentLine).getSentenceTree().getChild(BINARY_OPERATOR).getText().equals(operator);
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
                .equals(lineMap.get(parentReference).getSentenceTree().getChild(LEFT_SENTENCE).getText()) ||
                lineMap.get(childReference).getSentenceTree().getText()
                        .equals(lineMap.get(parentReference).getSentenceTree().getChild(RIGHT_SENTENCE).getText());
    }

    /**
     * Checks if a sentence is part of a binary expression.
     * @param childSentence the small sentence which might be part of the binary expression.
     * @param parentReference the binary expression which might contain the child.
     * @return if the child is part of the binary expression.
     */
    public Boolean isPartOfBinaryExpression(ParseTree childSentence, Integer parentReference) {
        // Return false if parent reference is not a binary expression
        if(lineMap.get(parentReference).getSentenceTree().getChildCount() != 3) {
            return false;
        }

        // Return true if child reference is part of the binary expression
        return childSentence.getText().equals(lineMap.get(parentReference)
                .getSentenceTree().getChild(LEFT_SENTENCE).getText())
            || childSentence.getText().equals(lineMap.get(parentReference)
                .getSentenceTree().getChild(RIGHT_SENTENCE).getText());
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
                .equals(lineMap.get(parentReference).getSentenceTree().getChild(LEFT_SENTENCE).getText()) ||
                lineMap.get(currentLine).getSentenceTree().getText()
                        .equals(lineMap.get(parentReference).getSentenceTree().getChild(RIGHT_SENTENCE).getText());
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
                .equals(lineMap.get(currentLine).getSentenceTree().getChild(LEFT_SENTENCE).getText()) ||
                lineMap.get(childReference).getSentenceTree().getText()
                        .equals(lineMap.get(currentLine).getSentenceTree().getChild(RIGHT_SENTENCE).getText());
    }

    /**
     * Tries to add a new constant to the scope.
     * Fails if the constant is not formatted as it should.
     * @param name the constant to be added
     */
    public void addConstantCurrentLevel(String name) {
        try {
            constantScope.addConstant(name, currentLevel);
        } catch (IllegalArgumentException e) {
            setCurrentEvaluationWrong(ErrorMessage.getErrorConstantDefinedWrong(name));
        }
    }

    /**
     * Verifies if the constant is already part of the scope.
     * Used before introducing a constant in a subproof.
     * @param constant the constant to be introduced.
     * @param errorMessage the error message we want to display if the constant is already part of the scope.
     */
    public void verifyConstantIntroduction(String constant, String errorMessage) {
        if(constantScope.contains(constant))  {
            setCurrentEvaluationWrong(errorMessage);
        }
    }

    /* --------------------------------------------------------------------------------------|
     * ------------------------------------- Quantifiers ------------------------------------|
     * -------------------------------------------------------------------------------------*/

    /**
     * Checks if the referenced line is a universal quantifier sentence.
     * @param reference the reference to the line.
     * @return if the line is a universal quantifier.
     */
    public boolean isNotUniversalQuantifier(Integer reference) {
        return !lineMap.get(reference).getSentenceTree().getChild(QUANTIFIER).getText()
                .equals(GrammarNotations.UNIVERSAL_QUANTIFIER);
    }

    /**
     * Checks if two sentences are equal. One has a quantifier and the other one does not.
     * @param quantifiedReference the reference to the sentence with the quantifier.
     * @param reference the reference to the sentence without the quantifier.
     * @return if the sentences are equal.
     */
    public boolean isNotEqualNoQuantifier(Integer quantifiedReference, Integer reference) {
        String quantifiedSentence = lineMap.get(quantifiedReference)
                .getSentenceTree().getChild(QUANTIFIED_SENTENCE).getText();
        String sentence = lineMap.get(reference).getSentenceTree().getText();

        quantifiedSentence = quantifiedSentence.replaceAll("\\(.*?\\)", "(Z)");
        sentence = sentence.replaceAll("\\(.*?\\)", "(Z)");

        return !quantifiedSentence.equals(sentence);
    }

    /**
     * Checks if the variable bounded by the quantifier is correctly replaced in the sentence which follows from it.
     * Used for universal quantifier elimination.
     * @param initialReference the reference to the quantified sentence.
     * @param analyzedReference the reference to the sentence which follows from the quantified sentence.
     * @param variable the variable bounded by the quantifier.
     * @return if the variable is correctly replaced.
     */
    public boolean isBoundedVariableCorrectlyReplaced(Integer initialReference, Integer analyzedReference,
                                                      String variable) {
        String initialSentence = lineMap.get(initialReference)
                .getSentenceTree().getChild(QUANTIFIED_SENTENCE).getText();
        String analyzedSentence = lineMap.get(analyzedReference).getSentenceTree().getText();

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
                if(GrammarNotations.VARIABLES.contains(analyzedSentence.charAt(i) + "")) {
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

    /**
     * Checks if the same variable is bounded by two quantifiers.
     * @param reference the reference to the sentence which is checked.
     * @return if the variable is bounded twice.
     */
    public boolean isVariableBoundedTwice(Integer reference) {
        String sentence = lineMap.get(reference).getSentenceTree().getText();

        List<String> boundedVariables = new ArrayList<>();
        sentence = sentence.replaceAll("(" + GrammarNotations.UNIVERSAL_QUANTIFIER
                + "|" +  GrammarNotations.EXISTENTIAL_QUANTIFIER + ")", "@");
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

    /**
     * Checks if the introduced constant is replaced by the appropriate variable.
     * Used for universal quantifier introduction.
     * @param introductionReference Reference to the sentence which introduces the constant.
     * @param initialReference Reference to the last sentence in the subproof. To execute the similarity check against.
     * @param changedReference The inferred sentence. It contains the variable and is used to check if it is equal to
     *                         the initial sentence with the constant replaced by the variable.
     * @return if the variable is correctly replaced.
     */
    public boolean isIntroducedVariableReplaced(Integer introductionReference, Integer initialReference,
                                                Integer changedReference) {
        String initialSentence = lineMap.get(initialReference).getSentenceTree().getText();
        String introducedConstant = lineMap.get(introductionReference).getBoxedConstant();
        String introducedVariable = lineMap.get(changedReference)
                .getSentenceTree().getChild(BOUNDED_VARIABLE).getText();

        initialSentence = replacesConstantsWithVariables(initialSentence, introducedConstant, introducedVariable);

        return lineMap.get(changedReference)
                .getSentenceTree().getChild(QUANTIFIED_SENTENCE).getText().equals(initialSentence);
    }

    /**
     * Replaces all apparitions of a constant with a variable.
     * @param initialSentence the sentence stored as a string.
     * @param introducedConstant the constant which is replaced.
     * @param introducedVariable the variable which replaces the constant.
     * @return the transformed string.
     */
    private String replacesConstantsWithVariables(String initialSentence, String introducedConstant,
                                                  String introducedVariable) {
        for(int i = 0; i < initialSentence.length() - 2; i++) {
            if(initialSentence.charAt(i) == '(' && initialSentence.charAt(i + 1) == introducedConstant.charAt(0)
                && initialSentence.charAt(i + 2) == ')') {
                initialSentence = initialSentence.substring(0, i + 1) + introducedVariable
                    + initialSentence.substring(i + 2);
            }
        }
        return initialSentence;
    }

    /**
     * Checks if the referred line is an existentially quantified sentence.
     * @param reference the reference to the line.
     * @return if the line is an existentially quantified sentence.
     */
    public boolean isNotExistentialQuantifier(Integer reference) {
        return !lineMap.get(reference).getSentenceTree().getChild(QUANTIFIER).getText()
                .equals(GrammarNotations.EXISTENTIAL_QUANTIFIER);
    }

    /**
     * Checks if only one constant is replaced when performing existential quantifier introduction.
     * @param initialReference the reference to the quantified sentence.
     * @param changedReference the reference to the inferred sentence.
     * @return if only one constant is replaced.
     */
    public boolean isOnlyOneConstantReplaced(Integer initialReference, Integer changedReference) {
        String initialSentence = lineMap.get(initialReference).getSentenceTree().getText();
        String changedSentence = lineMap.get(changedReference).getSentenceTree().getChild(QUANTIFIED_SENTENCE).getText();

        Set<Character> initialConstants = createConstantSet(initialSentence);
        Set<Character> changedConstants = createConstantSet(changedSentence);

        return initialConstants.size() - 1 == changedConstants.size();
    }

    private Set<Character> createConstantSet(String changedSentence) {
        Set<Character> changedConstants = new HashSet<>();
        for(int i = 0; i < changedSentence.length() - 2; i++) {
            if(changedSentence.charAt(i) == '('
                    && !GrammarNotations.VARIABLES.contains(changedSentence.charAt(i + 1) + "")
                    && changedSentence.charAt(i + 2) == ')') {
                changedConstants.add(changedSentence.charAt(i + 1));
            }
        }
        return changedConstants;
    }

    /**
     * Checks if the premise of the subproof replaces the bounded variable correctly.
     * Also sets the evaluation of the sentence as wrong if the variable is not replaced correctly.
     * @param initialReference the reference to the quantified sentence.
     * @param introductionReference the reference to the sentence which introduces the constant.
     */
    public void isIntroducedConstantReplacingCorrectly(Integer initialReference, Integer introductionReference) {
        String quantifiedVariable = lineMap.get(initialReference)
                .getSentenceTree().getChild(BOUNDED_VARIABLE).getText();
        String initialSentence = lineMap.get(initialReference)
                .getSentenceTree().getChild(QUANTIFIED_SENTENCE).getText();
        String introducedConstant = lineMap.get(introductionReference).getBoxedConstant();

        initialSentence = replacesConstantsWithVariables(initialSentence, quantifiedVariable, introducedConstant);

        if(!lineMap.get(introductionReference).getSentenceTree().getText().equals(initialSentence)) {
            lineMap.get(introductionReference)
                    .setWrongEvaluation(ErrorMessage.CONSTANT_DOES_NOT_REPLACE_CORRECTLY_VARIABLE);
        }
    }

    /**
     * Checks that the constants introduced in the subproof of an existential elimination are eliminated outside the
     * subproof. Used in existential elimination.
     * @param introducingReference Reference to the sentence which introduces the constant.
     *                             Used for getting the constant.
     * @param finalReference Reference to the sentence outside the subproof for checking if the constant is eliminated.
     * @return if the constant is eliminated.
     */
    public boolean removedIntroducedConstants(Integer introducingReference, Integer finalReference) {
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

    public String getErrorMessage(Integer line) {
        return lineMap.get(line).getErrorMessage();
    }

    public void clear() {
        lineMap.clear();
        constantScope.clear();
        currentLine = 0;
        currentLevel = 0;
    }
}
