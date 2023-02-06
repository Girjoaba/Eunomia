package nl.rug.proof;

import lombok.extern.slf4j.Slf4j;
import nl.rug.proof.fol.EunomiaCompiler;
import nl.rug.proof.fol.compiler.manager.ProofManager;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@Slf4j
public class SubproofTest {
    @Test
    public void testSubproofBasic() {
        try {
            ProofManager manager = new ProofManager();
            EunomiaCompiler compiler = new EunomiaCompiler(manager);
            compiler.compile("testProofs/subproof/subproof_basic.txt");

            for(int i = 1; i <= 3; i++) {
                assertTrue(manager.isCorrect(i));
            }
            assertFalse(manager.isCorrect(4));

        } catch (FileNotFoundException e) {
            log.error("File not found");
        }
    }

    @Test
    public void testNestedSubproof() {
        try {
            ProofManager manager = new ProofManager();
            EunomiaCompiler compiler = new EunomiaCompiler(manager);
            compiler.compile("testProofs/subproof/nested_subproof.txt");

            for(int i = 1; i <= 6; i++) {
                assertTrue(manager.isCorrect(i));
            }
            assertFalse(manager.isCorrect(7));
            assertFalse(manager.isCorrect(8));

        } catch (FileNotFoundException e) {
            log.error("File not found");
        }
    }
}
