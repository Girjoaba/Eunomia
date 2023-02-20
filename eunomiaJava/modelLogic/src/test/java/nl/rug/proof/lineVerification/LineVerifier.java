package nl.rug.proof.lineVerification;

import nl.rug.proof.fol.compiler.manager.Manager;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class LineVerifier {

    static public void verifyAllLinesCorrect(Manager manager) {
        assertTrue(manager.referenceSet().stream().allMatch(manager::isCorrect));
    }

    static public void verifyWrongLines(Manager manager, List<Integer> wrongLines) {
        assertTrue(manager.referenceSet().stream().filter(wrongLines::contains).noneMatch(manager::isCorrect));
        assertTrue(manager.referenceSet().stream().filter(line -> !wrongLines.contains(line)).allMatch(manager::isCorrect));
    }
}
