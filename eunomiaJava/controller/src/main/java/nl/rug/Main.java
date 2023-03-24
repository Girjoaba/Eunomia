package nl.rug;

import nl.rug.editorFrame.ProofEditorFrame;
import nl.rug.proof.fol.EunomiaCompiler;
import nl.rug.proof.fol.compiler.manager.ProofManager;

import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) {
        ProofEditorFrame frame = new ProofEditorFrame();
        ProofManager manager = new ProofManager();
        EunomiaCompiler compiler = new EunomiaCompiler(manager);

        frame.setVerifyAction((e) -> {
            String input = frame.getProofText();
            compiler.compile(input);
            frame.clearErrors();
            manager.referenceSet().stream().filter(line -> !manager.isCorrect(line)).forEach((line) -> {
                frame.addLineError(line ,manager.getErrorMessage(line));
//                frame.get
            });
        });
    }
}