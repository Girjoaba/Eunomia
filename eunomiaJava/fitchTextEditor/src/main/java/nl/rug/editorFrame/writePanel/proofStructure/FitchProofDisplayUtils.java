package nl.rug.editorFrame.writePanel.proofStructure;

import org.jetbrains.annotations.NotNull;

/**
 * A utility class that contains all the symbols and strings that are used when displaying a Fitch proof.
 * It also contains helper methods to navigate, modify and use a Fitch proof.
 */
public class FitchProofDisplayUtils {

    /**
     * The string that the compiler uses to indicate the start of a subproof.
     */
    public static final String SUBPROOF_START = "assume";

    /**
     * The string that the compiler uses to indicate the end of a subproof.
     */
    public static final String SUBPROOF_END = "qed";

    /**
     * The string that is used to display the information presented in the name of the variable.
     */
    public static final String NEGATION_SYMBOL = "¬";

    /**
     * The string that is used to display the information presented in the name of the variable.
     */
    public static final String CONTRADICTION_SYMBOL = "⟂";

    /**
     * The string that is used to display the information presented in the name of the variable.
     */
    public static final String CONJUNCTION_SYMBOL = "∧";

    /**
     * The string that is used to display the information presented in the name of the variable.
     */
    public static final String DISJUNCTION_SYMBOL = "∨";

    /**
     * The string that is used to display the information presented in the name of the variable.
     */
    public static final String IDENTITY_SYMBOL = "=";

    /**
     * The string that is used to display the information presented in the name of the variable.
     */
    public static final String IMPLICATION_SYMBOL = "→";

    /**
     * The string that is used to display the information presented in the name of the variable.
     */
    public static final String BICONDITIONAL_SYMBOL = "↔";

    /**
     * The string that is used to display the information presented in the name of the variable.
     */
    public static final String UNIVERSAL_QUANTIFIER = "∀";

    /**
     * The string that is used to display the information presented in the name of the variable.
     */
    public static final String EXISTENTIAL_QUANTIFIER = "∃";

    /**
     * The string that is used to display the information presented in the name of the variable.
     */
    public static final String PREMISE_SEPARATOR = "---";

    /**
     * A default string for displaying a boxed constant.
     */
    public static final String CONSTANT_BOX = "[a] ";

    /**
     * Removes all the fitch bars from a string.
     * @param line the string from which the fitch bars are removed.
     * @return the string without fitch bars.
     */
    public static String removeFitchBars(String line) {
        line = line.trim();
        while (line.contains("|")) {
            line = line.substring(line.indexOf("|") + 1);
            line = line.trim();
        }
        return line;
    }

    /**
     * Decides if the line can be skipped when navigating the proof.
     * It is skipped if it does not contain any real information and is used only as visual aid for the user.
     * The cases that it encompasses are when the line is blank or a separator line is present.
     * @param line the line that is checked.
     * @return true if the line can be skipped, false otherwise.
     */
    public static @NotNull Boolean canSkipLine(@NotNull String line) {
        return removeFitchBars(line).isBlank() || line.contains(PREMISE_SEPARATOR);
    }
}
