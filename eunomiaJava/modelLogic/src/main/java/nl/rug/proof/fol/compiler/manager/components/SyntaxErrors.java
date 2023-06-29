package nl.rug.proof.fol.compiler.manager.components;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Manages the syntax errors of the proof.
 */
public class SyntaxErrors {

    private static final String SYNTAX_ERROR_MESSAGE = "SYNTAX ERROR at text editor line ";
    private final Map<Integer, String> syntaxErrors;

    /**
     * Creates a new syntax manager.
     */
    public SyntaxErrors() {
        this.syntaxErrors = new HashMap<>();
    }

    /**
     * Return the lines which have an error.
     * @return the set of keys.
     */
    public Set<Integer> lineSet() {
        return syntaxErrors.keySet();
    }

    /**
     * Adds a syntax error.
     * @param line the line at which the error occurred.
     */
    public void addError(Integer line, String info) {
        syntaxErrors.put(line, SYNTAX_ERROR_MESSAGE + line + ":  " + info);
    }

    /**
     * Removes all the stored syntax errors.
     */
    public void clear() {
        syntaxErrors.clear();
    }

    /**
     * Checks if the there are any syntax errors.
     * @return true if there are no syntax errors, false otherwise.
     */
    public boolean isEmpty() {
        return syntaxErrors.isEmpty();
    }

    /**
     * Returns the error message of a line.
     * @param line the line.
     * @return the error message.
     */
    public String getErrorMessage(Integer line) {
        return syntaxErrors.get(line);
    }
}