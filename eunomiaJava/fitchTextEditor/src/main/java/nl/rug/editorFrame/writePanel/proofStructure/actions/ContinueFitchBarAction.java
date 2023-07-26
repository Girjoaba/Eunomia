package nl.rug.editorFrame.writePanel.proofStructure.actions;

import lombok.extern.slf4j.Slf4j;
import nl.rug.editorFrame.writePanel.ProofWritingPane;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;
import javax.swing.text.BadLocationException;
import java.awt.event.ActionEvent;

@Slf4j
public class ContinueFitchBarAction extends AbstractAction {

    private final ProofWritingPane proofWritingPane;

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
