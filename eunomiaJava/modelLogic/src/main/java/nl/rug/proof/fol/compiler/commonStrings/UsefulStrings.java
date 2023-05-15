package nl.rug.proof.fol.compiler.commonStrings;

/**
 * A class for storing the most common and useful strings.
 */
public class UsefulStrings {
    /**
     * The string used as a separator for range references.
     */
    public static final String RANGE_SEPARATOR = "-";

    /**
     * Get the start of a range reference pointing to the first line of the subproof.
     * @param range the range reference as a string.
     * @return the number which points to the start of the range.
     */
    public static Integer getRangeStart(String range) {
        return Integer.parseInt(range.split(RANGE_SEPARATOR)[0]);
    }

    /**
     * Get the end of a range reference pointing to the last line of the subproof.
     * @param range the range reference as a string.
     * @return the number which points to the end of the range.
     */
    public static Integer getRangeEnd(String range) {
        return Integer.parseInt(range.split(RANGE_SEPARATOR)[1]);
    }
}
