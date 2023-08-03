package nl.rug.editorFrame.writePanel;

import nl.rug.editorFrame.writePanel.proofStructure.FitchProofDisplayUtils;
import nl.rug.editorFrame.writePanel.proofStructure.actions.ContinueFitchBarAction;
import nl.rug.editorFrame.writePanel.proofStructure.actions.CreateSubproofAction;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;
import javax.swing.event.UndoableEditEvent;
import javax.swing.event.UndoableEditListener;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.undo.CannotUndoException;
import javax.swing.undo.UndoManager;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

/**
 * Adds all the keystrokes listeners and actions to the ProofWritingPane.
 */
public class KeyStrokeDispatcher {

    private static final String NEGATION_TAG = "insertNegationSymbol";
    private static final String CONJUNCTION_TAG = "insertConjunctionSymbol";
    private static final String DISJUNCTION_TAG = "insertDisjunctionSymbol";
    private static final String IMPLICATION_TAG = "insertImplicationSymbol";
    private static final String BICONDITIONAL_TAG = "insertBiconditionalSymbol";
    private static final String CONTRADICTION_TAG = "insertContradictionSymbol";
    private static final String EXISTENTIAL_TAG = "insertExistentialSymbol";
    private static final String UNIVERSAL_TAG = "insertUniversalSymbol";
    private static final String CREATE_SUBPROOF_TAG = "createSubProof";
    private static final String CONTINUE_FITCH_BAR_TAG = "continueFitchBar";

    @Contract(value = "_, _ -> new", pure = true)
    private static @NotNull Action insertSymbolAction(ProofWritingPane proofWritingPane, String symbol) {
        return new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    proofWritingPane.getDocument().insertString(proofWritingPane.getCaretPosition(),
                            symbol, null);
                } catch (BadLocationException badLocationException) {
                    badLocationException.printStackTrace();
                }
            }
        };
    }

    /**
     * Adds all the keystroke listeners and actions to the ProofWritingPane.
     * @param proofWritingPane the ProofWritingPane to add the keystroke listeners and actions to.
     * @param undoManager the UndoManager to resolve undo and redo events.
     */
    public static void addKeyStrokeActions(@NotNull ProofWritingPane proofWritingPane, UndoManager undoManager) {

        InputMap im = proofWritingPane.getInputMap(JComponent.WHEN_FOCUSED);
        ActionMap am = proofWritingPane.getActionMap();

        createSubProofAction(proofWritingPane);
        continueFitchBarAction(proofWritingPane);

        im.put(KeyStroke.getKeyStroke("control N"), NEGATION_TAG);
        am.put(NEGATION_TAG, insertSymbolAction(proofWritingPane, FitchProofDisplayUtils.NEGATION_SYMBOL));

        im.put(KeyStroke.getKeyStroke(KeyEvent.VK_7, Toolkit.getDefaultToolkit().getMenuShortcutKeyMaskEx()),
                CONJUNCTION_TAG);
        im.put(KeyStroke.getKeyStroke("control Q"), CONJUNCTION_TAG);
        am.put(CONJUNCTION_TAG, insertSymbolAction(proofWritingPane, FitchProofDisplayUtils.CONJUNCTION_SYMBOL));

        im.put(KeyStroke.getKeyStroke(KeyEvent.VK_BACK_SLASH, Toolkit.getDefaultToolkit().getMenuShortcutKeyMaskEx()),
                DISJUNCTION_TAG);
        im.put(KeyStroke.getKeyStroke("control W"), DISJUNCTION_TAG);
        am.put(DISJUNCTION_TAG, insertSymbolAction(proofWritingPane, FitchProofDisplayUtils.DISJUNCTION_SYMBOL));

        im.put(KeyStroke.getKeyStroke("control I"), IMPLICATION_TAG);
        am.put(IMPLICATION_TAG, insertSymbolAction(proofWritingPane, FitchProofDisplayUtils.IMPLICATION_SYMBOL));

        im.put(KeyStroke.getKeyStroke("control B"), BICONDITIONAL_TAG);
        am.put(BICONDITIONAL_TAG, insertSymbolAction(proofWritingPane, FitchProofDisplayUtils.BICONDITIONAL_SYMBOL));

        im.put(KeyStroke.getKeyStroke("control T"), CONTRADICTION_TAG);
        am.put(CONTRADICTION_TAG, insertSymbolAction(proofWritingPane, FitchProofDisplayUtils.CONTRADICTION_SYMBOL));

        im.put(KeyStroke.getKeyStroke("control E"), EXISTENTIAL_TAG);
        am.put(EXISTENTIAL_TAG, insertSymbolAction(proofWritingPane, FitchProofDisplayUtils.EXISTENTIAL_QUANTIFIER));

        im.put(KeyStroke.getKeyStroke("control U"), UNIVERSAL_TAG);
        am.put(UNIVERSAL_TAG, insertSymbolAction(proofWritingPane, FitchProofDisplayUtils.UNIVERSAL_QUANTIFIER));

        undoRedoAction(proofWritingPane, undoManager);
    }

    private static void createSubProofAction(@NotNull ProofWritingPane proofWritingPane) {

        InputMap im = proofWritingPane.getInputMap(JComponent.WHEN_FOCUSED);
        ActionMap am = proofWritingPane.getActionMap();

        im.put(KeyStroke.getKeyStroke("control P"), CREATE_SUBPROOF_TAG);
        am.put(CREATE_SUBPROOF_TAG, new CreateSubproofAction(proofWritingPane));
    }

    private static void continueFitchBarAction(@NotNull ProofWritingPane proofWritingPane) {
        InputMap im = proofWritingPane.getInputMap(JComponent.WHEN_FOCUSED);
        ActionMap am = proofWritingPane.getActionMap();

        im.put(KeyStroke.getKeyStroke("ENTER"), CONTINUE_FITCH_BAR_TAG);
        am.put(CONTINUE_FITCH_BAR_TAG, new ContinueFitchBarAction(proofWritingPane));
    }

    private static void undoRedoAction(@NotNull ProofWritingPane proofWritingPane, UndoManager undoManager) {

        Document doc = proofWritingPane.getDocument();
        doc.addUndoableEditListener(new UndoableEditListener() {
            @Override
            public void undoableEditHappened(UndoableEditEvent e) {
                undoManager.addEdit(e.getEdit());
            }
        });

        InputMap im = proofWritingPane.getInputMap(JComponent.WHEN_FOCUSED);
        ActionMap am = proofWritingPane.getActionMap();

        im.put(KeyStroke.getKeyStroke(KeyEvent.VK_Z, Toolkit.getDefaultToolkit()
                .getMenuShortcutKeyMaskEx()), "Undo");
        im.put(KeyStroke.getKeyStroke(KeyEvent.VK_R, Toolkit.getDefaultToolkit()
                .getMenuShortcutKeyMaskEx()), "Redo");

        am.put("Undo", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    if (undoManager.canUndo()) {
                        undoManager.undo();
                    }
                } catch (CannotUndoException exp) {
                    exp.printStackTrace();
                }
            }
        });
        am.put("Redo", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    if (undoManager.canRedo()) {
                        undoManager.redo();
                    }
                } catch (CannotUndoException exp) {
                    exp.printStackTrace();
                }
            }
        });
    }
}
