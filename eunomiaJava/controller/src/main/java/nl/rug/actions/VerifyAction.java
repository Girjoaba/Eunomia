package nl.rug.actions;

import nl.rug.ProofTranslator;
import nl.rug.editorFrame.ProofTextEditor;
import nl.rug.proof.fol.EunomiaCompiler;
import nl.rug.proof.fol.compiler.manager.ProofManager;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VerifyAction implements ActionListener {

    private final ProofTextEditor frame;
    private final ProofManager manager;
    private final EunomiaCompiler compiler;

    public VerifyAction(ProofTextEditor frame, ProofManager manager, EunomiaCompiler compiler) {
        this.frame = frame;
        this.manager = manager;
        this.compiler = compiler;
    };

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
