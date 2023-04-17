package nl.rug.editorFrame.writePanel;

import javax.swing.*;
import javax.swing.text.BadLocationException;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;
import java.awt.*;
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
        this.setBackground(Color.lightGray);
        this.setFont(new Font("Arial", Font.PLAIN, 15));
        this.setPreferredSize(new Dimension(1000, 1000));

        this.setText(
            """
            1. P premise
            assume
            2. !((P && Q) || (P && !Q)) premise
                assume
            3. Q premise
            4. P && Q &&Intro: 1, 3
            5. (P && Q) || (P && !Q) ||Intro: 4
            6. \\perp \\perpIntro: 5, 2
            qed
            7. !Q !Intro: 3-6
            8. P && !Q &&Intro: 1, 7
            9. (((P && Q) || ((P && !Q)))) ||Intro: 8
            10. \\perp \\perpIntro: 9, 2
            qed
            11. !!((P && Q) || (P && !Q)) !Intro: 2-10
            12. (P && Q) || (P && !Q) !Elim: 11
        """
        );
//        markWrongLine(3);
    }

    public void markWrongLine(int index) {
        wrongLines.add(index);
        StyledDocument doc = this.getStyledDocument();
        SimpleAttributeSet center = new SimpleAttributeSet();
        StyleConstants.setForeground(center, Color.RED);

        String[] lines = this.getText().split("\n");
        this.setText("");
        for (String line : lines) {
            // If line contains a number from the list fo wrong lines, mark it red
            Boolean inserted = false;
            for (Integer wrongLine : wrongLines) {
                if (line.contains(wrongLine + ".")) {
                    try {
                        doc.insertString(doc.getLength(), line + "\n", center);
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

    public void hello() {
        System.out.println("hello");
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
}
