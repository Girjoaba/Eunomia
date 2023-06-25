package nl.rug.editorFrame.writePanel;

import nl.rug.editorFrame.EunomiaColors;

import javax.swing.*;
import java.awt.*;

/**
 * The main panel component for containing the text editor.
 */
public class WritePanel extends JPanel {

    private final ProofWritingPane proofTextPane;

    /**
     * Initializes the Write Panel.
     */
    public WritePanel() {
        proofTextPane = new ProofWritingPane();
        initProofWritePanel();
    }

    private void initProofWritePanel() {
        this.setLayout(new BorderLayout());
        this.setBackground(EunomiaColors.BACKGROUND_MAIN);
        JScrollPane scrollWritePanel = new JScrollPane(proofTextPane);
        TextLineNumber tln = new TextLineNumber(proofTextPane);
        scrollWritePanel.setRowHeaderView(tln);
        this.add(scrollWritePanel, BorderLayout.CENTER);
    }

    /**
     * Marks the line at the given index as wrong.
     * @param index the index of the line to be marked.
     */
    public void markWrongLine(int index) {
        proofTextPane.markWrongLine(index);
    }

    public String getProofText() {
        return proofTextPane.getText();
    }

    /**
     * Clears all the error lines.
     */
    public void clearErrors() {
        proofTextPane.clearErrors();
    }
}
