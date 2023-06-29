package nl.rug;

import com.formdev.flatlaf.FlatDarkLaf;
import lombok.extern.slf4j.Slf4j;
import nl.rug.actions.SaveAction;
import nl.rug.actions.VerifyAction;
import nl.rug.editorFrame.ProofEditorFrame;
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

        ProofTextEditor frame = new ProofEditorFrame();
        ProofManager manager = new ProofManager();
        EunomiaCompiler compiler = new EunomiaCompiler(manager);

        addMainVerifyActionListener(actionInjector, frame, manager, compiler);
        addCommonActionListeners(actionInjector);

        frame.importActionPackage(actionInjector);
    }

    private static void addMainVerifyActionListener(@NotNull ActionInjector actionInjector, ProofTextEditor frame,
                                                    ProofManager manager, EunomiaCompiler compiler) {
        actionInjector.addAction(ActionID.VERIFY_ACTION, new VerifyAction(frame, manager, compiler));
    }

    static void addCommonActionListeners(@NotNull ActionInjector actionInjector) {
        actionInjector.addAction(ActionID.SAVE_ACTION, new SaveAction());
    }
}