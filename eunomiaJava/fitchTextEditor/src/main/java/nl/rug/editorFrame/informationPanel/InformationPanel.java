package nl.rug.editorFrame.informationPanel;

import nl.rug.editorFrame.EunomiaColors;

import javax.swing.*;
import java.awt.*;

public class InformationPanel extends JPanel {

        public InformationPanel() {
            super();
            initProofInformationPanel();
        }

        private void initProofInformationPanel() {
            this.setLayout(new FlowLayout(FlowLayout.LEFT));
            this.setPreferredSize(new Dimension(100, 600));
            this.setBackground(Color.decode(EunomiaColors.BACKGROUND_SECOND));
            this.add(new InformationText());
        }
}
