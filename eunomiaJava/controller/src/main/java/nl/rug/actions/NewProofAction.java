package nl.rug.actions;

import nl.rug.editorFrame.ProofTextEditor;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * An action that creates a new proof.
 * The action is meant to be passed to the View using the ActionInjector.
 */
public class NewProofAction implements ActionListener {

    private final ProofTextEditor frame;

    /**
     * Initializes the action with the frame where the action will be used.
     * @param frame the reference to the frame that will use the action.
     */
    public NewProofAction(ProofTextEditor frame) {
        this.frame = frame;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String oldProof = frame.getProofText();

        if (oldProof.isEmpty()) {
            frame.setProofText("");
        } else {
            int result = JOptionPane.showConfirmDialog(null
                    , "Are you sure you want to start a new proof? All unsaved changes will be lost."
                    , "New Proof", JOptionPane.YES_NO_OPTION);
            if (result == JOptionPane.YES_OPTION) {
                frame.setProofText("");
            }
        }
    }
}
