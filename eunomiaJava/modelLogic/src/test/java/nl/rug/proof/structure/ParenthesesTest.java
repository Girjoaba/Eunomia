package nl.rug.proof.structure;

import lombok.extern.slf4j.Slf4j;
import nl.rug.proof.fol.EunomiaCompiler;
import nl.rug.proof.fol.compiler.manager.ProofManager;
import nl.rug.proof.helper.LineVerifier;
import nl.rug.utility.InputPath;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

@Slf4j
public class ParenthesesTest {
    @Test
    public void testReitNoParam() {
        try {
            ProofManager manager = new ProofManager();
            EunomiaCompiler compiler = new EunomiaCompiler(manager);
            compiler.compile(new InputPath("testProofs/structure/parentheses/correct/reit_no_paren.txt"));

            LineVerifier.verifyAllLinesCorrect(manager);

        } catch (FileNotFoundException e) {
            log.error("File not found");
        }
    }
    @Test
    public void testReitWithParam() {
        try {
            ProofManager manager = new ProofManager();
            EunomiaCompiler compiler = new EunomiaCompiler(manager);
            compiler.compile(new InputPath("testProofs/structure/parentheses/correct/reit_with_paren.txt"));

            LineVerifier.verifyAllLinesCorrect(manager);

        } catch (FileNotFoundException e) {
            log.error("File not found");
        }
    }

    @Test
    public void testBinaryOrder() {
        try {
            ProofManager manager = new ProofManager();
            EunomiaCompiler compiler = new EunomiaCompiler(manager);
            compiler.compile(new InputPath("testProofs/structure/parentheses/correct/binary_order.txt"));

            LineVerifier.verifyAllLinesCorrect(manager);

        } catch (FileNotFoundException e) {
            log.error("File not found");
        }
    }
    @Test
    public void testBinaryOrderMultipleDeep() {
        try {
            ProofManager manager = new ProofManager();
            EunomiaCompiler compiler = new EunomiaCompiler(manager);
            compiler.compile(new InputPath("testProofs/structure/parentheses/correct/binary_order_multiple_deep.txt"));

            LineVerifier.verifyAllLinesCorrect(manager);

        } catch (FileNotFoundException e) {
            log.error("File not found");
        }
    }
}
