package nl.rug.editorFrame.informationPanel.tabs;

import nl.rug.editorFrame.communication.ActionInjector;
import nl.rug.editorFrame.communication.ActionPackage;
import nl.rug.editorFrame.communication.EunomiaColors;

import javax.swing.*;
import java.awt.*;

/**
 * A panel containing exercise proofs that can be selected.
 */
public class ProofSelectionPanel extends JPanel {

    private ActionInjector actionInjector;

    /**
     * Initializes the proof selection panel.
     * TODO: Replace the layout to a GridBagConstraints layout.
     */
    public ProofSelectionPanel() {
        initProofSelectionPanel();
    }

    public void setActions(ActionInjector actionInjector) {
        this.actionInjector = actionInjector;
        useFactory();
    }

    private void initProofSelectionPanel() {
        setBackground(EunomiaColors.BACKGROUND_SECOND);
        setForeground(EunomiaColors.FOREGROUND_MAIN);

        setPreferredSize(new Dimension(300, 600));
        setLayout(new FlowLayout(FlowLayout.LEFT));
        setBorder(BorderFactory.createEmptyBorder(20, 25, 20, 20));
    }

    private void useFactory() {
        ProofSelectionFactory factory = new ProofSelectionFactory(this, (ActionPackage) actionInjector);
        factory.createJComponent(ProofSelectionFactory.TITLE);
        factory.createJComponent(ProofSelectionFactory.EXAMPLE_PROOF);
    }
}
