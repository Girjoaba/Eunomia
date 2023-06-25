package nl.rug.editorFrame;

/**
 * Main Interface to make the View-Controller Connection.
 * The Controller must only use the methods of this interface to communicate with the View.
 */
public interface ProofTextEditor {

    /**
     * Gets the proof in a string format.
     * @return the proof in a string format.
     */
    String getProofText();

    /**
     * A call to clear all the errors in the View.
     */
    void clearErrors();

    /**
     * A call to add one line number and an error message associated with it.
     * @param line the line number.
     * @param error the error message.
     */
    void addLineError(Integer line, String error);
}
