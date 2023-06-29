package nl.rug.editorFrame.errorPanel;

import nl.rug.editorFrame.communication.EunomiaColors;

import javax.swing.*;
import java.awt.*;

/**
 * The component containing the text of the error messages.
 */
public class ErrorText extends JTextArea {

    /**
     * Initializes the error text component.
     */
    public ErrorText() {
        initErrorText();
    }

    private void initErrorText() {
        this.setPreferredSize(new Dimension(300, 200));

        this.setBackground(EunomiaColors.BACKGROUND_MAIN);
        this.setForeground(Color.WHITE);

        this.setEditable(false);
        this.setLineWrap(true);
        this.setWrapStyleWord(true);
        this.setText("No errors found");
    }

    /**
     * Adds an error line to the text.
     * @param error the error to be added.
     */
    public void addErrorLine(String error) {
        this.setText(this.getText() + "\n" + error);
    }

    /**
     * Clears all the error lines.
     */
    public void clearErrorLines() {
        this.setText("");
    }
}
