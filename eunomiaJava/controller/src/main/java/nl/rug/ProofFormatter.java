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

    private static int countWhitespace(String line) {
        int count = 0;
        for (char c : line.toCharArray()) {
            if (c == ' ') {
                count++;
            } else if (c == '\t') {
                count += 4;
            } else {
                break;
            }
        }
        return count;
    }

    /**
     * Adds subproof syntax to the proof taking into consideration whitespace significance.
     * @param proof the proof as a String.
     * @return the proof with subproof syntax.
     */
    private static String evaluateSignificantWhitespace(String proof) {
        int indent = 0;
        int nextIdent = 0;
        String prevLine = "";
        StringBuilder sb = new StringBuilder();
        String[] lines = proof.split("\n");

        prevLine = lines[0];
        indent = countWhitespace(prevLine);

        for (int i = 1; i < lines.length; i++) {
            String line = lines[i];
            nextIdent = countWhitespace(line);
            sb.append(prevLine).append("\n");
            if (nextIdent > indent) {
                sb.append("assume\n");
            } else if (nextIdent < indent) {
                sb.append("qed\n");
            }
            prevLine = line;
            indent = nextIdent;
        }
        sb.append(prevLine);

        proof = sb.toString();
        return proof;
    }

    /**
     * Formats the proof provided by the View and makes it compilable by the Model.
     * @param proof the provided proof as a String.
     * @return the formatted proof.
     */
    public static String format(String proof) {
        proof = evaluateSignificantWhitespace(proof);
        log.error(proof);
        proof = addLineNumbers(proof);
        return proof;
    }
}
