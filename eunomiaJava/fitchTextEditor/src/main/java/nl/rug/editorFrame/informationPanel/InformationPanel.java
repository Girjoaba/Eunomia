package nl.rug.editorFrame.informationPanel;

import nl.rug.editorFrame.communication.EunomiaColors;

import javax.swing.*;
import java.awt.*;

/**
 * The main panel component for the displaying information to the user.
 */
public class InformationPanel extends JPanel {

    /**
     * Initializes the information panel.
     */
    public InformationPanel() {
        initProofInformationPanel();
    }

    private void initProofInformationPanel() {
        this.setLayout(new FlowLayout(FlowLayout.LEFT));
        this.setPreferredSize(new Dimension(100, 600));
        this.setBackground(EunomiaColors.BACKGROUND_SECOND);
        this.add(new InformationText());
    }
}
