package nl.rug.strategies;

import nl.rug.proof.Step;

import java.util.ArrayList;

public interface VerifyStepStrategy {

    /**
     * Verify the correctness of the given step.
     * @param steps the list of all the steps in order to verify the correctness of the given step
     */
    public void verifyStep(ArrayList<Step> steps);
}
