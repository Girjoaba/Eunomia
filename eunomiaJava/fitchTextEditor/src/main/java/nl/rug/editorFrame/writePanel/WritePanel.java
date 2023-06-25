package nl.rug.editorFrame.writePanel;

import nl.rug.editorFrame.EunomiaColors;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;

public class WritePanel extends JPanel {

    private final ProofWritingPane proofTextPane;
    public WritePanel() {
        super();
        proofTextPane = new ProofWritingPane();
        initProofWritePanel();
    }

    private void initProofWritePanel() {
        this.setLayout(new BorderLayout());
        this.setBackground(Color.decode(EunomiaColors.BACKGROUND_MAIN));
        JScrollPane scrollWritePanel = new JScrollPane(proofTextPane);
        TextLineNumber tln = new TextLineNumber(proofTextPane);
        scrollWritePanel.setRowHeaderView(tln);
        this.add(scrollWritePanel, BorderLayout.CENTER);
    }

    public void markWrongLine(int index) {
        proofTextPane.markWrongLine(index);
    }

    public String getProofText() {
        return proofTextPane.getText();
    }

    public void clearErrors() {
        proofTextPane.clearErrors();
    }
}
