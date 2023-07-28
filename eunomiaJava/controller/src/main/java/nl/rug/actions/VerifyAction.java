package nl.rug.actions;

import nl.rug.ProofTranslator;
import nl.rug.editorFrame.ProofTextEditor;
import nl.rug.proof.fol.EunomiaCompiler;
import nl.rug.proof.fol.compiler.manager.ProofManager;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * The most important action that represents the bridge between the View and the Model.
 * It takes the text from the View, translates it and compiles it using the Model.
 * The errors are passed to the View through the ErrorManager.
 */
public class VerifyAction implements ActionListener {

    private final ProofTextEditor frame;
    private final ProofManager manager;
    private final EunomiaCompiler compiler;

    /**
     * The action needs to be initialized with the frame, the manager and the compiler.
     * @param frame it sends the text of the proof, and it receives the errors to be displayed.
     * @param manager it stores the errors when the proof is compiled.
     * @param compiler it receives the translated proof text and compiles it.
     */
    public VerifyAction(ProofTextEditor frame, ProofManager manager, EunomiaCompiler compiler) {
        this.frame = frame;
        this.manager = manager;
        this.compiler = compiler;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        compiler.clear();

        String input = frame.getProofText();
        input = ProofTranslator.translate(input);
        compiler.compile(input);
        frame.clearErrors();

        // Return Syntax Errors
        if (!manager.getSyntaxErorrs().isEmpty()) {
            manager.getSyntaxErorrs().lineSet().forEach((line) -> {
                frame.addLineError(line, manager.getSyntaxErorrs().getErrorMessage(line), true);
            });
        } else { // Return Evaluation Errors
            // If there are no errors return code -1
            if (manager.referenceSet().stream().allMatch(manager::isCorrect)) {
                frame.addLineError(-1, "The proof is correct!", false);
            }

            manager.referenceSet().stream().filter(line -> !manager.isCorrect(line)).forEach((line) -> {
                frame.addLineError(line, manager.getErrorMessage(line), false);
            });
        }
    }
}
