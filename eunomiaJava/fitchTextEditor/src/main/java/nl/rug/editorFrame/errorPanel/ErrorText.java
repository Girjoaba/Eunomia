package nl.rug.editorFrame.errorPanel;

import nl.rug.editorFrame.controllerCommunication.EunomiaColors;

import javax.swing.*;
import javax.swing.text.BadLocationException;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;
import java.awt.*;

/**
 * The component containing the text of the error messages.
 */
public class ErrorText extends JTextPane {

    /**
     * Initializes the error text component.
     */
    public ErrorText() {
        initErrorText();
    }

    private void initErrorText() {
        setPreferredSize(new Dimension(300, 200));

        setBackground(EunomiaColors.BACKGROUND_MAIN);
        setFont(new Font("Arial", Font.PLAIN, 14));
        setForeground(Color.WHITE);

        setEditable(false);
    }

    /**
     * Adds an error line to the text.
     * @param error the error to be added.
     */
    public void addErrorLine(String error) {
        StyledDocument doc = this.getStyledDocument();
        SimpleAttributeSet correct = new SimpleAttributeSet();
        StyleConstants.setForeground(correct, EunomiaColors.ERROR);
        try {
            doc.insertString(doc.getLength(), error + "\n", correct);
        } catch (BadLocationException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Clears all the error lines.
     */
    public void clearErrorLines() {
        this.setText("");
    }

    /**
     * Sets the text of the error panel as to be correct. A small reward for the user.
     * @param message the message received from the Model as to be shown to the user. Can be ignored.
     */
    public void setCorrect(String message) {
        StyledDocument doc = this.getStyledDocument();
        SimpleAttributeSet correct = new SimpleAttributeSet();
        StyleConstants.setForeground(correct, EunomiaColors.CORRECT);
        try {
            doc.insertString(doc.getLength(), message, correct);
        } catch (BadLocationException e) {
            throw new RuntimeException(e);
        }
    }
}
