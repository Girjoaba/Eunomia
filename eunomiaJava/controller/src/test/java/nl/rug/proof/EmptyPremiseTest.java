package nl.rug.proof;

import lombok.extern.slf4j.Slf4j;
import nl.rug.ProofTranslator;
import nl.rug.proof.fol.EunomiaCompiler;
import nl.rug.proof.fol.compiler.manager.ProofManager;
import nl.rug.utility.StringConverter;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

import static org.junit.jupiter.api.Assertions.assertTrue;

@Slf4j
public class EmptyPremiseTest {

    @Test
    public void testEmptyPremise() throws FileNotFoundException {
        ProofManager manager = new ProofManager();
        String testInput = StringConverter.getStringFromTXT("empty_premise.eun");
        EunomiaCompiler compiler = new EunomiaCompiler(manager);

        testInput = ProofTranslator.translate(testInput);
        compiler.compile(testInput);
        assertTrue(manager.referenceSet().stream().allMatch(manager::isCorrect));
        assertTrue(manager.getSyntaxErorrs().isEmpty());
    }
}
