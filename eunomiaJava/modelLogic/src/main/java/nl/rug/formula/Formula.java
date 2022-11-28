package nl.rug.formula;

import nl.rug.parsers.ExpressionParser;
import nl.rug.parsers.JustificationParser;

// TODO: Update the implementation of this class (THIS IS A STUB)
public class Formula implements Inference {
    private LogicExpression expression;
    private Justification justification;

    public Formula(String stringExpression, String stringJustification, ExpressionParser expressionParser,
                   JustificationParser justificationParser) {
        this.expression = new LogicExpression(expressionParser, stringExpression);
        this.justification = new Justification(justificationParser, stringJustification);
    }
}
