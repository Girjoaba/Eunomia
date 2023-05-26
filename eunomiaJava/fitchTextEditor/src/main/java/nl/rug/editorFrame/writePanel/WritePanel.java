package nl.rug.editorFrame.writePanel;

import nl.rug.editorFrame.EunomiaColors;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;

public class WritePanel extends JPanel {

    private final ProofWritingPane proofTextPane;
    private final LineNumberPanel lineNumberPanel;
    public WritePanel() {
        super();
        proofTextPane = new ProofWritingPane();
        lineNumberPanel = new LineNumberPanel();
        initProofWritePanel();
    }

    private void initProofWritePanel() {
        this.setLayout(new BorderLayout());
        this.setBackground(Color.decode(EunomiaColors.BACKGROUND_MAIN));
        JScrollPane scrollWritePanel = new JScrollPane(proofTextPane);
        scrollWritePanel.setRowHeaderView(lineNumberPanel);
        this.add(scrollWritePanel, BorderLayout.CENTER);

        createDocumentListener();
//        lineNumberPanel.updateLineNumbers(proofTextPane.getLineCount());
//        proofTextPane.clearErrors();
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

    private void createDocumentListener() {
        proofTextPane.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                System.out.println("insert");
                lineNumberPanel.updateLineNumbers(proofTextPane.getLineCount());
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                System.out.println("remove");
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                System.out.println("change");
            }
        });
    }
}
