package nl.rug.editorFrame.informationPanel.tabs;

import nl.rug.editorFrame.communication.EunomiaColors;

import javax.swing.*;
import java.awt.*;

/**
 * The component containing the text of the information messages.
 */
public class UserManual extends JPanel {

    /**
     * Initializes the text to be displayed as information.
     */
    public UserManual() {
        initInformationText();
    }

    private void initInformationText() {
        setBackground(EunomiaColors.BACKGROUND_SECOND);
        setForeground(EunomiaColors.FOREGROUND_MAIN);

        setPreferredSize(new Dimension(300, 600));
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        setBorder(BorderFactory.createEmptyBorder(20, 25, 20, 20));

        addTitle();
        addProofGuide();
        addBoxedConstantExplanation();
        addKeyboardShortcuts();
    }

    private void addTitle() {
        JLabel title = new JLabel("User Manual");
        title.setFont(new Font("Arial", Font.BOLD, 20));
        title.setForeground(EunomiaColors.FOREGROUND_MAIN);

        this.add(title);
        this.addEmptySpace();
        this.addEmptySpace();
    }

    private void addProofGuide() {
        JLabel proofGuide = new JLabel("Proof Guide");
        proofGuide.setFont(new Font("Arial", Font.BOLD, 16));
        proofGuide.setForeground(EunomiaColors.FOREGROUND_MAIN);

        this.add(proofGuide);
        this.addEmptySpace();

        JLabel proofIndications = new JLabel();
        proofIndications.setFont(new Font("Arial", Font.PLAIN, 14));
        proofIndications.setForeground(EunomiaColors.FOREGROUND_MAIN);
        proofIndications.setText("""
                <html>
                The Fitch bars will generate automatically. <br>
                If the structure gets broken delete the extraneous parts. <br> <br>
                
                To add a subproof press: <b>ctrl + P</b>. <br>
                To finish a subproof just delete the Fitch bar at the last level. <br> <br>
                
                <b>Note:</b> Each proof line is constructed from the main sentence + justification.<br>
                The premises do not require any justification. <br>
                </html>""");
        this.add(proofIndications);
        this.addEmptySpace();
        this.addEmptySpace();
    }

    private void addBoxedConstantExplanation() {
        JLabel boxedConstantTitle = new JLabel("Boxed Constants");
        boxedConstantTitle.setFont(new Font("Arial", Font.BOLD, 16));
        boxedConstantTitle.setForeground(EunomiaColors.FOREGROUND_MAIN);

        this.add(boxedConstantTitle);
        this.addEmptySpace();

        JLabel boxedConstantExplanation = new JLabel();
        boxedConstantExplanation.setFont(new Font("Arial", Font.PLAIN, 14));
        boxedConstantExplanation.setForeground(EunomiaColors.FOREGROUND_MAIN);
        boxedConstantExplanation.setText("""
                <html>
                The boxed constants are written as: <b>[a]</b>. <br>
                Constants are from <i> a </i> to <i> t</i>. <br>
                Variables are from <i> u </i> to <i> z</i>. <br>
                </html>""");
        this.add(boxedConstantExplanation);
        this.addEmptySpace();
        this.addEmptySpace();
        this.addEmptySpace();
    }

    private void addKeyboardShortcuts() {
        JLabel shortcutsTitle = new JLabel("Keyboard Shortcuts");
        shortcutsTitle.setFont(new Font("Arial", Font.BOLD, 16));
        shortcutsTitle.setForeground(EunomiaColors.FOREGROUND_MAIN);

        this.add(shortcutsTitle);
        this.addEmptySpace();

        this.add(new ShortcutLabel("Negation", "¬", "ctrl + N"));
        this.addEmptySpace();
        this.add(new ShortcutLabel("Conjunction", "∧", "ctrl + 7 &nbsp|&nbsp ctrl + Q"));
        this.addEmptySpace();
        this.add(new ShortcutLabel("Disjunction", "∨", "ctrl + \\ &nbsp|&nbsp ctrl + W"));
        this.addEmptySpace();
        this.add(new ShortcutLabel("Implication", "→", "ctrl + I"));
        this.addEmptySpace();
        this.add(new ShortcutLabel("Biconditional", "↔", "ctrl + B"));
        this.addEmptySpace();
        this.add(new ShortcutLabel("Contradiction", "⟂", "ctrl + T"));
        this.addEmptySpace();
        this.add(new ShortcutLabel("Universal Quantifier", "∀", "ctrl + U"));
        this.addEmptySpace();
        this.add(new ShortcutLabel("Existential Quantifier", "∃", "ctrl + E"));
        this.addEmptySpace();
        this.add(new ShortcutLabel("Boxed Constant", "[a]", "ctrl + [ &nbsp|&nbsp ctrl + ]"));
    }

    private void addEmptySpace() {
        this.add(Box.createRigidArea(new Dimension(0, 10)));
    }

    /**
     * A class that facilitates the creation of the labels which display the shortcuts.
     */
    private static class ShortcutLabel extends JLabel {
        protected ShortcutLabel(String name, String symbol, String shortcut) {
            super("<html>" + name + ": <b>" + symbol + "</b> &nbsp - &nbsp <b>" + shortcut + "</b> </html>");
            this.setFont(new Font("Arial", Font.PLAIN, 14));
            this.setForeground(EunomiaColors.FOREGROUND_MAIN);
        }
    }
}
