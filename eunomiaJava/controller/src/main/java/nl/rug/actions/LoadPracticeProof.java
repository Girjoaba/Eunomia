package nl.rug.actions;

import lombok.extern.slf4j.Slf4j;
import nl.rug.editorFrame.ProofTextEditor;
import nl.rug.utility.StringConverter;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Objects;
import java.util.Scanner;

@Slf4j
public class LoadPracticeProof implements ActionListener {

    private final ProofTextEditor frame;
    private final String resourcePath;

    public LoadPracticeProof(ProofTextEditor frame, String resourcePath) {
        this.frame = frame;
        this.resourcePath = resourcePath;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        int result = JOptionPane.showConfirmDialog(null
                , "Are you sure you want to start a new proof? All unsaved changes will be lost."
                , "Practice Proof", JOptionPane.YES_NO_OPTION);

        if (result == JOptionPane.NO_OPTION) {
            return;
        }

//        File file = new File(Objects.requireNonNull(this.getClass().getResourceAsStream(resourcePath)));
        InputStream is = this.getClass().getResourceAsStream(resourcePath);
        StringBuilder proof = new StringBuilder();
        try {
            assert is != null;
            try (Reader reader = new BufferedReader(new InputStreamReader(is, StandardCharsets.UTF_8))) {
                int c = 0;
                while ((c = reader.read()) != -1) {
                    proof.append((char) c);
                }
            }
        } catch (IOException ex) {
            frame.setProofText("Something went wrong with loading!");
            return;
        }

        frame.setProofText(proof.toString());
    }
}
