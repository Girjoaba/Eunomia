package nl.rug.proof.binary;

import lombok.extern.slf4j.Slf4j;
import nl.rug.proof.fol.EunomiaCompiler;
import nl.rug.proof.fol.compiler.manager.ProofManager;
import nl.rug.proof.helper.LineVerifier;
import nl.rug.utility.InputPath;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

@Slf4j
public class IdentityTest {


    /* -----------------------------------------------------------------------------------------|
     * --------------------------------------- Correct Tests -----------------------------------|
     * -----------------------------------------------------------------------------------------|
     */

    @Test
    public void testIdentityIntro() {
        try {
            ProofManager manager = new ProofManager();
            EunomiaCompiler compiler = new EunomiaCompiler(manager);
            compiler.compile(new InputPath("testProofs/binary/identity/correct/identity_intro.txt"));

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
            compiler.compile(new InputPath("testProofs/binary/identity/correct/identity_elim.txt"));

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
            compiler.compile(new InputPath("testProofs/binary/identity/correct/identity_elim_binary.txt"));

            LineVerifier.verifyAllLinesCorrect(manager);

        } catch (FileNotFoundException e) {
            log.error("File not found");
        }
    }

    @Test
    public void testIdentityElimInFunction() {
        try {
            ProofManager manager = new ProofManager();
            EunomiaCompiler compiler = new EunomiaCompiler(manager);
            compiler.compile(new InputPath("testProofs/binary/identity/correct/identity_elim_in_function.txt"));

            LineVerifier.verifyAllLinesCorrect(manager);

        } catch (FileNotFoundException e) {
            log.error("File not found");
        }
    }

    @Test
    public void testIdentityIntroFunction() {
        try {
            ProofManager manager = new ProofManager();
            EunomiaCompiler compiler = new EunomiaCompiler(manager);
            compiler.compile(new InputPath("testProofs/binary/identity/correct/identity_intro_function.txt"));

            LineVerifier.verifyAllLinesCorrect(manager);

        } catch (FileNotFoundException e) {
            log.error("File not found");
        }
    }

    /* -----------------------------------------------------------------------------------------|
     * --------------------------------------- Wrong Tests -------------------------------------|
     * -----------------------------------------------------------------------------------------|
     */

    @Test
    public void testIdentityIntroWrong() {
        try {
            ProofManager manager = new ProofManager();
            EunomiaCompiler compiler = new EunomiaCompiler(manager);
            compiler.compile(new InputPath("testProofs/binary/identity/wrong/identity_intro_wrong.txt"));

            List<Integer> wrongLines = new ArrayList<>(List.of(1));
            LineVerifier.verifyWrongLines(manager, wrongLines);

        } catch (FileNotFoundException e) {
            log.error("File not found");
        }
    }

    @Test
    public void testIdentityElimWrong() {
        try {
            ProofManager manager = new ProofManager();
            EunomiaCompiler compiler = new EunomiaCompiler(manager);
            compiler.compile(new InputPath("testProofs/binary/identity/wrong/identity_elim_wrong.txt"));

            List<Integer> wrongLines = new ArrayList<>(List.of(3));
            LineVerifier.verifyWrongLines(manager, wrongLines);

        } catch (FileNotFoundException e) {
            log.error("File not found");
        }
    }

    @Test
    public void testIdentityElimOrderWrong() {
        try {
            ProofManager manager = new ProofManager();
            EunomiaCompiler compiler = new EunomiaCompiler(manager);
            compiler.compile(new InputPath("testProofs/binary/identity/wrong/identity_elim_order_wrong.txt"));

            List<Integer> wrongLines = new ArrayList<>(List.of(3));
            LineVerifier.verifyWrongLines(manager, wrongLines);

        } catch (FileNotFoundException e) {
            log.error("File not found");
        }
    }

    @Test
    public void testIdentityElimSideWrong() {
        try {
            ProofManager manager = new ProofManager();
            EunomiaCompiler compiler = new EunomiaCompiler(manager);
            compiler.compile(new InputPath("testProofs/binary/identity/wrong/identity_elim_side_wrong.txt"));

            List<Integer> wrongLines = new ArrayList<>(List.of(3));
            LineVerifier.verifyWrongLines(manager, wrongLines);

        } catch (FileNotFoundException e) {
            log.error("File not found");
        }
    }

    @Test
    public void testIdentityElimBinaryWrong() {
        try {
            ProofManager manager = new ProofManager();
            EunomiaCompiler compiler = new EunomiaCompiler(manager);
            compiler.compile(new InputPath("testProofs/binary/identity/wrong/identity_elim_binary_wrong.txt"));

            List<Integer> wrongLines = new ArrayList<>(List.of(3));
            LineVerifier.verifyWrongLines(manager, wrongLines);

        } catch (FileNotFoundException e) {
            log.error("File not found");
        }
    }

    @Test
    public void testIdentityElimInFunctionWrong() {
        try {
            ProofManager manager = new ProofManager();
            EunomiaCompiler compiler = new EunomiaCompiler(manager);
            compiler.compile(new InputPath("testProofs/binary/identity/wrong/identity_elim_in_function_wrong.txt"));

            List<Integer> wrongLines = new ArrayList<>(List.of(3));
            LineVerifier.verifyWrongLines(manager, wrongLines);

        } catch (FileNotFoundException e) {
            log.error("File not found");
        }
    }

    @Test
    public void testIdentityElimInFunctionOrderWrong() {
        try {
            ProofManager manager = new ProofManager();
            EunomiaCompiler compiler = new EunomiaCompiler(manager);
            compiler.compile(new InputPath("testProofs/binary/identity/wrong/identity_elim_in_function_order_wrong.txt"));

            List<Integer> wrongLines = new ArrayList<>(List.of(3));
            LineVerifier.verifyWrongLines(manager, wrongLines);

        } catch (FileNotFoundException e) {
            log.error("File not found");
        }
    }

    @Test
    public void testIdentityElimInFunctionReferenceWrong() {
        try {
            ProofManager manager = new ProofManager();
            EunomiaCompiler compiler = new EunomiaCompiler(manager);
            compiler.compile(new InputPath("testProofs/binary/identity/wrong/identity_elim_in_function_reference_wrong.txt"));

            List<Integer> wrongLines = new ArrayList<>(List.of(3));
            LineVerifier.verifyWrongLines(manager, wrongLines);

        } catch (FileNotFoundException e) {
            log.error("File not found");
        }
    }
}
