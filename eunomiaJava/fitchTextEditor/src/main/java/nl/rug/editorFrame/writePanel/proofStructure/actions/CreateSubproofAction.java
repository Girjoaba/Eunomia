package nl.rug.editorFrame.writePanel.proofStructure.actions;

import lombok.extern.slf4j.Slf4j;
import nl.rug.editorFrame.writePanel.ProofWritingPane;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;
import javax.swing.text.BadLocationException;
import java.awt.event.ActionEvent;

@Slf4j
public class CreateSubproofAction extends AbstractAction {

    private final ProofWritingPane proofWritingPane;

    public CreateSubproofAction(@NotNull ProofWritingPane proofWritingPane) {
        this.proofWritingPane = proofWritingPane;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            proofWritingPane.getDocument().insertString(proofWritingPane.getCaretPosition(),
                    createSubproof(), null);
        } catch (BadLocationException badLocationException) {
            badLocationException.printStackTrace();
        }
    }

    private @NotNull String createSubproof() {
        int indentationLevel = proofWritingPane.getIndentationLevel();

        return "|\t\n" +

                "|\t".repeat(Math.max(0, indentationLevel)) + // Separation part
                "|----\n" +

                "|\t".repeat(Math.max(0, indentationLevel)) + // Conclusion part
                "|\t\n" +
                "|\t".repeat(Math.max(0, indentationLevel)) +
                "|\t".repeat(Math.max(0, indentationLevel - 1));
    }
}