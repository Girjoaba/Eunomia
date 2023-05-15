package nl.rug.proof.quantifier;

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
public class ExistentialTest {
    /*  ----------------------------------------------------------------------------------------------------------------
        ------------------------------------------------ Exists Introduction -------------------------------------------
        ----------------------------------------------------------------------------------------------------------------
     */

    @Test
    public void testExistsIntro() {
        try {
            ProofManager manager = new ProofManager();
            EunomiaCompiler compiler = new EunomiaCompiler(manager);
            compiler.compile(new InputPath("testProofs/quantifiers/existential/correct/exists_intro.txt"));

            LineVerifier.verifyAllLinesCorrect(manager);

        } catch (FileNotFoundException e) {
            log.error("File not found");
        }
    }

    @Test
    public void testExistsIntroChangedDifferentConstants() {
        try {
            ProofManager manager = new ProofManager();
            EunomiaCompiler compiler = new EunomiaCompiler(manager);
            compiler.compile(new InputPath("testProofs/quantifiers/existential/wrong/exists_intro_changed_different_constants.txt"));

            List<Integer> wrongLines = new ArrayList<>(List.of(2));
            LineVerifier.verifyWrongLines(manager, wrongLines);

        } catch (FileNotFoundException e) {
            log.error("File not found");
        }
    }

    @Test
    public void testExistsIntroIntroducedUniversal() {
        try {
            ProofManager manager = new ProofManager();
            EunomiaCompiler compiler = new EunomiaCompiler(manager);
            compiler.compile(new InputPath("testProofs/quantifiers/existential/wrong/exists_intro_introduced_universal.txt"));

            List<Integer> wrongLines = new ArrayList<>(List.of(2));
            LineVerifier.verifyWrongLines(manager, wrongLines);

        } catch (FileNotFoundException e) {
            log.error("File not found");
        }
    }

    @Test
    public void testExistsIntroNotMatchingVariable() {
        try {
            ProofManager manager = new ProofManager();
            EunomiaCompiler compiler = new EunomiaCompiler(manager);
            compiler.compile(new InputPath(
                    "testProofs/quantifiers/existential/wrong/exists_intro_not_matching_variable.txt"));

            List<Integer> wrongLines = new ArrayList<>(List.of(2));
            LineVerifier.verifyWrongLines(manager, wrongLines);

        } catch (FileNotFoundException e) {
            log.error("File not found");
        }
    }

    @Test
    public void testExistsIntroWrongInference() {
        try {
            ProofManager manager = new ProofManager();
            EunomiaCompiler compiler = new EunomiaCompiler(manager);
            compiler.compile(new InputPath("testProofs/quantifiers/existential/wrong/exists_intro_wrong_inference.txt"));

            List<Integer> wrongLines = new ArrayList<>(List.of(2));
            LineVerifier.verifyWrongLines(manager, wrongLines);

        } catch (FileNotFoundException e) {
            log.error("File not found");
        }
    }



    /*  ----------------------------------------------------------------------------------------------------------------
        ------------------------------------------------- Exists Elimination -------------------------------------------
        ----------------------------------------------------------------------------------------------------------------
     */

    @Test
    public void testExistsElimination() {
        try {
            ProofManager manager = new ProofManager();
            EunomiaCompiler compiler = new EunomiaCompiler(manager);
            compiler.compile(new InputPath("testProofs/quantifiers/existential/correct/exists_elimination.txt"));

            LineVerifier.verifyAllLinesCorrect(manager);

        } catch (FileNotFoundException e) {
            log.error("File not found");
        }
    }

    @Test
    public void testExistsElimIncorrectIntroductionSubproof() {
        try {
            ProofManager manager = new ProofManager();
            EunomiaCompiler compiler = new EunomiaCompiler(manager);
            compiler.compile(new InputPath("testProofs/quantifiers/existential/wrong/exists_elim_incorrect_introduction_subproof.txt"));

            List<Integer> wrongLines = new ArrayList<>(List.of(4));
            LineVerifier.verifyWrongLines(manager, wrongLines);

        } catch (FileNotFoundException e) {
            log.error("File not found");
        }
    }

    @Test
    public void testExistsElimMissingIntroductionSubproof() {
        try {
            ProofManager manager = new ProofManager();
            EunomiaCompiler compiler = new EunomiaCompiler(manager);
            compiler.compile(new InputPath("testProofs/quantifiers/existential/wrong/exists_elim_missing_introduction_subproof.txt"));

            List<Integer> wrongLines = new ArrayList<>(List.of(5));
            LineVerifier.verifyWrongLines(manager, wrongLines);

        } catch (FileNotFoundException e) {
            log.error("File not found");
        }
    }

    @Test
    public void testExistsElimNotExistential() {
        try {
            ProofManager manager = new ProofManager();
            EunomiaCompiler compiler = new EunomiaCompiler(manager);
            compiler.compile(new InputPath("testProofs/quantifiers/existential/wrong/exists_elim_not_existential.txt"));

            List<Integer> wrongLines = new ArrayList<>(List.of(4));
            LineVerifier.verifyWrongLines(manager, wrongLines);

        } catch (FileNotFoundException e) {
            log.error("File not found");
        }
    }

    @Test
    public void testExistsElimNotMatchingConstants() {
        try {
            ProofManager manager = new ProofManager();
            EunomiaCompiler compiler = new EunomiaCompiler(manager);
            compiler.compile(new InputPath("testProofs/quantifiers/existential/wrong/exists_elim_not_matching_constants.txt"));

            List<Integer> wrongLines = new ArrayList<>(List.of(2));
            LineVerifier.verifyWrongLines(manager, wrongLines);

        } catch (FileNotFoundException e) {
            log.error("File not found");
        }
    }

    @Test
    public void testExistsElimWrongInference() {
        try {
            ProofManager manager = new ProofManager();
            EunomiaCompiler compiler = new EunomiaCompiler(manager);
            compiler.compile(new InputPath("testProofs/quantifiers/existential/wrong/exists_elim_wrong_inference.txt"));

            List<Integer> wrongLines = new ArrayList<>(List.of(4));
            LineVerifier.verifyWrongLines(manager, wrongLines);

        } catch (FileNotFoundException e) {
            log.error("File not found");
        }
    }

    @Test
    public void testExistsElimConstantRestriction() {
        try {
            ProofManager manager = new ProofManager();
            EunomiaCompiler compiler = new EunomiaCompiler(manager);
            compiler.compile(new InputPath("testProofs/quantifiers/existential/wrong/exists_elim_constant_restriction.txt"));

            List<Integer> wrongLines = new ArrayList<>(List.of(6));
            LineVerifier.verifyWrongLines(manager, wrongLines);

        } catch (FileNotFoundException e) {
            log.error("File not found");
        }
    }

}

