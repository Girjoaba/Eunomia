package nl.rug.editorFrame.errorPanel;

import javax.swing.*;
import java.awt.*;

/**
 * The container for holding the error messages.
 */
public class ErrorPanel extends JPanel {

    private final ErrorText errorText;

    /**
     * Adds the error text component and initializes the panel.
     */
    public ErrorPanel() {
        errorText = new ErrorText();
        initErrorPanel();
    }

    /**
     * Initializes the panel with default display attributes.
     */
    private void initErrorPanel() {
        this.setBackground(Color.getHSBColor(40, 40, 40));

        this.setLayout(new BorderLayout());
        this.setPreferredSize(new Dimension(300, 200));

        JScrollPane scrollErrorPanel = new JScrollPane(errorText);
        this.add(scrollErrorPanel, BorderLayout.CENTER);
    }

    /**
     * Adds an error line to the text.
     * @param error the error to be added.
     */
    public void addErrorLine(String error) {
        errorText.addErrorLine(error);
    }

    /**
     * Clears all the error lines.
     */
    public void clearErrorLines() {
        errorText.clearErrorLines();
    }
}
