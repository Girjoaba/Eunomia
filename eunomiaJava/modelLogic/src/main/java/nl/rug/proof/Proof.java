package nl.rug.proof;

public interface Proof {

    public void addStep(Step step);
    public void verifyCorrectness();
}
