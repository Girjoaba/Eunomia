package nl.rug;

import lombok.extern.slf4j.Slf4j;
import org.jetbrains.annotations.NotNull;

/**
 * Responsible for formatting the proof.
 */
@Slf4j
public class ProofTranslator {

    private static final String SUBPROOF_START = "assume";
    private static final String SUBPROOF_END = "qed";
    private static final String PREMISE_KEYWORD = "premise";
    private static final String SEPARATOR = "---";
    private static final String FITCH_BAR = "|";
    private static final String END_LINE = "\n";

    /**
     * Formats the proof provided by the View and makes it compilable by the Model.
     * @param proof the provided proof as a String.
     * @return the formatted proof.
     */
    public static @NotNull String translate(String proof) {
        proof = proof.trim();
        proof = addPremiseKeyword(proof);
        proof = removeFitchBars(proof);
        proof = addLineNumbers(proof);
        proof = createBoxedConstants(proof);
        log.warn(proof);
        return proof;
    }

    /**
     * Adds the premise keyword to the initial premises of the proof.
     * Also adds them to the first line before the occurrence of a separator of a subproof.
     * @param proof the initial proof as a String.
     * @return the proof with the premise keywords introduced where it is required.
     */
    private static @NotNull String addPremiseKeyword(@NotNull String proof) {
        String[] lines = proof.split(END_LINE);
        StringBuilder sb = new StringBuilder();

        boolean areInitialPremises = true;

        for (int i = 0; i < lines.length; i++) {
            if(lines[i].contains(SEPARATOR)) {
                areInitialPremises = false;
                continue;
            }

            sb.append(lines[i]);
            if (areInitialPremises ||
                    (i + 1 < lines.length && lines[i + 1].contains(SEPARATOR))) {
                sb.append(" ").append(PREMISE_KEYWORD);
            }
            sb.append(END_LINE);
        }
        return sb.toString();
    }

    /**
     * Removes the fitch bars from the proof. The Fitch Bars are displayed using the pipe and dash characters.
     * The pipe characters are used to indicate the level of the subproofs inside the proof.
     * The dash characters separate the premise of a subproof from its body. The same is applied for the first premise
     * body separation.
     * @param proof the initial proof as a String.
     * @return the proof without fitch bars.
     */
    private static @NotNull String removeFitchBars(@NotNull String proof) {
        String[] lines = proof.split(END_LINE);
        StringBuilder sb = new StringBuilder();

        boolean isFirstPremise = true;      // The initial premises are not seen as a subproof.

        int lastLevel = 0;                  // To identify the end of a subproof.
        int currentLevel;

        for (String line : lines) {
            currentLevel = 0;

            line = line.trim();                         // Removes the pipes.
            while (line.contains(FITCH_BAR)) {
                line = line.substring(1);
                line = line.trim();
                currentLevel++;
            }

            if (line.contains(SEPARATOR)) {   // Ignores separating lines used to help the view of the user.
                lastLevel = currentLevel;
                continue;
            }

            if (lastLevel < currentLevel) {    // Notes the start of a subproof.
                if (isFirstPremise) {
                    isFirstPremise = false;
                } else {
                    sb.append(SUBPROOF_START).append(END_LINE);
                }
            }

            if (currentLevel < lastLevel) {             // Identifies the end of a subproof.
                sb.append(SUBPROOF_END).append(END_LINE);
            }
            lastLevel = currentLevel;

            if(!line.isBlank()) {
                sb.append(line).append(END_LINE);
            }
        }

        return sb.toString();
    }

    /**
     * Adds line numbers to the proof.
     * @param proof the proof as a String.
     * @return the proof with line numbers.
     */
    private static @NotNull String addLineNumbers(@NotNull String proof) {
        int lineNum = 1;
        String[] lines = proof.split(END_LINE);
        StringBuilder sb = new StringBuilder();
        for (String line : lines) {
            // Skips subproof syntax.
            if (!line.contains(SUBPROOF_START) && !line.contains(SUBPROOF_END)) {
                sb.append(lineNum++).append(". ").append(line).append(END_LINE);
            } else {
                sb.append(line).append(END_LINE);
            }
        }
        proof = sb.toString();
        return proof;
    }

    private static @NotNull String createBoxedConstants(@NotNull String proof) {
        String[] lines = proof.split(END_LINE);
        StringBuilder sb = new StringBuilder();
        for (String line : lines) {
            if (line.contains("[")) {
                line = line.replace("[", "|");
            }
            if (line.contains("]")) {
                line = line.replace("]", "|");
            }
            sb.append(line).append(END_LINE);
        }
        return sb.toString();
    }
}
