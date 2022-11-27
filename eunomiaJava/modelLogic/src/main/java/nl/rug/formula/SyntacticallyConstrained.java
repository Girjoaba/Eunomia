package nl.rug.formula;

/**
 * All the things that are syntactically constrained by some rules.
 */
public interface SyntacticallyConstrained {
    /**
     * Verify that a formula is syntactically correct.
     */
    public void verifySyntax();
}
