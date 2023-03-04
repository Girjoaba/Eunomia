package nl.rug.proof.helper;

import nl.rug.proof.fol.compiler.manager.ProofManager;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class LineVerifier {

    static public void verifyAllLinesCorrect(ProofManager manager) {
        assertTrue(manager.referenceSet().stream().allMatch(manager::isCorrect));
    }

    static public void verifyWrongLines(ProofManager manager, List<Integer> wrongLines) {
        assertTrue(manager.referenceSet().stream().filter(wrongLines::contains).noneMatch(manager::isCorrect));
        assertTrue(manager.referenceSet().stream().filter(line -> !wrongLines.contains(line)).allMatch(manager::isCorrect));
    }
}
