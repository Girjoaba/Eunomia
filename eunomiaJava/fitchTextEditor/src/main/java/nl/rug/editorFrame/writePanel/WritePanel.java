package nl.rug.editorFrame.writePanel;

import javax.swing.*;
import javax.swing.text.BadLocationException;
import java.awt.*;

public class WritePanel extends JPanel {

        private final JTextArea proofTextArea;
        public WritePanel() {
            super();
            proofTextArea = new ProofWritingArea();
            initProofWritePanel();
        }

        private void initProofWritePanel() {
            this.setLayout(new FlowLayout(FlowLayout.LEFT));
            this.setBackground(Color.lightGray);
            this.add(proofTextArea);
        }

        public String getProofText() {
                return proofTextArea.getText();
            }
}
