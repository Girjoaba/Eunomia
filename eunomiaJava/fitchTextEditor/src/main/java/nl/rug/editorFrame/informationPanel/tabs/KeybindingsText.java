package nl.rug.editorFrame.informationPanel.tabs;

import nl.rug.editorFrame.communication.EunomiaColors;

import javax.swing.*;
import java.awt.*;
import java.nio.charset.StandardCharsets;

/**
 * The component containing the text of the information messages.
 */
public class KeybindingsText extends JTextPane {

    /**
     * Initializes the text to be displayed as information.
     */
    public KeybindingsText() {
        initInformationText();
    }

    private void initInformationText() {
        this.setBackground(EunomiaColors.BACKGROUND_SECOND);
        this.setForeground(EunomiaColors.FOREGROUND_MAIN);
        this.setEditable(false);
        this.setContentType("text/html; charset=UTF-8");
        this.setFont(new Font("Arial", Font.PLAIN, 18));

        this.setPreferredSize(new Dimension(300, 600));

        this.setText(new String(
            """
                Keyboard Keybindings: <br> <br>

                ¬   &nbsp    ctrl + N <br>
                ∧   &nbsp    ctrl + W <br>
                ∨   &nbsp    ctrl + V <br>
                →   &nbsp    ctrl + I <br>
                ↔   &nbsp   ctrl + B <br>
                ⟂  &nbsp    ctrl + T <br>
                ∀   &nbsp    ctrl + U <br>
                ∃   &nbsp    ctrl + E <br> <br>

                """.getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8)
        );
    }
}
