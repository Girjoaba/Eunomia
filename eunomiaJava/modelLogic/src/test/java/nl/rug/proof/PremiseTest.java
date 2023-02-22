package nl.rug.proof;

import lombok.extern.slf4j.Slf4j;
import nl.rug.proof.fol.EunomiaCompiler;
import nl.rug.proof.fol.compiler.manager.ProofManager;
import nl.rug.proof.lineVerification.LineVerifier;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

@Slf4j
public class PremiseTest {

    @Test
    public void testSingleInitialPremise() {
        try {
            ProofManager manager = new ProofManager();
            EunomiaCompiler compiler = new EunomiaCompiler(manager);
            compiler.compile("testProofs/premise/single_initial_premise.txt");

            LineVerifier.verifyAllLinesCorrect(manager);

        } catch (FileNotFoundException e) {
            log.error("File not found");
        }
    }

    @Test
    public void testMultipleInitialPremises() {
        try {
            ProofManager manager = new ProofManager();
            EunomiaCompiler compiler = new EunomiaCompiler(manager);
            compiler.compile("testProofs/premise/multiple_initial_premises.txt");

            LineVerifier.verifyAllLinesCorrect(manager);

        } catch (FileNotFoundException e) {
            log.error("File not found");
        }
    }

    @Test
    public void testSingleSubproofPremise() {
        try {
            ProofManager manager = new ProofManager();
            EunomiaCompiler compiler = new EunomiaCompiler(manager);
            compiler.compile("testProofs/premise/single_subproof_premise.txt");

            LineVerifier.verifyAllLinesCorrect(manager);

        } catch (FileNotFoundException e) {
            log.error("File not found");
        }
    }

    @Test
    public void testMultipleSubproofPremisesWrong() {
        try {
            ProofManager manager = new ProofManager();
            EunomiaCompiler compiler = new EunomiaCompiler(manager);
            compiler.compile("testProofs/premise/multiple_subproof_premises_wrong.txt");

            List<Integer> wrongLines = new ArrayList<>(List.of(3));
            LineVerifier.verifyWrongLines(manager, wrongLines);

        } catch (FileNotFoundException e) {
            log.error("File not found");
        }
    }

    @Test
    public void testNoInitialPremise() {
        try {
            ProofManager manager = new ProofManager();
            EunomiaCompiler compiler = new EunomiaCompiler(manager);
            compiler.compile("testProofs/premise/no_initial_premise.txt");

            LineVerifier.verifyAllLinesCorrect(manager);

        } catch (FileNotFoundException e) {
            log.error("File not found");
        }
    }

//    @Test
//    public void testNoSubproofPremiseWrong() {
//        try {
//            ProofManager manager = new ProofManager();
//            EunomiaCompiler compiler = new EunomiaCompiler(manager);
//            compiler.compile("testProofs/premise/no_subproof_premise_wrong.txt");
//
//            List<Integer> wrongLines = new ArrayList<>(List.of(2));
//            LineVerifier.verifyWrongLines(manager, wrongLines);
//
//        } catch (FileNotFoundException e) {
//            log.error("File not found");
//        }
//    }
//
//    @Test
//    public void testMisplacedPremiseWrong() {
//        try {
//            ProofManager manager = new ProofManager();
//            EunomiaCompiler compiler = new EunomiaCompiler(manager);
//            compiler.compile("testProofs/premise/no_subproof_premise_wrong.txt");
//
//            List<Integer> wrongLines = new ArrayList<>(List.of(2));
//            LineVerifier.verifyWrongLines(manager, wrongLines);
//
//        } catch (FileNotFoundException e) {
//            log.error("File not found");
//        }
//    }
}
