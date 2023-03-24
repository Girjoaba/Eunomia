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
public class ImplicationTest {

    @Test
    public void testImplicationIntro() {
        try {
            ProofManager manager = new ProofManager();
            EunomiaCompiler compiler = new EunomiaCompiler(manager);
            compiler.compile(new InputPath("testProofs/binary/implication/correct/implication_intro.txt"));

            LineVerifier.verifyAllLinesCorrect(manager);

        } catch (FileNotFoundException e) {
            log.error("File not found");
        }
    }
    @Test
    public void testImplicationElim() {
        try {
            ProofManager manager = new ProofManager();
            EunomiaCompiler compiler = new EunomiaCompiler(manager);
            compiler.compile(new InputPath("testProofs/binary/implication/correct/implication_elim.txt"));

            LineVerifier.verifyAllLinesCorrect(manager);

        } catch (FileNotFoundException e) {
            log.error("File not found");
        }
    }
    @Test
    public void testImplicationIntroWrongInfer() {
        try {
            ProofManager manager = new ProofManager();
            EunomiaCompiler compiler = new EunomiaCompiler(manager);
            compiler.compile(new InputPath("testProofs/binary/implication/wrong/implication_intro_wrong_infer.txt"));

            List<Integer> wrongLines = new ArrayList<>(List.of(4));
            LineVerifier.verifyWrongLines(manager, wrongLines);

        } catch (FileNotFoundException e) {
            log.error("File not found");
        }
    }
    @Test
    public void testImplicationIntroWrongInferOrder() {
        try {
            ProofManager manager = new ProofManager();
            EunomiaCompiler compiler = new EunomiaCompiler(manager);
            compiler.compile(new InputPath("testProofs/binary/implication/wrong/implication_intro_wrong_infer_order.txt"));

            List<Integer> wrongLines = new ArrayList<>(List.of(4));
            LineVerifier.verifyWrongLines(manager, wrongLines);

        } catch (FileNotFoundException e) {
            log.error("File not found");
        }
    }
    @Test
    public void testImplicationElimWrongInfer() {
        try {
            ProofManager manager = new ProofManager();
            EunomiaCompiler compiler = new EunomiaCompiler(manager);
            compiler.compile(new InputPath("testProofs/binary/implication/wrong/implication_elim_wrong_infer.txt"));

            List<Integer> wrongLines = new ArrayList<>(List.of(3));
            LineVerifier.verifyWrongLines(manager, wrongLines);

        } catch (FileNotFoundException e) {
            log.error("File not found");
        }
    }
    @Test
    public void testImplicationElimWrongInferOrder() {
        try {
            ProofManager manager = new ProofManager();
            EunomiaCompiler compiler = new EunomiaCompiler(manager);
            compiler.compile(new InputPath("testProofs/binary/implication/wrong/implication_elim_wrong_infer_order.txt"));

            List<Integer> wrongLines = new ArrayList<>(List.of(3));
            LineVerifier.verifyWrongLines(manager, wrongLines);

        } catch (FileNotFoundException e) {
            log.error("File not found");
        }
    }
    @Test
    public void testImplicationElimWrongRefOrder() {
        try {
            ProofManager manager = new ProofManager();
            EunomiaCompiler compiler = new EunomiaCompiler(manager);
            compiler.compile(new InputPath("testProofs/binary/implication/wrong/implication_elim_wrong_ref_order.txt"));

            List<Integer> wrongLines = new ArrayList<>(List.of(3));
            LineVerifier.verifyWrongLines(manager, wrongLines);

        } catch (FileNotFoundException e) {
            log.error("File not found");
        }
    }
}
