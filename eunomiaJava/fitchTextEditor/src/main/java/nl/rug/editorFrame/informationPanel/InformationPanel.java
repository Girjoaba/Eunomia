package nl.rug.editorFrame.informationPanel;

import nl.rug.editorFrame.communication.EunomiaColors;
import nl.rug.editorFrame.informationPanel.tabs.HelpPanel;
import nl.rug.editorFrame.informationPanel.tabs.UserManual;
import nl.rug.editorFrame.informationPanel.tabs.ProofSelectionPanel;
import nl.rug.editorFrame.informationPanel.ui.InformationTabbedUI;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

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
        setLayout(new FlowLayout(FlowLayout.LEFT));
        setPreferredSize(new Dimension(100, 600));
        setMinimumSize(new Dimension(0, 0));
        setBackground(EunomiaColors.BACKGROUND_SECOND);
        addTabbedPane();
    }

    private void addIconAtIndex(@NotNull JTabbedPane tabbedPane, String resourcePath, int index) {
        final int size = 30;
        // Icon
        URL iconURL = this.getClass().getResource("/" + resourcePath);
        assert iconURL != null;
        ImageIcon shortcutIcon = new ImageIcon(iconURL);
        Image image = shortcutIcon.getImage(); // transform it
        Image newimg = image.getScaledInstance(size, size,  java.awt.Image.SCALE_SMOOTH);
        shortcutIcon.setImage(newimg);

        // Label
        JLabel iconLabel = new JLabel();
        iconLabel.setIcon(shortcutIcon);
        iconLabel.setPreferredSize(new Dimension(size, size));

        tabbedPane.setTabComponentAt(index, iconLabel);  // tab index, jLabel
    }

    private void addTabbedPane() {
        JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.LEFT);

        tabbedPane.setPreferredSize(new Dimension(2000, 1000));
        tabbedPane.setBackground(EunomiaColors.ACCENT_MAIN);
        tabbedPane.setForeground(Color.BLACK);
        tabbedPane.setUI(new InformationTabbedUI());

        UserManual userManual = new UserManual();

        tabbedPane.addTab("", userManual);
        tabbedPane.addTab("", new HelpPanel());
        tabbedPane.addTab("", new ProofSelectionPanel());

        addIconAtIndex(tabbedPane, "icons/keyboard2_icon.png", 0);
        addIconAtIndex(tabbedPane, "icons/book_icon.png", 1);
        addIconAtIndex(tabbedPane, "icons/pencil_icon.png", 2);

        add(tabbedPane);

        tabbedPane.setSelectedIndex(0);
    }

}
