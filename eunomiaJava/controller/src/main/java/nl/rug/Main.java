package nl.rug;

import com.formdev.flatlaf.FlatDarkLaf;
import nl.rug.editorFrame.ProofEditorFrame;
import nl.rug.proof.fol.EunomiaCompiler;
import nl.rug.proof.fol.compiler.manager.ProofManager;

/**
 * The entry class of the application.
 */
public class Main {

    /**
     * The main method of the application.
     * @param args arguments passed to the application.
     */
    public static void main(String[] args) {
        FlatDarkLaf.setup();

        ProofEditorFrame frame = new ProofEditorFrame();
        ProofManager manager = new ProofManager();
        EunomiaCompiler compiler = new EunomiaCompiler(manager);

        frame.setVerifyAction((e) -> {
            compiler.clear();

            String input = frame.getProofText();
            input = ProofFormatter.format(input);
            compiler.compile(input);
            frame.clearErrors();
            manager.referenceSet().stream().filter(line -> !manager.isCorrect(line)).forEach((line) -> {
                frame.addLineError(line, manager.getErrorMessage(line));
            });
        });
    }
}