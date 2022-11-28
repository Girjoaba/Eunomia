package nl.rug.proof;

import nl.rug.formula.Formula;
import nl.rug.formula.Justification;
import nl.rug.formula.LogicExpression;
import nl.rug.strategies.VerifyStepStrategy;

// TODO: Update the implementation of this class (THIS IS A STUB)
public class ProofStep implements Step{

    private Integer lineNumber;
    private Integer level;
    private Formula formula;

    VerifyStepStrategy strategy;

    public ProofStep(Integer lineNumber, Integer level, Formula formula) {
        this.lineNumber = lineNumber;
        this.level = level;
        this.formula = formula;
        setStrategy();
    }

    private void setStrategy() {
        // TODO Auto-generated method stub
    }
}
