package nl.rug.editorFrame.writePanel;

import nl.rug.editorFrame.EunomiaColors;

import javax.swing.*;
import java.awt.*;

public class WritePanel extends JPanel {

    private final ProofWritingPane proofTextPane;
    public WritePanel() {
        super();
        proofTextPane = new ProofWritingPane();
        initProofWritePanel();
    }

    private void initProofWritePanel() {
        this.setLayout(new FlowLayout(FlowLayout.LEFT));
        this.setBackground(Color.decode(EunomiaColors.BACKGROUND_MAIN));
        this.add(proofTextPane);
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
