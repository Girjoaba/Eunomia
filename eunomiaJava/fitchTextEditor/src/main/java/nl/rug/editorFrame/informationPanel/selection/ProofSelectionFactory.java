package nl.rug.editorFrame.informationPanel.selection;

import lombok.extern.slf4j.Slf4j;
import nl.rug.editorFrame.ComponentFactory;
import nl.rug.editorFrame.controllerCommunication.ActionID;
import nl.rug.editorFrame.controllerCommunication.ActionPackage;
import nl.rug.editorFrame.controllerCommunication.EunomiaColors;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;
import java.awt.*;

/**
 * A factory that creates teh components for the proof selection panel. <br>
 * It mainly creates the title and the buttons which are pressed to select the different proofs.
 */
@Slf4j
public class ProofSelectionFactory implements ComponentFactory {

    private final JPanel panel;
    private final ActionPackage actionPackage;

    /**
     * The token to add the title component.
     */
    public static final int TITLE = 0;

    /**
     * The token to add the example proof selection component.
     */
    public static final int EXAMPLE_PROOF = 1;

    /**
     * The proof selection factory will create components and add them to the given panel.
     * @param panel the panel to which the components will be added.
     * @param actionPackage the buttons require actions to load the different proofs. The actions are defined in the
     *                      Controller Module and sent over in the ActionInjector.
     */
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
     * Hack to introduce to add a newline to a FlowLayout.
     * @return a component which is extremely long so to go to the next line.
     */
    private @NotNull JComponent newline() {
        JPanel spacerPanel = new JPanel();
        spacerPanel.setPreferredSize(new Dimension(10000, 0)); // You can adjust the size as needed
        return spacerPanel;
    }
}
