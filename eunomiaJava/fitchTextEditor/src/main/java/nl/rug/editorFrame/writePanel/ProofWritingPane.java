package nl.rug.editorFrame.writePanel;

import javax.swing.*;
import javax.swing.text.BadLocationException;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;
import java.awt.*;

public class ProofWritingPane extends JTextPane {

    public ProofWritingPane() {
        super();
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
        StyledDocument doc = this.getStyledDocument();
        SimpleAttributeSet center = new SimpleAttributeSet();
        StyleConstants.setForeground(center, Color.RED);

        String[] lines = this.getText().split("\n");
        this.setText("");
        for (String line : lines) {
            if (line.contains(index + ".")) {
                try {
                    doc.insertString(doc.getLength(), line + "\n", center);
                } catch (BadLocationException e) {
                    e.printStackTrace();
                }
            } else {
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
}
