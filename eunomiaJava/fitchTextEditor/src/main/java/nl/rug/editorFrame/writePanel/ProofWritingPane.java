package nl.rug.editorFrame.writePanel;

import nl.rug.editorFrame.EunomiaColors;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.*;
import java.awt.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class ProofWritingPane extends JTextPane {

    private final List<Integer> wrongLines;
    public ProofWritingPane() {
        super();
        wrongLines = new ArrayList<>();
        initProofWritingPane();
    }

    private void initProofWritingPane() {
        this.setPreferredSize(new Dimension(1100, 600));
        this.setContentType("text/plain; charset=UTF-8");
        this.setFont(new Font("Arial", Font.PLAIN, 15));

        this.setBackground(Color.decode(EunomiaColors.BACKGROUND_MAIN));
        this.setForeground(Color.decode(EunomiaColors.FOREGROUND_MAIN));


        String notEncodedExampleProof =
                """
                1. P premise
                assume
                2. ¬((P ∧ Q) ∨ (P ∧ ¬Q)) premise
                    assume
                3. Q premise
                4. P ∧ Q ∧Intro: 1, 3
                5. (P ∧ Q) ∨ (P ∧ ¬Q) ∨Intro: 4
                6. ⟂ ⟂Intro: 5, 2
                qed
                7. ¬Q ¬Intro: 3-6
                8. P ∧ ¬Q ∧Intro: 1, 7
                9. (((P ∧ Q) ∨ ((P ∧ ¬Q)))) ∨Intro: 8
                10. ⟂ ⟂Intro: 9, 2
                qed
                11. ¬¬((P ∧ Q) ∨ (P ∧ ¬Q)) ¬Intro: 2-10
                12. (P ∧ Q) ∨ (P ∧ ¬Q) ¬Elim: 11
            """;

        byte[] encodedExampleProof = notEncodedExampleProof.getBytes(StandardCharsets.UTF_8);
        String encodedExampleProofString = new String(encodedExampleProof, StandardCharsets.UTF_8);

        System.out.println(encodedExampleProofString);

        this.setText(encodedExampleProofString);
//        this.addDocumentListener();
    }

    public void markWrongLine(int index) {
        wrongLines.add(index);
        StyledDocument doc = this.getStyledDocument();
        SimpleAttributeSet errorStyle = new SimpleAttributeSet();
        StyleConstants.setForeground(errorStyle, EunomiaColors.ERROR);
//        StyleConstants.setUnderline(errorStyle, true);

        String[] lines = this.getText().split("\n");
        this.setText("");
        for (String line : lines) {
            // If line contains a number from the list fo wrong lines, mark it red
            boolean inserted = false;
            for (Integer wrongLine : wrongLines) {
                if (line.contains(wrongLine + ".")) {
                    try {
                        doc.insertString(doc.getLength(), line + "\n", errorStyle);
                        inserted = true;
                    } catch (BadLocationException e) {
                        e.printStackTrace();
                    }
                }
            }
            if (!inserted) {
                try {
                    doc.insertString(doc.getLength(), line + "\n", null);
                } catch (BadLocationException e) {
                    e.printStackTrace();
                }
            }
        }

        this.setDocument(doc);
    }

    public void clearErrors() {
        wrongLines.clear();
        StyledDocument doc = this.getStyledDocument();
        String[] lines = this.getText().split("\n");
        this.setText("");
        for (String line : lines) {
            try {
                doc.insertString(doc.getLength(), line + "\n", null);
            } catch (BadLocationException e) {
                e.printStackTrace();
            }
        }
    }

    // FInd how many lines are in the document
    public int getLineCount() {
        return this.getText().split("\n").length;
    }
}
