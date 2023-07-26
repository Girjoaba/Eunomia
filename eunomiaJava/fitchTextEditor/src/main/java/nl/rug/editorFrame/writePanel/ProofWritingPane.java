package nl.rug.editorFrame.writePanel;

import lombok.extern.slf4j.Slf4j;
import nl.rug.editorFrame.communication.EunomiaColors;
import nl.rug.editorFrame.writePanel.proofStructure.FitchProofDisplayUtils;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;
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
            |\tB
            |----
            |\t|\tA
            |\t|----
            |\t|\tB Reit: 1
            |\tA→B →Intro: 2-3
            """;

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
    public void markLogicalError(int index) {
        int lineNumber = 0;

        wrongLines.add(index);

        StyledDocument doc = this.getStyledDocument();
        ErrorStyle errorStyle = new ErrorStyle();

        String[] lines = this.getText().split("\n");
        this.setText("");
        for (String line : lines) {

            if (FitchProofDisplayUtils.canSkipLine(line)) {
                writeLine(doc, line, null);
                continue;
            }
            lineNumber++;

            boolean inserted = false;
            if (wrongLines.contains(lineNumber)) {          // Guarantee that all wrong lines are painted
                writeLine(doc, line, errorStyle);
                inserted = true;
            }

            if (!inserted) {
                writeLine(doc, line, null);
            }
        }
        this.setDocument(doc);
        undoManager.discardAllEdits(); // When the proof is rewritten, avoid undoing the rewrite.
    }

    /**
     * Mark the index of the lines in the original text editor as wrong.
     * @param index the index of the line to be marked as incorrect.
     */
    public void markSyntaxError(int index) {
        int lineNumber = 0;

        wrongLines.add(index);

        StyledDocument doc = this.getStyledDocument();
        ErrorStyle errorStyle = new ErrorStyle();

        String[] lines = this.getText().split("\n");
        this.setText("");
        for (String line : lines) {

            if (FitchProofDisplayUtils.removeFitchBars(line).isBlank()) {
                writeLine(doc, line, null);
                continue;
            }
            lineNumber++;

            boolean inserted = false;
            if (wrongLines.contains(lineNumber)) {
                writeLine(doc, line, errorStyle);
                inserted = true;
            }
            if (!inserted) {
                writeLine(doc, line, null);
            }
        }

        this.setDocument(doc);
        undoManager.discardAllEdits(); // When the proof is rewritten, avoid undoing the rewrite.
    }

    private static void writeLine(@NotNull StyledDocument doc, String line, SimpleAttributeSet style) {
        try {
            line = line + "\n";
            doc.insertString(doc.getLength(), line, style);
        } catch (BadLocationException e) {
            throw new RuntimeException(e);
        }
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
        undoManager.discardAllEdits(); // When the proof is rewritten, avoid undoing the rewrite.
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
        } catch (RuntimeException re) {
            return "";
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
