package nl.rug.proof.fol.compiler.manager;

import org.antlr.v4.runtime.tree.ParseTree;

import java.util.Set;

/**
 * Manages the advanced operations that a proof evaluator must do.
 */
public interface Manager {
    public void setCurrentLine(Integer line);
    public void setCurrentEvaluationWrong(String message);
    public void increaseLevel();
    public void decreaseLevel();
    public void addProofLine(ParseTree sentence);
    public Set<Integer> referenceSet();
    public PremiseState getPremiseState();
    public void setPremiseState(PremiseState premiseState);
    public void getLineEvaluation();
    public Integer getLevel(Integer reference);
    public Integer getCurrentLevel();
    public ParseTree getSentence(Integer reference);
    public ParseTree getCurrentSentence();
    public Boolean isReference(Integer reference);
    public Boolean isCorrect(Integer reference);
    public Boolean isValidSingleReference(Integer reference);
    public Boolean isValidRangeReference(Integer startReference, Integer endReference);
    public Boolean isCorrectBinaryExpression(Integer reference, String operator);
    public Boolean isCurrentCorrectBinaryExpression(String operator);
    public Boolean isPartOfBinaryExpression(Integer childReference, Integer parentReference);
    public Boolean isCurrentPartOfBinaryExpression(Integer parentReference);
    public Boolean isPartOfCurrentBinaryExpression(Integer childReference);
}
