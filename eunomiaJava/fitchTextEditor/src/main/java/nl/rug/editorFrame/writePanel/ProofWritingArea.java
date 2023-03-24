package nl.rug.editorFrame.writePanel;

import javax.swing.*;
import java.awt.*;

public class ProofWritingArea extends JTextArea {

        public ProofWritingArea() {
            super();
            initProofWritingArea();
        }

        private void initProofWritingArea() {
            this.setBackground(Color.lightGray);
            this.setFont(new Font("Arial", Font.PLAIN, 15));
            this.setPreferredSize(new Dimension(1000, 1000));
            this.setLineWrap(true);
            this.setWrapStyleWord(true);
        }
}
