package nl.rug.proof;

import lombok.extern.slf4j.Slf4j;
import nl.rug.proof.fol.EunomiaCompiler;
import nl.rug.proof.fol.compiler.manager.ProofManager;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

import static org.junit.jupiter.api.Assertions.assertTrue;

@Slf4j
public class DisjunctionTest {

    @Test
    public void testSimpleDisjunctionIntroduction() {
        try {
            ProofManager manager = new ProofManager();
            EunomiaCompiler compiler = new EunomiaCompiler(manager);
            compiler.compile("testProofs/disjunction/simple_disjunction_intro.txt");

            for(Integer reference : manager.referenceSet()) {
                assertTrue(manager.isCorrect(reference));
            }

        } catch (FileNotFoundException e) {
            log.error("File not found");
        }
    }

    @Test
    public void testSimpleDisjunctionElimination() {
        try {
            ProofManager manager = new ProofManager();
            EunomiaCompiler compiler = new EunomiaCompiler(manager);
            compiler.compile("testProofs/disjunction/simple_disjunction_elim.txt");

            for(Integer reference : manager.referenceSet()) {
                assertTrue(manager.isCorrect(reference));
            }

        } catch (FileNotFoundException e) {
            log.error("File not found");
        }
    }
}
