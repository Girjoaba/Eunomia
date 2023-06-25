package nl.rug.utility;

/**
 * A class to distinguish a path from a normal input string.
 * It is used to differentiate between them two when compiling the proof.
 */
public class InputPath {
    private String path;

    /**
     * Creates the path.
     * @param path the path to the file containing the string stored as a string.
     */
    public InputPath(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }
}
