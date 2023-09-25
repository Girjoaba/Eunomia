package nl.rug.proof.checkingTools;

import lombok.extern.slf4j.Slf4j;
import nl.rug.proof.fol.compiler.manager.ProofManager;
import nl.rug.proof.fol.compiler.manager.components.SyntaxErrors;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@Slf4j
public class LineVerifier {

    static public void verifyAllLinesCorrect(ProofManager manager) {
        assertNotEquals(0, manager.referenceSet().size(), "There are no lines to check");
        assertTrue(manager.referenceSet().stream().allMatch(manager::isCorrect));
    }

    static public void verifyWrongLines(ProofManager manager, List<Integer> wrongLines) {
        for (int wrongLine : wrongLines) {
            assertTrue(manager.referenceSet().contains(wrongLine), "Line #"+wrongLine+" is supposed to be wrong, but there is no such line");
            assertFalse(manager.isCorrect(wrongLine), "Line #"+wrongLine+" is supposed to be wrong");
        }

        // Assert that all other lines are true
        assertTrue(manager.referenceSet().stream().filter(line -> !wrongLines.contains(line)).allMatch(manager::isCorrect));
    }

    static public void verifyWrongSyntaxLines(SyntaxErrors errors, List<Integer> wrongLines) {
        assertTrue(wrongLines.containsAll(errors.lineSet()));
    }
}
