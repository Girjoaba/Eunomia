package nl.rug.actions;

import lombok.extern.slf4j.Slf4j;
import nl.rug.editorFrame.ProofTextEditor;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * An action that saves a proof to a .eun file.
 * It is meant to be passed to the View using the ActionInjector.
 */
@Slf4j
public class SaveAction implements ActionListener {

    private final ProofTextEditor frame;

    /**
     * Initializes the action with the frame where the action will be used.
     * @param frame the reference to the frame that will use the action.
     */
    public SaveAction(ProofTextEditor frame) {
        this.frame = frame;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String proof = frame.getProofText();
        JFileChooser fileChooser = new JFileChooser();

        // Set the default file name and extension filter
        fileChooser.setSelectedFile(new File("file.eun"));
        fileChooser.setFileFilter(new FileNameExtensionFilter("Text Files (*.eun)", "eun"));

        int result = fileChooser.showSaveDialog(null);

        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();

            try (BufferedWriter writer = new BufferedWriter(new FileWriter(selectedFile))) {
                writer.write(proof);
            } catch (IOException er) {
                er.printStackTrace();
            }
        }
    }
}
