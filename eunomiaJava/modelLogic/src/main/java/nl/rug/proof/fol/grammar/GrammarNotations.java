package nl.rug.proof.fol.grammar;

/**
 * Class corresponding to the notations of the grammar defined in the ANTLR4 file.
 *
 * IMPORTANT: The notations must coincide with the ones generated by the ANTLR4 file.
 */
public class GrammarNotations {

    public static final String NEGATION_SYMBOL = "!";
    public static final String CONTRADICTION_SYMBOL = "\\perp";
    public static final String CONJUNCTION_SYMBOL = "&&";
    public static final String DISJUNCTION_SYMBOL = "||";
    public static final String IDENTITY_SYMBOL = "==";
    public static final String IMPLICATION_SYMBOL = "->";
    public static final String BICONDITIONAL_SYMBOL = "<->";
    public static final String UNIVERSAL_QUANTIFIER = "\\forall";
    public static final String EXISTENTIAL_QUANTIFIER = "\\exists";
    public static final String PREMISE = "premise";
    public static final String ASSUME = "assume";
    public static final String QED = "qed";
    public static final String VARIABLES = "uvwxyz";
    public static final String CONSTANTS = "abcdefghijklmnopqrst";
    public static final String BOX_WALL = "|";
}
