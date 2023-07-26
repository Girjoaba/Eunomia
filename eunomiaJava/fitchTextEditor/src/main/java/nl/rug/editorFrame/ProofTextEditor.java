package nl.rug.editorFrame;

import nl.rug.editorFrame.communication.ActionInjector;

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
     * @param isSyntaxError if the error is affecting the original line of the text or the proof lines.
     */
    void addLineError(Integer line, String error, boolean isSyntaxError);

    /**
     * Imports the action injector from the Controller.
     * @param actionInjector the action injector containing all the actions required by the View and created in the
     *                       Controller.
     */
    void importActionPackage(ActionInjector actionInjector);

    void setProofText(String proofText);
}
