package nl.rug.arhitectural;

import nl.rug.formula.Justification;
import nl.rug.formula.LogicExpression;
import nl.rug.parsers.ExpressionParser;
import nl.rug.parsers.JustificationParser;
import nl.rug.strategies.VerifyStepStrategy;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.List;

public class ArchitectureTest {

    @Test
    public void testArchitecture() {
        ExpressionParser expressionParser = Mockito.mock(ExpressionParser.class);
        JustificationParser justificationParser = Mockito.mock(JustificationParser.class);

        List<String> input = Mockito.mock(List.class);
        Mockito.when(input.get(0)).thenReturn("A");
        Justification justification = new Justification(justificationParser, input.get(0));
        LogicExpression logicExpression = new LogicExpression(expressionParser, input.get(0));

        VerifyStepStrategy verifyStepStrategy = Mockito.mock(VerifyStepStrategy.class);
    }
}
