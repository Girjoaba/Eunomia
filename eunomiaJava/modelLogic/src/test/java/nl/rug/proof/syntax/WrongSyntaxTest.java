package nl.rug.proof.syntax;

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
public class WrongSyntaxTest {

    @Test
    public void testWrongSyntax() {
        try {
            ProofManager manager = new ProofManager();
            EunomiaCompiler compiler = new EunomiaCompiler(manager);
            compiler.compile(new InputPath("syntax/wrong_syntax_proof.txt"));

            List<Integer> wrongLines = new ArrayList<>(List.of(2));
            LineVerifier.verifyWrongSyntaxLines(manager.getSyntaxErorrs(), wrongLines);

        } catch (FileNotFoundException e) {
            log.error("File not found");
        }
    }
}
