package nl.rug.editorFrame.writePanel;

import lombok.extern.slf4j.Slf4j;
import nl.rug.editorFrame.communication.EunomiaColors;
import nl.rug.editorFrame.communication.ProofSyntax;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;
import javax.swing.event.CaretEvent;
import javax.swing.text.*;
import javax.swing.undo.UndoManager;
import java.awt.*;
import java.awt.font.FontRenderContext;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

/**
 * The text panel where the proof is being written in.
 */
@Slf4j
public class ProofWritingPane extends JTextPane {

    private final UndoManager undoManager;

    private static final String EXAMPLE_PROOF =
            """
            |\t
            |----
            |\t""";

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
        this.setFont(new Font("Arial", Font.PLAIN, 16));

        this.setBackground(EunomiaColors.BACKGROUND_MAIN);
        this.setForeground(EunomiaColors.FOREGROUND_MAIN);

        byte[] encodedExampleProof = EXAMPLE_PROOF.getBytes(StandardCharsets.UTF_8);
        String encodedExampleProofString = new String(encodedExampleProof, StandardCharsets.UTF_8);

        System.out.println(encodedExampleProofString);

        setTabSize(4);

        setText(encodedExampleProofString);
    }

    private void setTabSize(int charactersPerTab) {

        TabStop[] tabs = new TabStop[40]; // Set the number of tabs you need
        for (int i = 0; i < tabs.length; i++) {
            tabs[i] = new TabStop((i + 1) * (int)new Font("Arial", Font.PLAIN, 16)
                    .getStringBounds(" ", new FontRenderContext(null, true, true))
                    .getWidth() * charactersPerTab);
        }

        TabSet tabSet = new TabSet(tabs);
        SimpleAttributeSet attributes = new SimpleAttributeSet();
        StyleConstants.setTabSet(attributes, tabSet);

        StyledDocument doc = this.getStyledDocument();
        int length = doc.getLength();
        doc.setParagraphAttributes(0, length, attributes, false);
    }

    /**
     * Changes the display of the wrong line in the proof.
     * @param index the index of the line to be marked as incorrect.
     */
    public void markWrongProofLine(int index) {
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
     * Mark the index of the lines in the original text editor as wrong.
     * @param index the index of the line to be marked as incorrect.
     */
    public void markWrongOriginalLine(int index) {
        wrongLines.add(index);
        // Sets Wrong Style
        StyledDocument doc = this.getStyledDocument();
        SimpleAttributeSet errorStyle = new SimpleAttributeSet();
        StyleConstants.setForeground(errorStyle, EunomiaColors.ERROR);

        // Gets the stylized document and changes the wrong line to red.
        String[] lines = this.getText().split("\n");
        this.setText("");
        for (int lineNr = 0; lineNr < lines.length; lineNr++) {

            // If line contains a number from the list fo wrong lines, mark it red
            boolean inserted = false;
            if (wrongLines.contains(lineNr + 1)) {
                try {
                    String updateLine = lines[lineNr] + "\n";
                    byte[] encodedLine = updateLine.getBytes(StandardCharsets.UTF_8);
                    String encodedLineString = new String(encodedLine, StandardCharsets.UTF_8);
                    doc.insertString(doc.getLength(), encodedLineString, errorStyle);
                    inserted = true;
                } catch (BadLocationException e) {
                    e.printStackTrace();
                }
            }
            if (!inserted) {
                try {
                    String updateLine = lines[lineNr] + "\n";
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

    public int getIndentationLevel() {
        String line = getLineAtCarat();
        int count = 0;
        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) == '|') {
                count++;
            }
        }
        return count;
    }

    public String getLineAtCarat() {
        String[] lines = this.getText().split("\n");

        int dot = getCaretPosition();
        try {
            return lines[getLineOfOffset(this, dot)];
        } catch (BadLocationException e) {
            throw new RuntimeException(e);
        }
    }

    static int getLineOfOffset(@NotNull JTextComponent comp, int offset) throws BadLocationException {
        Document doc = comp.getDocument();
        if (offset < 0) {
            throw new BadLocationException("Can't translate offset to line", -1);
        } else if (offset > doc.getLength()) {
            throw new BadLocationException("Can't translate offset to line", doc.getLength() + 1);
        } else {
            Element map = doc.getDefaultRootElement();
            return map.getElementIndex(offset);
        }
    }
}
