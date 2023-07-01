package nl.rug.editorFrame.informationPanel;

import nl.rug.editorFrame.communication.EunomiaColors;
import nl.rug.editorFrame.informationPanel.tabs.HelpPanel;
import nl.rug.editorFrame.informationPanel.tabs.KeybindingsText;
import nl.rug.editorFrame.informationPanel.tabs.ProofSelectionPanel;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;
import javax.swing.plaf.basic.BasicTabbedPaneUI;
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
        final int size = 35;
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
        tabbedPane.setPreferredSize(new Dimension(getMaximumSize()));
        tabbedPane.setBackground(EunomiaColors.ACCENT_MAIN);
        tabbedPane.setForeground(Color.BLACK);
        tabbedPane.setUI(new InformationTabbedUI());

        tabbedPane.addTab("", new KeybindingsText());
        tabbedPane.addTab("", new ProofSelectionPanel());
        tabbedPane.addTab("", new HelpPanel());

        addIconAtIndex(tabbedPane, "icons/keyboard2_icon.png", 0);
        addIconAtIndex(tabbedPane, "icons/book_icon.png", 1);
        addIconAtIndex(tabbedPane, "icons/pencil_icon.png", 2);

        add(tabbedPane);
    }

    public static class InformationTabbedUI extends BasicTabbedPaneUI {

        @Override
        protected void paintFocusIndicator(Graphics g, int tabPlacement, Rectangle[] rects, int tabIndex,
                                           Rectangle iconRect, Rectangle textRect, boolean isSelected) {
            focus = Color.BLACK;
            super.paintFocusIndicator(g, tabPlacement, rects, tabIndex, iconRect, textRect, isSelected);
        }

        @Override
        protected LayoutManager createLayoutManager() {

            return new BasicTabbedPaneUI.TabbedPaneLayout()
            {
                @Override
                protected void calculateTabRects(int tabPlacement, int tabCount)
                {
                    final int spacer = 2; // should be non-negative
                    final int indent = 4;

                    super.calculateTabRects(tabPlacement,tabCount);

                    for (int i = 0; i < rects.length; i++) {
                        rects[i].y += i * spacer + indent;

                    }
                }

            };
        }

    }

}
