package nl.rug.actions;

import nl.rug.editorFrame.ProofTextEditor;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NewProofAction implements ActionListener {

    ProofTextEditor frame;

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
