package nl.rug.parsers;

import nl.rug.formula.Justification;

public interface JustificationParser {
    /**
     * Parse the given string and return the corresponding justification.
     * @param string the string to parse
     * @return the corresponding justification
     */
    public String parseStringToJustification(String string);
}
