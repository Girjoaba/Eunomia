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
public class ForallTest {

    /*  ----------------------------------------------------------------------------------------------------------------
        ------------------------------------------------- Forall Elimination -------------------------------------------
        ----------------------------------------------------------------------------------------------------------------
     */

    @Test
    public void testForallElim() {
        try {
            ProofManager manager = new ProofManager();
            EunomiaCompiler compiler = new EunomiaCompiler(manager);
            compiler.compile(new InputPath("testProofs/quantifiers/forall/correct/forall_elim.txt"));

            LineVerifier.verifyAllLinesCorrect(manager);

        } catch (FileNotFoundException e) {
            log.error("File not found");
        }
    }

    @Test
    public void testForallElimComposed() {
        try {
            ProofManager manager = new ProofManager();
            EunomiaCompiler compiler = new EunomiaCompiler(manager);
            compiler.compile(new InputPath("testProofs/quantifiers/forall/correct/forall_elim_composed.txt"));

            LineVerifier.verifyAllLinesCorrect(manager);

        } catch (FileNotFoundException e) {
            log.error("File not found");
        }
    }

    @Test
    public void forallElimDifferentConstantsTest() {
        try {
            ProofManager manager = new ProofManager();
            EunomiaCompiler compiler = new EunomiaCompiler(manager);
            compiler.compile(new InputPath("testProofs/quantifiers/forall/wrong/forall_elim_different_constants.txt"));

            List<Integer> wrongLines = new ArrayList<>(List.of(2));
            LineVerifier.verifyWrongLines(manager, wrongLines);

        } catch (FileNotFoundException e) {
            log.error("File not found");
        }
    }

    @Test
    public void forallElimNotFunctionTest() {
        try {
            ProofManager manager = new ProofManager();
            EunomiaCompiler compiler = new EunomiaCompiler(manager);
            compiler.compile(new InputPath("testProofs/quantifiers/forall/wrong/forall_elim_not_function.txt"));

            List<Integer> wrongLines = new ArrayList<>(List.of(2));
            LineVerifier.verifyWrongLines(manager, wrongLines);

        } catch (FileNotFoundException e) {
            log.error("File not found");
        }
    }

    @Test
    public void forallElimReplaceWrongVariableTest() {
        try {
            ProofManager manager = new ProofManager();
            EunomiaCompiler compiler = new EunomiaCompiler(manager);
            compiler.compile(new InputPath("testProofs/quantifiers/forall/wrong/forall_elim_replace_wrong_variable.txt"));

            List<Integer> wrongLines = new ArrayList<>(List.of(2));
            LineVerifier.verifyWrongLines(manager, wrongLines);

        } catch (FileNotFoundException e) {
            log.error("File not found");
        }
    }

    @Test
    public void forallElimSwitchVariableTest() {
        try {
            ProofManager manager = new ProofManager();
            EunomiaCompiler compiler = new EunomiaCompiler(manager);
            compiler.compile(new InputPath("testProofs/quantifiers/forall/wrong/forall_elim_switch_variable.txt"));

            List<Integer> wrongLines = new ArrayList<>(List.of(2));
            LineVerifier.verifyWrongLines(manager, wrongLines);

        } catch (FileNotFoundException e) {
            log.error("File not found");
        }
    }

    @Test
    public void forallElimWrongNotCompleteTest() {
        try {
            ProofManager manager = new ProofManager();
            EunomiaCompiler compiler = new EunomiaCompiler(manager);
            compiler.compile(new InputPath("testProofs/quantifiers/forall/wrong/forall_elim_wrong_not_complete.txt"));

            List<Integer> wrongLines = new ArrayList<>(List.of(2));
            LineVerifier.verifyWrongLines(manager, wrongLines);

        } catch (FileNotFoundException e) {
            log.error("File not found");
        }
    }

    @Test
    public void ForallElimWrongToVariableTest() {
        try {
            ProofManager manager = new ProofManager();
            EunomiaCompiler compiler = new EunomiaCompiler(manager);
            compiler.compile(new InputPath("testProofs/quantifiers/forall/wrong/forall_elim_wrong_to_variable.txt"));

            List<Integer> wrongLines = new ArrayList<>(List.of(2));
            LineVerifier.verifyWrongLines(manager, wrongLines);

        } catch (FileNotFoundException e) {
            log.error("File not found");
        }
    }

    /*  ----------------------------------------------------------------------------------------------------------------
        ------------------------------------------------- Forall Introduction ------------------------------------------
        ----------------------------------------------------------------------------------------------------------------
     */

    @Test
    public void forallIntroCorrectSimpleTest() {
        try {
            ProofManager manager = new ProofManager();
            EunomiaCompiler compiler = new EunomiaCompiler(manager);
            compiler.compile(new InputPath("testProofs/quantifiers/forall/correct/forall_intro_correct_simple.txt"));

            LineVerifier.verifyAllLinesCorrect(manager);

        } catch (FileNotFoundException e) {
            log.error("File not found");
        }
    }

    @Test
    public void forallIntroScopeInOut() {
        try {
            ProofManager manager = new ProofManager();
            EunomiaCompiler compiler = new EunomiaCompiler(manager);
            compiler.compile(new InputPath("testProofs/quantifiers/forall/correct/forall_intro_scope_in_out.txt"));

            LineVerifier.verifyAllLinesCorrect(manager);

        } catch (FileNotFoundException e) {
            log.error("File not found");
        }
    }

    @Test
    public void ForallIntroChangedFunctionTest() {
        try {
            ProofManager manager = new ProofManager();
            EunomiaCompiler compiler = new EunomiaCompiler(manager);
            compiler.compile(new InputPath("testProofs/quantifiers/forall/wrong/forall_intro_changed_function.txt"));

            List<Integer> wrongLines = new ArrayList<>(List.of(4));
            LineVerifier.verifyWrongLines(manager, wrongLines);

        } catch (FileNotFoundException e) {
            log.error("File not found");
        }
    }

    @Test
    public void ForallIntroExistentScopeTest() {
        try {
            ProofManager manager = new ProofManager();
            EunomiaCompiler compiler = new EunomiaCompiler(manager);
            compiler.compile(new InputPath("testProofs/quantifiers/forall/wrong/forall_intro_existent_scope.txt"));

            List<Integer> wrongLines = new ArrayList<>(List.of(3));
            LineVerifier.verifyWrongLines(manager, wrongLines);

        } catch (FileNotFoundException e) {
            log.error("File not found");
        }
    }

    @Test
    public void ForallIntroNoQuantifierInferredTest() {
        try {
            ProofManager manager = new ProofManager();
            EunomiaCompiler compiler = new EunomiaCompiler(manager);
            compiler.compile(new InputPath("testProofs/quantifiers/forall/wrong/forall_intro_no_quantifier_inferred.txt"));

            List<Integer> wrongLines = new ArrayList<>(List.of(4));
            LineVerifier.verifyWrongLines(manager, wrongLines);

        } catch (FileNotFoundException e) {
            log.error("File not found");
        }
    }

    @Test
    public void ForallIntroNotAllConstantsReplacedTest() {
        try {
            ProofManager manager = new ProofManager();
            EunomiaCompiler compiler = new EunomiaCompiler(manager);
            compiler.compile(new InputPath("testProofs/quantifiers/forall/wrong/forall_intro_not_all_constants_replaced.txt"));

            List<Integer> wrongLines = new ArrayList<>(List.of(4));
            LineVerifier.verifyWrongLines(manager, wrongLines);

        } catch (FileNotFoundException e) {
            log.error("File not found");
        }
    }

    @Test
    public void ForallIntroNotMatchingNotConstantTest() {
        try {
            ProofManager manager = new ProofManager();
            EunomiaCompiler compiler = new EunomiaCompiler(manager);
            compiler.compile(new InputPath("testProofs/quantifiers/forall/wrong/forall_intro_not_matching_constant.txt"));
            List<Integer> wrongLines = new ArrayList<>(List.of(4));
            LineVerifier.verifyWrongLines(manager, wrongLines);

        } catch (FileNotFoundException e) {
            log.error("File not found");
        }
    }

    @Test
    public void ForallIntroSameVariableAsExistentTest() {
        try {
            ProofManager manager = new ProofManager();
            EunomiaCompiler compiler = new EunomiaCompiler(manager);
            compiler.compile(new InputPath("testProofs/quantifiers/forall/wrong/forall_intro_same_variable_as_existent.txt"));

            List<Integer> wrongLines = new ArrayList<>(List.of(5));
            LineVerifier.verifyWrongLines(manager, wrongLines);

        } catch (FileNotFoundException e) {
            log.error("File not found");
        }
    }

    @Test
    public void ForallIntroMultipleConstantsReplacedTest() {
        try {
            ProofManager manager = new ProofManager();
            EunomiaCompiler compiler = new EunomiaCompiler(manager);
            compiler.compile(new InputPath("testProofs/quantifiers/forall/wrong/forall_intro_multiple_constants_replaced.txt"));

            List<Integer> wrongLines = new ArrayList<>(List.of(4));
            LineVerifier.verifyWrongLines(manager, wrongLines);

        } catch (FileNotFoundException e) {
            log.error("File not found");
        }
    }
}
