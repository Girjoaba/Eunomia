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
public class SubproofTest {

    /* -----------------------------------------------------------------------------------------|
     * ------------------------------------- Verify Mistakes -----------------------------------|
     * -----------------------------------------------------------------------------------------|
     */

    @Test
    public void testSubproofBasic() {
        try {
            ProofManager manager = new ProofManager();
            EunomiaCompiler compiler = new EunomiaCompiler(manager);
            compiler.compile(new InputPath("testProofs/structure/subproof/subproof_basic.txt"));

            List<Integer> wrongLines = new ArrayList<>(List.of(4));
            LineVerifier.verifyWrongLines(manager, wrongLines);

        } catch (FileNotFoundException e) {
            log.error("File not found");
        }
    }

    @Test
    public void testNestedSubproof() {
        try {
            ProofManager manager = new ProofManager();
            EunomiaCompiler compiler = new EunomiaCompiler(manager);
            compiler.compile(new InputPath("testProofs/structure/subproof/nested_subproof.txt"));

            List<Integer> wrongLines = new ArrayList<>(List.of(7, 8));
            LineVerifier.verifyWrongLines(manager, wrongLines);

        } catch (FileNotFoundException e) {
            log.error("File not found");
        }
    }
}
