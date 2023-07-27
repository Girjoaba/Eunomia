package nl.rug.proof.structure;

import lombok.extern.slf4j.Slf4j;
import nl.rug.proof.fol.EunomiaCompiler;
import nl.rug.proof.fol.compiler.manager.ProofManager;
import nl.rug.proof.checkingTools.LineVerifier;
import nl.rug.utility.InputPath;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.util.List;

@Slf4j
public class AmbiguityTest {

    /* -----------------------------------------------------------------------------------------|
     * ------------------------------------- Verify Mistakes -----------------------------------|
     * -----------------------------------------------------------------------------------------|
     */

    @Test
    public void testMultipleBinaryOperations() {
        try {
            ProofManager manager = new ProofManager();
            EunomiaCompiler compiler = new EunomiaCompiler(manager);
            compiler.compile(new InputPath("testProofs/structure/ambiguity/multipleBinaryOperations.txt"));

            LineVerifier.verifyWrongLines(manager, List.of(2));

        } catch (FileNotFoundException e) {
            log.error("File not found");
        }
    }

    @Test
    public void testMultipleBinaryParen() {
        try {
            ProofManager manager = new ProofManager();
            EunomiaCompiler compiler = new EunomiaCompiler(manager);
            compiler.compile(new InputPath("testProofs/structure/ambiguity/multipleBinaryParen.txt"));

            LineVerifier.verifyWrongLines(manager, List.of(2));

        } catch (FileNotFoundException e) {
            log.error("File not found");
        }
    }
}
