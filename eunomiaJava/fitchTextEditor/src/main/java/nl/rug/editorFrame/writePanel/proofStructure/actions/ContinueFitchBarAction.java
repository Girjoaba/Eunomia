package nl.rug.editorFrame.writePanel.proofStructure.actions;

import lombok.extern.slf4j.Slf4j;
import nl.rug.editorFrame.writePanel.ProofWritingPane;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;
import javax.swing.text.BadLocationException;
import java.awt.event.ActionEvent;

/**
 * Action that is mapped to the newline button (usually ENTER).
 * Instead of inserting the usual newline, it also inserts the necessary Fitch Bars.
 */
@Slf4j
public class ContinueFitchBarAction extends AbstractAction {

    private final ProofWritingPane proofWritingPane;

    /**
     * The action is initialized with the proof writing pane because it needs to know how many fitch bars are already
     * present at the caret position.
     * @param proofWritingPane the proof writing pane from where it takes the necessary information.
     */
    public ContinueFitchBarAction(@NotNull ProofWritingPane proofWritingPane) {
        this.proofWritingPane = proofWritingPane;
    }

    private @NotNull String createFitchBars() {
        return "\n" +
                "|\t".repeat(Math.max(1, proofWritingPane.getIndentationLevel()));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            proofWritingPane.getDocument().insertString(proofWritingPane.getCaretPosition(),
                    createFitchBars(), null);
        } catch (BadLocationException badLocationException) {
            badLocationException.printStackTrace();
        }
    }
}
