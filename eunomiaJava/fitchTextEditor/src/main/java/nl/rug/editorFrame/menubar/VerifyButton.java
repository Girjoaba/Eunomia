package nl.rug.editorFrame.menubar;

import nl.rug.editorFrame.controllerCommunication.EunomiaColors;

import javax.swing.*;
import java.awt.*;

/**
 * The verify button component which sends the written proof through the Controller to the Model.
 */
public class VerifyButton extends JButton {

    /**
     * Initializes the verify button.
     */
    public VerifyButton() {
        this.setText("Verify");
        this.setFocusable(false);
        this.setBackground(EunomiaColors.ACCENT_MAIN);
        this.setForeground(Color.BLACK);
    }
}
