package nl.rug.editorFrame.writePanel;

import nl.rug.editorFrame.EunomiaColors;
import nl.rug.editorFrame.ProofSyntax;

import javax.swing.*;
import javax.swing.text.*;
import javax.swing.undo.UndoManager;
import java.awt.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

/**
 * The text panel where the proof is being written in.
 */
public class ProofWritingPane extends JTextPane {

    private final UndoManager undoManager;

    private static final String EXAMPLE_PROOF =
            """
            P premise
            assume
                ¬((P ∧ Q) ∨ (P ∧ ¬Q)) premise
                assume
                    Q premise
                    P ∧ Q ∧Intro: 1, 3
                    (P ∧ Q) ∨ (P ∧ ¬Q) ∨Intro: 4
                    ⟂ ⟂Intro: 5, 2
                qed
                ¬Q ¬Intro: 3-6
                P ∧ ¬Q ∧Intro: 1, 7
                (((P ∧ Q) ∨ ((P ∧ ¬Q)))) ∨Intro: 8
                ⟂ ⟂Intro: 9, 2
            qed
            ¬¬((P ∧ Q) ∨ (P ∧ ¬Q)) ¬Intro: 2-10
            (P ∧ Q) ∨ (P ∧ ¬Q) ¬Elim: 11""";

    private final List<Integer> wrongLines;

    /**
     * Initializes the proof writing pane and adds the keystroke listeners.
     */
    public ProofWritingPane() {
        undoManager = new UndoManager();
        wrongLines = new ArrayList<>();
        initProofWritingPane();

        KeyStrokeDispatcher.addKeyStrokeActions(this, undoManager);
    }

    private void initProofWritingPane() {
        this.setPreferredSize(new Dimension(1100, 600));
        this.setContentType("text/plain; charset=UTF-8");
        this.setFont(new Font("Arial", Font.PLAIN, 15));

        this.setBackground(EunomiaColors.BACKGROUND_MAIN);
        this.setForeground(EunomiaColors.FOREGROUND_MAIN);

        byte[] encodedExampleProof = EXAMPLE_PROOF.getBytes(StandardCharsets.UTF_8);
        String encodedExampleProofString = new String(encodedExampleProof, StandardCharsets.UTF_8);

        System.out.println(encodedExampleProofString);

        this.setText(encodedExampleProofString);
    }

    /**
     * Changes the display of the wrong line in the proof.
     * @param index the index of the line to be marked as incorrect.
     */
    public void markWrongLine(int index) {
        int lineNumber = 0;

        wrongLines.add(index);
        // Sets Wrong Style
        StyledDocument doc = this.getStyledDocument();
        SimpleAttributeSet errorStyle = new SimpleAttributeSet();
        StyleConstants.setForeground(errorStyle, EunomiaColors.ERROR);

        // Gets the stylized document and changes the wrong line to red.
        String[] lines = this.getText().split("\n");
        this.setText("");
        for (String line : lines) {
            if(!line.contains(ProofSyntax.SUBPROOF_START) && !line.contains(ProofSyntax.SUBPROOF_END)) {
                lineNumber++;
            }

            // If line contains a number from the list fo wrong lines, mark it red
            boolean inserted = false;
            for (Integer wrongLine : wrongLines) {
                if (lineNumber == wrongLine) {
                    try {
                        String updateLine = line + "\n";
                        byte[] encodedLine = updateLine.getBytes(StandardCharsets.UTF_8);
                        String encodedLineString = new String(encodedLine, StandardCharsets.UTF_8);
                        doc.insertString(doc.getLength(), encodedLineString, errorStyle);
                        inserted = true;
                    } catch (BadLocationException e) {
                        e.printStackTrace();
                    }
                }
            }
            if (!inserted) {
                try {
                    String updateLine = line + "\n";
                    byte[] encodedLine = updateLine.getBytes(StandardCharsets.UTF_8);
                    String encodedLineString = new String(encodedLine, StandardCharsets.UTF_8);
                    doc.insertString(doc.getLength(), encodedLineString, null);
                } catch (BadLocationException e) {
                    e.printStackTrace();
                }
            }
        }
        this.setDocument(doc);
        undoManager.discardAllEdits(); // When the proof is rewritten, avoid undoing the rewrite.
    }

    /**
     * Make all lines of the proof display as correct again.
     */
    public void clearErrors() {
        wrongLines.clear();
        StyledDocument doc = this.getStyledDocument();
        String[] lines = this.getText().split("\n");
        this.setText("");
        for (String line : lines) {
            try {
                String updateLine = line + "\n";
                byte[] encodedLine = updateLine.getBytes(StandardCharsets.UTF_8);
                String encodedLineString = new String(encodedLine, StandardCharsets.UTF_8);
                doc.insertString(doc.getLength(), encodedLineString, null);
            } catch (BadLocationException e) {
                e.printStackTrace();
            }
        }
    }
}
