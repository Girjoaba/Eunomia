package nl.rug.editorFrame.informationPanel.tabs;

import nl.rug.editorFrame.communication.EunomiaColors;

import javax.swing.*;
import java.awt.*;

/**
 * A panel containing exercise proofs that can be selected.
 * TODO: Implement this class.
 */
public class ProofSelectionPanel extends JPanel {

    /**
     * Initializes the proof selection panel.
     */
    public ProofSelectionPanel() {
        initProofSelectionPanel();
    }

    private void initProofSelectionPanel() {
        setBackground(EunomiaColors.BACKGROUND_SECOND);
        setForeground(EunomiaColors.FOREGROUND_MAIN);

        setPreferredSize(new Dimension(300, 600));
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        setBorder(BorderFactory.createEmptyBorder(20, 25, 20, 20));

        add(new JLabel("Select an exercise proof:"));
        add(new TextButton("Exercise 1"));
    }

    private static class TextButton extends JPanel {

        protected TextButton(String text) {
            super();
            setBackground(EunomiaColors.BACKGROUND_SECOND);
            setForeground(EunomiaColors.FOREGROUND_MAIN);

            setPreferredSize(new Dimension(300, 600));
            setLayout(new FlowLayout(FlowLayout.LEFT));

            JLabel label = new JLabel(text);
            add(label);
            JButton button = new JButton("Select");
            button.addActionListener(e -> {
                // Create a popup message
                JOptionPane.showMessageDialog(null, "You selected " + text);
            });
            add(button);
        }

    }
}
