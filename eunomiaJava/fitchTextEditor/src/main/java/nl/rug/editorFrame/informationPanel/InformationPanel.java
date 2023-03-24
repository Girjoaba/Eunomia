package nl.rug.editorFrame.informationPanel;

import javax.swing.*;
import java.awt.*;

public class InformationPanel extends JPanel {

        public InformationPanel() {
            super();
            initProofInformationPanel();
        }

        private void initProofInformationPanel() {
            this.setLayout(new FlowLayout(FlowLayout.LEFT));
            this.setMinimumSize(new Dimension(0, 0));
            this.setBackground(Color.DARK_GRAY);
            this.add(new InformationText());
        }
}
