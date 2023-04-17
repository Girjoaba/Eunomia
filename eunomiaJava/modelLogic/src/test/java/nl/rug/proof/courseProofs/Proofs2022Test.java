package nl.rug.proof.courseProofs;

import lombok.extern.slf4j.Slf4j;
import nl.rug.proof.fol.EunomiaCompiler;
import nl.rug.proof.fol.compiler.manager.ProofManager;
import nl.rug.proof.helper.LineVerifier;
import nl.rug.utility.InputPath;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

@Slf4j
public class Proofs2022Test {
    @Test
    public void testHw1Bonus() {
        try {
            ProofManager manager = new ProofManager();
            EunomiaCompiler compiler = new EunomiaCompiler(manager);
            compiler.compile(new InputPath("courseProofs/2022/hw1/bonus.txt"));

            LineVerifier.verifyAllLinesCorrect(manager);

        } catch (FileNotFoundException e) {
            log.error("File not found");
        }
    }
}
