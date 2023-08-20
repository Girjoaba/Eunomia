package nl.rug.editorFrame.informationPanel.manual;

import nl.rug.editorFrame.ComponentFactory;
import nl.rug.editorFrame.controllerCommunication.EunomiaColors;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;
import java.awt.*;

/**
 * A factory for creating the different components of the manual. <br>
 * They mainly consist of text that serves as providing a guide for utilizing the software.
 */
public class ManualFactory implements ComponentFactory {

    private final JPanel panel;

    /**
     * The token for the title component.
     */
    public static final int TITLE = 0;

    /**
     * The token for the main guide component.
     */
    public static final int GUIDE = 1;

    /**
     * The token for describing how boxed constants are used.
     */
    public static final int BOXED_CONSTANT = 2;

    /**
     * The token for describing the keyboard shortcuts.
     */
    public static final int KEYBOARD_SHORTCUTS = 3;

    /**
     * The manual factory will create components and add them to the given panel.
     * @param panel the panel to which the components will be added.
     */
    public ManualFactory(JPanel panel) {
        this.panel = panel;
    }

    @Override
    public void createJComponent(int token) {
        switch (token) {
            case TITLE -> addTitle();
            case GUIDE -> addProofGuide();
            case BOXED_CONSTANT -> addBoxedConstantExplanation();
            case KEYBOARD_SHORTCUTS -> addKeyboardShortcuts();
            default -> throw new IllegalArgumentException("Invalid factory token: " + token);
        }
    }

    private void addProofGuide() {
        JLabel proofGuide = new JLabel("Proof Guide");
        proofGuide.setFont(new Font(EunomiaColors.MAIN_FONT, Font.BOLD, 16));
        proofGuide.setForeground(EunomiaColors.FOREGROUND_MAIN);

        panel.add(proofGuide);
        panel.add(emptySpace());

        JLabel proofIndications = new JLabel();
        proofIndications.setFont(new Font(EunomiaColors.MAIN_FONT, Font.PLAIN, 14));
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
        panel.add(proofIndications);
        panel.add(emptySpace());
        panel.add(emptySpace());
    }

    private void addBoxedConstantExplanation() {
        JLabel boxedConstantTitle = new JLabel("Boxed Constants");
        boxedConstantTitle.setFont(new Font(EunomiaColors.MAIN_FONT, Font.BOLD, 16));
        boxedConstantTitle.setForeground(EunomiaColors.FOREGROUND_MAIN);

        panel.add(boxedConstantTitle);
        panel.add(emptySpace());

        JLabel boxedConstantExplanation = new JLabel();
        boxedConstantExplanation.setFont(new Font(EunomiaColors.MAIN_FONT, Font.PLAIN, 14));
        boxedConstantExplanation.setForeground(EunomiaColors.FOREGROUND_MAIN);
        boxedConstantExplanation.setText("""
                <html>
                The boxed constants are written as: <b>[a]</b>. <br>
                Constants are from <i> a </i> to <i> t</i>. <br>
                Variables are from <i> u </i> to <i> z</i>. <br>
                </html>""");
        panel.add(boxedConstantExplanation);
        panel.add(emptySpace());
        panel.add(emptySpace());
        panel.add(emptySpace());
    }

    private void addKeyboardShortcuts() {
        JLabel shortcutsTitle = new JLabel("Keyboard Shortcuts");
        shortcutsTitle.setFont(new Font(EunomiaColors.MAIN_FONT, Font.BOLD, 16));
        shortcutsTitle.setForeground(EunomiaColors.FOREGROUND_MAIN);

        panel.add(shortcutsTitle);
        panel.add(emptySpace());

        panel.add(new ManualFactory.ShortcutLabel("Negation", "¬", "ctrl + N"));
        panel.add(emptySpace());
        panel.add(new ManualFactory.ShortcutLabel("Conjunction", "∧",
                "ctrl + 7 &nbsp|&nbsp ctrl + Q"));
        panel.add(emptySpace());
        panel.add(new ManualFactory.ShortcutLabel("Disjunction", "∨",
                "ctrl + \\ &nbsp|&nbsp ctrl + W"));
        panel.add(emptySpace());
        panel.add(new ManualFactory.ShortcutLabel("Implication", "→", "ctrl + I"));
        panel.add(emptySpace());
        panel.add(new ManualFactory.ShortcutLabel("Biconditional", "↔", "ctrl + B"));
        panel.add(emptySpace());
        panel.add(new ManualFactory.ShortcutLabel("Contradiction", "⟂", "ctrl + T"));
        panel.add(emptySpace());
        panel.add(new ManualFactory.ShortcutLabel("Universal Quantifier", "∀", "ctrl + U"));
        panel.add(emptySpace());
        panel.add(new ManualFactory.ShortcutLabel("Existential Quantifier", "∃", "ctrl + E"));
        panel.add(emptySpace());
        panel.add(new ManualFactory.ShortcutLabel("Boxed Constant", "[a]",
                "ctrl + [ &nbsp|&nbsp ctrl + ]"));
    }

    private void addTitle() {
        JLabel title = new JLabel("User Manual");
        title.setFont(new Font(EunomiaColors.MAIN_FONT, Font.BOLD, 20));
        title.setForeground(EunomiaColors.FOREGROUND_MAIN);

        panel.add(title);
        panel.add(emptySpace());
        panel.add(emptySpace());
    }

    @Contract(" -> new")
    private @NotNull Component emptySpace() {
        return Box.createRigidArea(new Dimension(0, 10));
    }

    /**
     * A class that facilitates the creation of the labels which display the shortcuts.
     */
    private static class ShortcutLabel extends JLabel {
        protected ShortcutLabel(String name, String symbol, String shortcut) {
            super("<html>" + name + ": <b>" + symbol + "</b> &nbsp - &nbsp <b>" + shortcut + "</b> </html>");
            this.setFont(new Font(EunomiaColors.MAIN_FONT, Font.PLAIN, 14));
            this.setForeground(EunomiaColors.FOREGROUND_MAIN);
        }
    }
}
