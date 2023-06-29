package nl.rug.actions;

import nl.rug.editorFrame.ProofTextEditor;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.FileStore;

public class SaveAction implements ActionListener {

    ProofTextEditor frame;

    public SaveAction(ProofTextEditor frame) {
        this.frame = frame;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String proof = frame.getProofText();
        JFileChooser fileChooser = new JFileChooser();

        // Set the default file name and extension filter
        fileChooser.setSelectedFile(new File("file.txt"));
        fileChooser.setFileFilter(new FileNameExtensionFilter("Text Files (*.txt)", "txt"));

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
