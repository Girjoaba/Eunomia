package nl.rug.proof;

import lombok.extern.slf4j.Slf4j;
import nl.rug.proof.fol.EunomiaCompiler;
import nl.rug.proof.fol.compiler.manager.ProofManager;
import nl.rug.proof.lineVerification.LineVerifier;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

@Slf4j
public class IdentityTest {
    @Test
    public void testIdentityIntro() {
        try {
            ProofManager manager = new ProofManager();
            EunomiaCompiler compiler = new EunomiaCompiler(manager);
            compiler.compile("testProofs/identity/correct/identity_intro.txt");

            LineVerifier.verifyAllLinesCorrect(manager);

        } catch (FileNotFoundException e) {
            log.error("File not found");
        }
    }

    @Test
    public void testIdentityElim() {
        try {
            ProofManager manager = new ProofManager();
            EunomiaCompiler compiler = new EunomiaCompiler(manager);
            compiler.compile("testProofs/identity/correct/identity_elim.txt");

            LineVerifier.verifyAllLinesCorrect(manager);

        } catch (FileNotFoundException e) {
            log.error("File not found");
        }
    }

    @Test
    public void testIdentityElimBinary() {
        try {
            ProofManager manager = new ProofManager();
            EunomiaCompiler compiler = new EunomiaCompiler(manager);
            compiler.compile("testProofs/identity/correct/identity_elim_binary.txt");

            LineVerifier.verifyAllLinesCorrect(manager);

        } catch (FileNotFoundException e) {
            log.error("File not found");
        }
    }

    @Test
    public void testIdentityIntroWrong() {
        try {
            ProofManager manager = new ProofManager();
            EunomiaCompiler compiler = new EunomiaCompiler(manager);
            compiler.compile("testProofs/identity/wrong/identity_intro_wrong.txt");

            LineVerifier.verifyAllLinesCorrect(manager);

        } catch (FileNotFoundException e) {
            log.error("File not found");
        }
    }

    @Test
    public void testIdentityElimWrong() {
        try {
            ProofManager manager = new ProofManager();
            EunomiaCompiler compiler = new EunomiaCompiler(manager);
            compiler.compile("testProofs/identity/wrong/identity_elim_wrong.txt");

            LineVerifier.verifyAllLinesCorrect(manager);

        } catch (FileNotFoundException e) {
            log.error("File not found");
        }
    }

    @Test
    public void testIdentityElimOrderWrong() {
        try {
            ProofManager manager = new ProofManager();
            EunomiaCompiler compiler = new EunomiaCompiler(manager);
            compiler.compile("testProofs/identity/wrong/identity_elim_order_wrong.txt");

            LineVerifier.verifyAllLinesCorrect(manager);

        } catch (FileNotFoundException e) {
            log.error("File not found");
        }
    }

    @Test
    public void testIdentityElimSideWrong() {
        try {
            ProofManager manager = new ProofManager();
            EunomiaCompiler compiler = new EunomiaCompiler(manager);
            compiler.compile("testProofs/identity/wrong/identity_elim_side_wrong.txt");

            LineVerifier.verifyAllLinesCorrect(manager);

        } catch (FileNotFoundException e) {
            log.error("File not found");
        }
    }

    @Test
    public void testIdentityElimBinaryWrong() {
        try {
            ProofManager manager = new ProofManager();
            EunomiaCompiler compiler = new EunomiaCompiler(manager);
            compiler.compile("testProofs/identity/wrong/identity_elim_binary_wrong.txt");

            LineVerifier.verifyAllLinesCorrect(manager);

        } catch (FileNotFoundException e) {
            log.error("File not found");
        }
    }
}