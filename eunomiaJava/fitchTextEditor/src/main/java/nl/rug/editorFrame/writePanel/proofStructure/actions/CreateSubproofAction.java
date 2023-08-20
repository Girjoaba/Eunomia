package nl.rug.editorFrame.writePanel.proofStructure.actions;

import lombok.extern.slf4j.Slf4j;
import nl.rug.editorFrame.writePanel.ProofWritingPane;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;
import javax.swing.text.BadLocationException;
import java.awt.event.ActionEvent;

/**
 * An action that is mapped to some key combination, and it inserts the structure representing a subproof.
 */
@Slf4j
public class CreateSubproofAction extends AbstractAction {

    private final ProofWritingPane proofWritingPane;

    /**
     * The action is initialized with the proof writing pane because it needs to know how many fitch bars to insert in
     * deep.
     * @param proofWritingPane the proof writing pane from where it takes the necessary information.
     */
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

        return "|\t\n" +  // Put one where caret at

                "|\t".repeat(Math.max(0, indentationLevel)) +
                "|----\n" +     // Separation bar

                "|\t".repeat(Math.max(0, indentationLevel)) + // Conclusion part
                "|\t\n" +

                "|\t".repeat(Math.max(0, indentationLevel)); // Breathing space
    }
}
