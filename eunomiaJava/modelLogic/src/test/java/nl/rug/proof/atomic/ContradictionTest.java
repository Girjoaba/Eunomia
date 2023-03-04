package nl.rug.proof.atomic;

import lombok.extern.slf4j.Slf4j;
import nl.rug.proof.fol.EunomiaCompiler;
import nl.rug.proof.fol.compiler.manager.ProofManager;
import nl.rug.proof.helper.LineVerifier;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

@Slf4j
public class ContradictionTest {

    @Test
    public void testContraIntro() {
        try {
            ProofManager manager = new ProofManager();
            EunomiaCompiler compiler = new EunomiaCompiler(manager);
            compiler.compile("testProofs/atomic/contradiction/contra_intro.txt");

            LineVerifier.verifyAllLinesCorrect(manager);

        } catch (FileNotFoundException e) {
            log.error("File not found");
        }
    }

    @Test
    public void testContraElim() {
        try {
            ProofManager manager = new ProofManager();
            EunomiaCompiler compiler = new EunomiaCompiler(manager);
            compiler.compile("testProofs/atomic/contradiction/contra_elim.txt");

            LineVerifier.verifyAllLinesCorrect(manager);

        } catch (FileNotFoundException e) {
            log.error("File not found");
        }
    }

    @Test
    public void testContraIntroJustificationOrderWrong() {
        try {
            ProofManager manager = new ProofManager();
            EunomiaCompiler compiler = new EunomiaCompiler(manager);
            compiler.compile("testProofs/atomic/contradiction/contra_intro_justification_order_wrong.txt");

            List<Integer> wrongLines = new ArrayList<>(List.of(3));
            LineVerifier.verifyWrongLines(manager, wrongLines);

        } catch (FileNotFoundException e) {
            log.error("File not found");
        }
    }
}
