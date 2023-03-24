package nl.rug;

import nl.rug.editorFrame.ProofEditorFrame;
import nl.rug.proof.fol.EunomiaCompiler;
import nl.rug.proof.fol.compiler.manager.ProofManager;

public class Main {

    public static void main(String[] args) {
        ProofEditorFrame frame = new ProofEditorFrame();
        ProofManager manager = new ProofManager();
        EunomiaCompiler compiler = new EunomiaCompiler(manager);

        frame.setVerifyAction((e) -> {
            System.out.println(frame.getProofText());
        });
    }
}