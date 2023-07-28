package nl.rug.actions;

import nl.rug.editorFrame.ProofTextEditor;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

/**
 * An action that loads a proof from a .eun file.
 * It is meant to be passed to the View.
 */
public class LoadAction implements ActionListener {

    private final ProofTextEditor frame;

    /**
     * Initializes the frame with the frame in which the action will be used.
     * @param frame the frame that will use the action.
     */
    public LoadAction(ProofTextEditor frame) {
        this.frame = frame;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JFileChooser fileChooser = new JFileChooser();

        // Set the file filter to only show .txt files
        fileChooser.setFileFilter(new FileNameExtensionFilter("Text Files (*.eun)", "eun"));

        int result = fileChooser.showOpenDialog(null);
        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();

            try (BufferedReader reader = new BufferedReader(new FileReader(selectedFile))) {
                StringBuilder stringBuilder = new StringBuilder();
                String line;

                while ((line = reader.readLine()) != null) {
                    stringBuilder.append(line);
                    stringBuilder.append(System.lineSeparator());
                }

                String proof = stringBuilder.toString();
                frame.setProofText(proof);
            } catch (IOException er) {
                er.printStackTrace();
            }
        }
    }
}
