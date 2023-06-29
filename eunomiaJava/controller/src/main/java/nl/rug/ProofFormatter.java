package nl.rug;

import lombok.extern.slf4j.Slf4j;

/**
 * Responsible for formatting the proof.
 */
@Slf4j
public class ProofFormatter {

    /**
     * Adds line numbers to the proof.
     * @param proof the proof as a String.
     * @return the proof with line numbers.
     */
    private static String addLineNumbers(String proof) {
        int lineNum = 1;
        String[] lines = proof.split("\n");
        StringBuilder sb = new StringBuilder();
        for (String line : lines) {
            // Skips subproof syntax.
            if (!line.contains("assume") && !line.contains("qed")) {
                sb.append(lineNum++).append(". ").append(line).append("\n");
            } else {
                sb.append(line).append("\n");
            }
        }
        proof = sb.toString();
        return proof;
    }

    /**
     * Formats the proof provided by the View and makes it compilable by the Model.
     * @param proof the provided proof as a String.
     * @return the formatted proof.
     */
    public static String format(String proof) {
        proof = addLineNumbers(proof);
        return proof;
    }
}