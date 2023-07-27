package nl.rug.editorFrame.writePanel;

import nl.rug.editorFrame.communication.EunomiaColors;

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
        ProofLineNumbers tln = new ProofLineNumbers(proofTextPane);
        scrollWritePanel.setRowHeaderView(tln);
        this.add(scrollWritePanel, BorderLayout.CENTER);
    }

    /**
     * Marks the line at the given index as wrong.
     *
     * @param index       the index of the line to be marked.
     * @param isSyntaxError if the original index of the proof must be updated or the proof line index.
     */
    public void markWrongLine(int index, boolean isSyntaxError) {
        if (isSyntaxError) {
            proofTextPane.markSyntaxError(index);
        } else {
            proofTextPane.markLogicalError(index);
        }
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

    public void setProofText(String proofText) {
        proofTextPane.setText(proofText);
    }
}
