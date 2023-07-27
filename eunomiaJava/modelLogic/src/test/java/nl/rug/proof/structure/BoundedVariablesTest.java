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
public class BoundedVariablesTest {

    /* -----------------------------------------------------------------------------------------|
     * ------------------------------------ Verify Correctness ---------------------------------|
     * -----------------------------------------------------------------------------------------|
     */

    @Test
    public void basicCorrectBoundedTest() {
        try {
            ProofManager manager = new ProofManager();
            EunomiaCompiler compiler = new EunomiaCompiler(manager);
            compiler.compile(new InputPath("testProofs/structure/bounded_variables/correct/basic_correct_bounded.txt"));

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
    public void noQuantifierVariableTest() {
        try {
            ProofManager manager = new ProofManager();
            EunomiaCompiler compiler = new EunomiaCompiler(manager);
            compiler.compile(new InputPath("testProofs/structure/bounded_variables/wrong/no_quantifier_variable.txt"));

            List<Integer> wrongLines = new ArrayList<>(List.of(1, 2));
            LineVerifier.verifyWrongLines(manager, wrongLines);

        } catch (FileNotFoundException e) {
            log.error("File not found");
        }
    }

    @Test
    public void differentVariableQuantifierSentenceTest() {
        try {
            ProofManager manager = new ProofManager();
            EunomiaCompiler compiler = new EunomiaCompiler(manager);
            compiler.compile(new InputPath("testProofs/structure/bounded_variables/wrong/different_variable_quantifier_sentence.txt"));

            List<Integer> wrongLines = new ArrayList<>(List.of(1, 2));
            LineVerifier.verifyWrongLines(manager, wrongLines);

        } catch (FileNotFoundException e) {
            log.error("File not found");
        }
    }

    @Test
    public void variableOutsideParenthesisTest() {
        try {
            ProofManager manager = new ProofManager();
            EunomiaCompiler compiler = new EunomiaCompiler(manager);
            compiler.compile(new InputPath("testProofs/structure/bounded_variables/wrong/" +
                "variable_outside_parenthesis.txt"));

            List<Integer> wrongLines = new ArrayList<>(List.of(1, 2));
            LineVerifier.verifyWrongLines(manager, wrongLines);

        } catch (FileNotFoundException e) {
            log.error("File not found");
        }
    }
}
