package nl.rug.arhitectural;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.HashMap;

public class ArchitectureTest {

    @Test
    public void testArchitecture() {

            // Parsers
//        ExpressionParser expressionParser = Mockito.mock(ExpressionParser.class);
//        JustificationParser justificationParser = Mockito.mock(JustificationParser.class);
//
//        HashMap<String, String> input = Mockito.mock(HashMap.class);
//
//        Proof proof = Mockito.mock(Proof.class);
//
//        input.forEach((expression, justification) -> {
//            String parsedExpression = expressionParser.parseStringToExpression(expression);
//            String parsedJustification = justificationParser.parseStringToJustification(justification);
//
//            // Use the parsed expression and justification to create the step.
//            Step step = Mockito.mock(ProofStep.class);
//            proof.addStep(step);
//        });
//
//        // The verify method is going to call verifyStep on each step of the proof.
//        proof.verifyCorrectness();
//        Mockito.verify(proof, Mockito.times(1)).verifyCorrectness();
    }
}
