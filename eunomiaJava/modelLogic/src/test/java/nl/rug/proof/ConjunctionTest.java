package nl.rug.proof;

import lombok.extern.slf4j.Slf4j;
import nl.rug.proof.fol.compiler.EunomiaCompiler;
import nl.rug.proof.fol.compiler.ProofManager;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

import static org.junit.jupiter.api.Assertions.*;

@Slf4j
public class ConjunctionTest {

    @Test
    public void testSimpleConjunctionIntroduction() {
        try {
            ProofManager manager = new ProofManager();
            EunomiaCompiler compiler = new EunomiaCompiler(manager);
            compiler.compile("testProofs/conjunction/simple_conjunction_intro.txt");

            for(Integer reference : manager.referenceSet()) {
                assertTrue(manager.isCorrect(reference));
            }

        } catch (FileNotFoundException e) {
            log.error("File not found");
        }
    }

    @Test
    public void testSimpleConjunctionElimination() {
        try {
            ProofManager manager = new ProofManager();
            EunomiaCompiler compiler = new EunomiaCompiler(manager);
            compiler.compile("testProofs/conjunction/simple_conjunction_elim.txt");

            for(Integer reference : manager.referenceSet()) {
                assertTrue(manager.isCorrect(reference));
            }

        } catch (FileNotFoundException e) {
            log.error("File not found");
        }
    }
}
