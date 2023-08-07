package nl.rug.editorFrame.factories;

import nl.rug.editorFrame.ProofTextEditor;
import nl.rug.editorFrame.communication.EunomiaColors;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Objects;
import java.util.Scanner;

public class ProofSelectionFactory extends ElementFactory {

    private final JPanel panel;

    public ProofSelectionFactory(JPanel panel) {
        super();
        this.panel = panel;
    }

    @Override
    public void addElements() {
        addTitle();
        addSelectProof("Completed Normal Proof Example", "/selection_proofs/example_proof.txt");
        addSelectProof("Completed Quantifier Proof Example", "/selection_proofs/example_proof.txt");
    }

    private void addTitle() {
        JLabel proofGuide = new JLabel("Select an exercise proof:");
        proofGuide.setFont(new Font("Arial", Font.BOLD, 16));
        proofGuide.setForeground(EunomiaColors.FOREGROUND_MAIN);

        panel.add(proofGuide);
        nexLine();
        panel.add(new JLabel(" "));
        nexLine();
    }

    private void addSelectProof(String proofName, String resourcePath) {
        JButton button = new JButton("Select");
        button.addActionListener(new SelectProofActionListener(resourcePath));
        button.setFocusable(false);
        button.setBackground(EunomiaColors.ACCENT_SECOND);
        button.setForeground(Color.BLACK);
        panel.add(button);

        JLabel label = new JLabel(proofName);
        label.setFont(new Font("Arial", Font.PLAIN, 14));
        panel.add(label);
        nexLine();
    }

    /**
     * Hack to get a new line in the flow layout.
     */
    private void nexLine() {
        JPanel spacerPanel = new JPanel();
        spacerPanel.setPreferredSize(new Dimension(10000, 0)); // You can adjust the size as needed
        panel.add(spacerPanel);
    }

    private static class SelectProofActionListener implements ActionListener {
        private final String proof;

        protected SelectProofActionListener(String resourcePath) {
            File file = new File(Objects.requireNonNull(this.getClass().getResource(resourcePath)).getFile());
            StringBuilder fileContents = new StringBuilder((int)file.length());
            Scanner scanner = null;
            try {
                scanner = new Scanner(file);
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }
            while(scanner.hasNextLine()) {
                fileContents.append(scanner.nextLine()).append(System.lineSeparator());
            }
            scanner.close();

            this.proof = fileContents.toString();
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(null, proof);
        }
    }
}
