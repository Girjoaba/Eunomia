package nl.rug.proof.unary;

import lombok.extern.slf4j.Slf4j;
import nl.rug.proof.fol.EunomiaCompiler;
import nl.rug.proof.fol.compiler.manager.ProofManager;
import nl.rug.proof.helper.LineVerifier;
import nl.rug.utility.InputPath;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

@Slf4j
public class NegationTest {

    @Test
    public void testNegationIntro() {
        try {
            ProofManager manager = new ProofManager();
            EunomiaCompiler compiler = new EunomiaCompiler(manager);
            compiler.compile(new InputPath("testProofs/unary/negation/negation_intro.txt"));

            LineVerifier.verifyAllLinesCorrect(manager);

        } catch (FileNotFoundException e) {
            log.error("File not found");
        }
    }

    @Test
    public void testNegationElim() {
        try {
            ProofManager manager = new ProofManager();
            EunomiaCompiler compiler = new EunomiaCompiler(manager);
            compiler.compile(new InputPath("testProofs/unary/negation/negation_elim.txt"));

            LineVerifier.verifyAllLinesCorrect(manager);

        } catch (FileNotFoundException e) {
            log.error("File not found");
        }
    }
}
