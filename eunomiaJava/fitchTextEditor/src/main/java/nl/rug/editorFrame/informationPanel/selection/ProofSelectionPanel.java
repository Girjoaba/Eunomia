package nl.rug.editorFrame.informationPanel.selection;

import nl.rug.editorFrame.ActionReceiver;
import nl.rug.editorFrame.controllerCommunication.ActionInjector;
import nl.rug.editorFrame.controllerCommunication.ActionPackage;
import nl.rug.editorFrame.controllerCommunication.EunomiaColors;

import javax.swing.*;
import java.awt.*;

/**
 * A panel containing exercise proofs that can be selected.
 */
public class ProofSelectionPanel extends JPanel implements ActionReceiver {

    /**
     * Initializes the proof selection panel.
     */
    public ProofSelectionPanel() {
        initProofSelectionPanel();
    }

    @Override
    public void setActions(ActionInjector actionInjector) {
        useFactory(actionInjector);
    }

    private void initProofSelectionPanel() {
        setBackground(EunomiaColors.BACKGROUND_SECOND);
        setForeground(EunomiaColors.FOREGROUND_MAIN);

        setPreferredSize(new Dimension(300, 600));
        setLayout(new FlowLayout(FlowLayout.LEFT));
        setBorder(BorderFactory.createEmptyBorder(20, 25, 20, 20));
    }

    private void useFactory(ActionInjector actionInjector) {
        ProofSelectionFactory factory = new ProofSelectionFactory(this, (ActionPackage) actionInjector);
        factory.createJComponent(ProofSelectionFactory.TITLE);
        factory.createJComponent(ProofSelectionFactory.EXAMPLE_PROOF);
    }
}
