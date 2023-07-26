package nl.rug.editorFrame.writePanel.proofStructure;

import org.jetbrains.annotations.NotNull;

public class FitchProofDisplayUtils {

    public static final String SUBPROOF_START = "assume";
    public static final String SUBPROOF_END = "qed";
    public static final String NEGATION_SYMBOL = "¬";
    public static final String CONTRADICTION_SYMBOL = "⟂";
    public static final String CONJUNCTION_SYMBOL = "∧";
    public static final String DISJUNCTION_SYMBOL = "∨";
    public static final String IDENTITY_SYMBOL = "=";
    public static final String IMPLICATION_SYMBOL = "→";
    public static final String BICONDITIONAL_SYMBOL = "↔";
    public static final String UNIVERSAL_QUANTIFIER = "∀";
    public static final String EXISTENTIAL_QUANTIFIER = "∃";
    public static final String PREMISE_SEPARATOR = "---";

    public static String removeFitchBars(String line_text) {
        line_text = line_text.trim();
        while (line_text.contains("|")) {
            line_text = line_text.substring(line_text.indexOf("|") + 1);
            line_text = line_text.trim();
        }
        return line_text;
    }

    public static Boolean canSkipLine(@NotNull String line_text) {
        return removeFitchBars(line_text).isBlank() || line_text.contains(PREMISE_SEPARATOR);
    }
}
