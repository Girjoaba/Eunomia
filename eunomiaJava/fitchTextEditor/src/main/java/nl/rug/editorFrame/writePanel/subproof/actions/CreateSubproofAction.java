package nl.rug.editorFrame.writePanel.subproof.actions;

import nl.rug.editorFrame.writePanel.ProofWritingPane;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;
import javax.swing.text.BadLocationException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CreateSubproofAction extends AbstractAction {

    private final ProofWritingPane proofWritingPane;

    public CreateSubproofAction(@NotNull ProofWritingPane proofWritingPane) {
        this.proofWritingPane = proofWritingPane;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            String subproof = """
                    |\t
                    |----
                    |\t""";


            proofWritingPane.getDocument().insertString(proofWritingPane.getCaretPosition(),
                    createSubproof(), null);
            proofWritingPane.incrementIndentation();
        } catch (BadLocationException badLocationException) {
            badLocationException.printStackTrace();
        }
    }

    private String createSubproof() {

        return "|\t\n" + // Premise Place

                "|\t".repeat(Math.max(0, proofWritingPane.getIndentationLevel())) + // Separation part
                "|----\n" +
                "|\t".repeat(Math.max(0, proofWritingPane.getIndentationLevel())) + // Conclusion part
                "|\t";
    }
}
