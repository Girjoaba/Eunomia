package nl.rug;

import lombok.extern.slf4j.Slf4j;
import nl.rug.editorFrame.ProofSyntax;

@Slf4j
public class ProofFormatter {

    private static String addLineNumbers(String proof) {
        int lineNum = 1;
        String[] lines = proof.split("\n");
        StringBuilder sb = new StringBuilder();
        for (String line : lines) {
            if (!line.contains(ProofSyntax.SUBPROOF_START) && !line.contains(ProofSyntax.SUBPROOF_END)) {
                sb.append(lineNum++).append(". ").append(line).append("\n");
            } else {
                sb.append(line).append("\n");
            }
        }
        proof = sb.toString();
        return proof;
    }

    public static String format(String proof) {
        proof = addLineNumbers(proof);
        return proof;
    }
}
