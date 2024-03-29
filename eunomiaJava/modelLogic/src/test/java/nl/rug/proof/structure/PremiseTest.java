package nl.rug.proof.structure;

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
public class PremiseTest {

    /* -----------------------------------------------------------------------------------------|
     * ---------------------------------- Verify Correctness -----------------------------------|
     * -----------------------------------------------------------------------------------------|
     */

    @Test
    public void testSingleInitialPremise() {
        try {
            ProofManager manager = new ProofManager();
            EunomiaCompiler compiler = new EunomiaCompiler(manager);
            compiler.compile(new InputPath("testProofs/structure/premise/single_initial_premise.txt"));

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
            compiler.compile(new InputPath("testProofs/structure/premise/multiple_initial_premises.txt"));

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
            compiler.compile(new InputPath("testProofs/structure/premise/single_subproof_premise.txt"));

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
    public void testMultipleSubproofPremisesWrong() {
        try {
            ProofManager manager = new ProofManager();
            EunomiaCompiler compiler = new EunomiaCompiler(manager);
            compiler.compile(new InputPath("testProofs/structure/premise/multiple_subproof_premises_wrong.txt"));

            List<Integer> wrongLines = new ArrayList<>(List.of(4, 6));
            LineVerifier.verifyWrongSyntaxLines(manager.getSyntaxErorrs(), wrongLines);

        } catch (FileNotFoundException e) {
            log.error("File not found");
        }
    }

    @Test
    public void testNoInitialPremise() {
        try {
            ProofManager manager = new ProofManager();
            EunomiaCompiler compiler = new EunomiaCompiler(manager);
            compiler.compile(new InputPath("testProofs/structure/premise/no_initial_premise.txt"));

            LineVerifier.verifyAllLinesCorrect(manager);

        } catch (FileNotFoundException e) {
            log.error("File not found");
        }
    }
}
