package nl.rug.editorFrame.informationPanel.tabs;

import nl.rug.editorFrame.communication.EunomiaColors;
import nl.rug.editorFrame.factories.ElementFactory;
import nl.rug.editorFrame.factories.ProofSelectionFactory;

import javax.swing.*;
import java.awt.*;

/**
 * A panel containing exercise proofs that can be selected.
 */
public class ProofSelectionPanel extends JPanel {

    /**
     * Initializes the proof selection panel.
     * TODO: Replace the layout to a GridBagConstraints layout.
     */
    public ProofSelectionPanel() {
        initProofSelectionPanel();
    }

    private void initProofSelectionPanel() {
        setBackground(EunomiaColors.BACKGROUND_SECOND);
        setForeground(EunomiaColors.FOREGROUND_MAIN);

        setPreferredSize(new Dimension(300, 600));
        setLayout(new FlowLayout(FlowLayout.LEFT));
        setBorder(BorderFactory.createEmptyBorder(20, 25, 20, 20));

        ElementFactory proofSelectionFactory = new ProofSelectionFactory(this);
        proofSelectionFactory.addElements();
    }
}
