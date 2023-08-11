package nl.rug.editorFrame.informationPanel.selection;

import lombok.extern.slf4j.Slf4j;
import nl.rug.editorFrame.ComponentFactory;
import nl.rug.editorFrame.communication.ActionID;
import nl.rug.editorFrame.communication.ActionPackage;
import nl.rug.editorFrame.communication.EunomiaColors;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;
import java.awt.*;

@Slf4j
public class ProofSelectionFactory implements ComponentFactory {

    private final JPanel panel;
    private final ActionPackage actionPackage;
    public static final int TITLE = 0;
    public static final int EXAMPLE_PROOF = 1;

    public ProofSelectionFactory(JPanel panel, ActionPackage actionPackage) {
        this.panel = panel;
        this.actionPackage = actionPackage;
    }

    @Override
    public void createJComponent(int token) {
        switch (token) {
            case TITLE -> createTitle();
            case EXAMPLE_PROOF -> addSelect("<html><b><i>Example</i></b> Completed Proof</html>",
                    ActionID.LOAD_EXAMPLE_PROOF);
            default -> throw new IllegalArgumentException("Invalid factory token: " + token);
        }
    }

    private void createTitle() {
        JLabel title = new JLabel("Practice Proofs:");
        title.setFont(new Font("Arial", Font.BOLD, 16));
        title.setForeground(EunomiaColors.FOREGROUND_MAIN);

        panel.add(title);
        panel.add(newline());
        panel.add(new JLabel(" "));
        panel.add(newline());
    }

    private void addSelect(String proofName, ActionID actionID) {
        JButton button = new JButton("Select");
        button.addActionListener(actionPackage.getAction(actionID));
        button.setFocusable(false);
        button.setBackground(EunomiaColors.ACCENT_SECOND);
        button.setForeground(Color.BLACK);
        panel.add(button);

        JLabel label = new JLabel(proofName);
        label.setFont(new Font("Arial", Font.PLAIN, 14));
        panel.add(label);
        panel.add(newline());
    }

    /**
     * Hack to get a new line in the flow layout.
     */
    private @NotNull JComponent newline() {
        JPanel spacerPanel = new JPanel();
        spacerPanel.setPreferredSize(new Dimension(10000, 0)); // You can adjust the size as needed
        return spacerPanel;
    }
}
