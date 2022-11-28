package nl.rug.formula;

import nl.rug.parsers.ExpressionParser;

// TODO: Update the implementation of this class (THIS IS A STUB)

/**
 * The logic expression is the part of the formula which corresponds to FOL logic.
 */
public class LogicExpression implements SyntacticallyConstrained{

    private ExpressionParser parser;
    private String expression;

    /**
     * Constructor for LogicExpression.
     * @param parser the parser that we use to get the expression.
     */
    public LogicExpression(ExpressionParser parser, String stringExpression) {
        this.parser = parser;
        this.expression = parser.parseStringToExpression(stringExpression);
    }

    @Override
    public void verifySyntax() {
        // TODO Auto-generated method stub
    }
}
