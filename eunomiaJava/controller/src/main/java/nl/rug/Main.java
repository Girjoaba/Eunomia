package nl.rug;

import com.formdev.flatlaf.FlatDarkLaf;
import lombok.extern.slf4j.Slf4j;
import nl.rug.actions.*;
import nl.rug.editorFrame.EditorFrame;
import nl.rug.editorFrame.ProofTextEditor;
import nl.rug.editorFrame.communication.ActionID;
import nl.rug.editorFrame.communication.ActionInjector;
import nl.rug.editorFrame.communication.ActionPackage;
import nl.rug.proof.fol.EunomiaCompiler;
import nl.rug.proof.fol.compiler.manager.ProofManager;
import org.jetbrains.annotations.NotNull;

/**
 * The entry class of the application.
 */
@Slf4j
public class Main {

    /**
     * The main method of the application.
     * @param args arguments passed to the application.
     */
    public static void main(String[] args) {
        FlatDarkLaf.setup();
        ActionInjector actionInjector = new ActionPackage();

        ProofTextEditor frame = new EditorFrame();
        ProofManager manager = new ProofManager();
        EunomiaCompiler compiler = new EunomiaCompiler(manager);

        addMainVerifyActionListener(actionInjector, frame, manager, compiler);
        addCommonActionListeners(actionInjector, frame);

        frame.importActionPackage(actionInjector);
    }

    private static void addMainVerifyActionListener(@NotNull ActionInjector actionInjector, ProofTextEditor frame,
                                                    ProofManager manager, EunomiaCompiler compiler) {
        actionInjector.addAction(ActionID.VERIFY_ACTION, new VerifyAction(frame, manager, compiler));
    }

    private static void addCommonActionListeners(@NotNull ActionInjector actionInjector, ProofTextEditor frame) {
        actionInjector.addAction(ActionID.SAVE_ACTION, new SaveAction(frame));
        actionInjector.addAction(ActionID.LOAD_ACTION, new LoadAction(frame));
        actionInjector.addAction(ActionID.NEW_ACTION, new NewProofAction(frame));
    }
}