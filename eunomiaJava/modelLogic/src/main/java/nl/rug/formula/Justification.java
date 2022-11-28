package nl.rug.formula;

import nl.rug.parsers.JustificationParser;

// TODO: Update the implementation of this class (THIS IS A STUB)

/**
 * A justification is an explanation of how we get a formula from another formula.
 */
public class Justification implements SyntacticallyConstrained{

    private JustificationParser parser;
    private String justification;

    /**
     * Constructor for Justification.
     * @param parser the parser that we use to get the justification.
     */
    public Justification(JustificationParser parser, String stringJustification) {
        this.parser = parser;
        this.justification = parser.parseStringToJustification(stringJustification);
    }

    @Override
    public void verifySyntax() {
        // TODO Auto-generated method stub
    }
}
