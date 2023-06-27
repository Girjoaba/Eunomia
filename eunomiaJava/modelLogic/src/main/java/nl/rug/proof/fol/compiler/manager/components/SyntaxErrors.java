package nl.rug.proof.fol.compiler.manager.components;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Manages the syntax errors of the proof.
 */
public class SyntaxErrors {
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
     * @param message the message of the error.
     */
    public void addError(Integer line, String message) {
        syntaxErrors.put(line, message);
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
}
