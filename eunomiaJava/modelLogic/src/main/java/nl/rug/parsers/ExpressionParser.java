package nl.rug.parsers;

import nl.rug.formula.LogicExpression;

public interface ExpressionParser {
    /**
     * Parse the given expression and return the result.
     * @param string expression the expression to parse
     * @return the expression from string
     */
    public String parseStringToExpression(String string);
}
