package nl.rug.proof.fol.compiler.commonStrings;

/**
 * A class for tracking the most common error messages.
 */
public class ErrorMessage {
    public static final String INVALID_REFERENCE = "Invalid Reference.";
    public static final String CONSTANT_ALREADY_EXISTS = "Constant already exists outside the proof.";
    public static final String VARIABLE_BOUNDED_TWICE = "Not allowed to bind the same variable twice.";
}
