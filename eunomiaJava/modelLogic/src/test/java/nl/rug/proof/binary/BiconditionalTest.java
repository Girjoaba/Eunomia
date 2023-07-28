package nl.rug.proof.binary;

import lombok.extern.slf4j.Slf4j;
import nl.rug.proof.fol.EunomiaCompiler;
import nl.rug.proof.fol.compiler.manager.ProofManager;
import nl.rug.proof.checkingTools.LineVerifier;
import nl.rug.utility.InputPath;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

@Slf4j
public class BiconditionalTest {

    /* -----------------------------------------------------------------------------------------|
     * ---------------------------------- Verify Correctness -----------------------------------|
     * -----------------------------------------------------------------------------------------|
     */

    @Test
    public void testBiconditionalIntro() {
        try {
            ProofManager manager = new ProofManager();
            EunomiaCompiler compiler = new EunomiaCompiler(manager);
            compiler.compile(new InputPath("testProofs/binary/biconditional/correct/biconditional_intro.txt"));

            LineVerifier.verifyAllLinesCorrect(manager);

        } catch (FileNotFoundException e) {
            log.error("File not found");
        }
    }
    @Test
    public void testBiconditionalIntroReverse() {
        try {
            ProofManager manager = new ProofManager();
            EunomiaCompiler compiler = new EunomiaCompiler(manager);
            compiler.compile(new InputPath("testProofs/binary/biconditional/correct/biconditional_intro_reverse.txt"));

            LineVerifier.verifyAllLinesCorrect(manager);

        } catch (FileNotFoundException e) {
            log.error("File not found");
        }
    }
    @Test
    public void testBiconditionalElim() {
        try {
            ProofManager manager = new ProofManager();
            EunomiaCompiler compiler = new EunomiaCompiler(manager);
            compiler.compile(new InputPath("testProofs/binary/biconditional/correct/biconditional_elim.txt"));

            LineVerifier.verifyAllLinesCorrect(manager);

        } catch (FileNotFoundException e) {
            log.error("File not found");
        }
    }
    @Test
    public void testBiconditionalElimReverse() {
        try {
            ProofManager manager = new ProofManager();
            EunomiaCompiler compiler = new EunomiaCompiler(manager);
            compiler.compile(new InputPath("testProofs/binary/biconditional/correct/biconditional_elim_reverse.txt"));

            LineVerifier.verifyAllLinesCorrect(manager);

        } catch (FileNotFoundException e) {
            log.error("File not found");
        }
    }

    /* -----------------------------------------------------------------------------------------|
     * ------------------------------------- Verify Mistakes -----------------------------------|
     * -----------------------------------------------------------------------------------------|
     */

    @Test
    public void testBiconditionalIntroWrongConclSub() {
        try {
            ProofManager manager = new ProofManager();
            EunomiaCompiler compiler = new EunomiaCompiler(manager);
            compiler.compile(new InputPath("testProofs/binary/biconditional/wrong/biconditional_intro_wrong_concl_sub.txt"));

            List<Integer> wrongLines = new ArrayList<>(List.of(7));
            LineVerifier.verifyWrongLines(manager, wrongLines);

        } catch (FileNotFoundException e) {
            log.error("File not found");
        }
    }
    @Test
    public void testBiconditionalIntroWrongInfer() {
        try {
            ProofManager manager = new ProofManager();
            EunomiaCompiler compiler = new EunomiaCompiler(manager);
            compiler.compile(new InputPath("testProofs/binary/biconditional/wrong/biconditional_intro_wrong_infer.txt"));

            List<Integer> wrongLines = new ArrayList<>(List.of(7));
            LineVerifier.verifyWrongLines(manager, wrongLines);

        } catch (FileNotFoundException e) {
            log.error("File not found");
        }
    }
    @Test
    public void testBiconditionalIntroWrongPremiseSub() {
        try {
            ProofManager manager = new ProofManager();
            EunomiaCompiler compiler = new EunomiaCompiler(manager);
            compiler.compile(new InputPath("testProofs/binary/biconditional/wrong/biconditional_intro_wrong_premise_sub.txt"));

            List<Integer> wrongLines = new ArrayList<>(List.of(7));
            LineVerifier.verifyWrongLines(manager, wrongLines);

        } catch (FileNotFoundException e) {
            log.error("File not found");
        }
    }
    @Test
    public void testBiconditionalIntroWrongSameSub() {
        try {
            ProofManager manager = new ProofManager();
            EunomiaCompiler compiler = new EunomiaCompiler(manager);
            compiler.compile(new InputPath("testProofs/binary/biconditional/wrong/biconditional_intro_wrong_same_sub.txt"));

            List<Integer> wrongLines = new ArrayList<>(List.of(7));
            LineVerifier.verifyWrongLines(manager, wrongLines);

        } catch (FileNotFoundException e) {
            log.error("File not found");
        }
    }
    @Test
    public void testBiconditionalElimWrongInfer() {
        try {
            ProofManager manager = new ProofManager();
            EunomiaCompiler compiler = new EunomiaCompiler(manager);
            compiler.compile(new InputPath("testProofs/binary/biconditional/wrong/biconditional_elim_wrong_infer.txt"));

            List<Integer> wrongLines = new ArrayList<>(List.of(3));
            LineVerifier.verifyWrongLines(manager, wrongLines);

        } catch (FileNotFoundException e) {
            log.error("File not found");
        }
    }
}
