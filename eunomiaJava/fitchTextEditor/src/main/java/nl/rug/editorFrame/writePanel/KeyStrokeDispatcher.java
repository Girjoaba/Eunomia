package nl.rug.editorFrame.writePanel;

import nl.rug.editorFrame.ProofSyntax;

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

import static nl.rug.editorFrame.ProofSyntax.CONJUNCTION_SYMBOL;
import static nl.rug.editorFrame.ProofSyntax.NEGATION_SYMBOL;

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

    private static Action insertSymbolAction(ProofWritingPane proofWritingPane, String symbol) {
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

    private static void undoRedoAction(ProofWritingPane proofWritingPane, UndoManager undoManager) {

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

    /**
     * Adds all the keystroke listeners and actions to the ProofWritingPane.
     * @param proofWritingPane the ProofWritingPane to add the keystroke listeners and actions to.
     * @param undoManager the UndoManager to resolve undo and redo events.
     */
    public static void addKeyStrokeActions(ProofWritingPane proofWritingPane, UndoManager undoManager) {
        proofWritingPane.getInputMap(JComponent.WHEN_FOCUSED)
                .put(KeyStroke.getKeyStroke("control N"), NEGATION_TAG);
        proofWritingPane.getActionMap()
                .put(NEGATION_TAG, insertSymbolAction(proofWritingPane, NEGATION_SYMBOL));

        proofWritingPane.getInputMap(JComponent.WHEN_FOCUSED)
                .put(KeyStroke.getKeyStroke("control W"), CONJUNCTION_TAG);
        proofWritingPane.getActionMap()
                .put(CONJUNCTION_TAG, insertSymbolAction(proofWritingPane, CONJUNCTION_SYMBOL));

        proofWritingPane.getInputMap(JComponent.WHEN_FOCUSED)
                .put(KeyStroke.getKeyStroke("control V"), DISJUNCTION_TAG);
        proofWritingPane.getActionMap()
                .put(DISJUNCTION_TAG, insertSymbolAction(proofWritingPane, ProofSyntax.DISJUNCTION_SYMBOL));

        proofWritingPane.getInputMap(JComponent.WHEN_FOCUSED)
                .put(KeyStroke.getKeyStroke("control I"), IMPLICATION_TAG);
        proofWritingPane.getActionMap()
                .put(IMPLICATION_TAG, insertSymbolAction(proofWritingPane, ProofSyntax.IMPLICATION_SYMBOL));

        proofWritingPane.getInputMap(JComponent.WHEN_FOCUSED)
                .put(KeyStroke.getKeyStroke("control B"), BICONDITIONAL_TAG);
        proofWritingPane.getActionMap()
                .put(BICONDITIONAL_TAG, insertSymbolAction(proofWritingPane, ProofSyntax.BICONDITIONAL_SYMBOL));

        proofWritingPane.getInputMap(JComponent.WHEN_FOCUSED)
                .put(KeyStroke.getKeyStroke("control T"), CONTRADICTION_TAG);
        proofWritingPane.getActionMap()
                .put(CONTRADICTION_TAG, insertSymbolAction(proofWritingPane, ProofSyntax.CONTRADICTION_SYMBOL));

        proofWritingPane.getInputMap(JComponent.WHEN_FOCUSED)
                .put(KeyStroke.getKeyStroke("control E"), EXISTENTIAL_TAG);
        proofWritingPane.getActionMap()
                .put(EXISTENTIAL_TAG, insertSymbolAction(proofWritingPane, ProofSyntax.EXISTENTIAL_QUANTIFIER));

        proofWritingPane.getInputMap(JComponent.WHEN_FOCUSED)
                .put(KeyStroke.getKeyStroke("control U"), UNIVERSAL_TAG);
        proofWritingPane.getActionMap()
                .put(UNIVERSAL_TAG, insertSymbolAction(proofWritingPane, ProofSyntax.UNIVERSAL_QUANTIFIER));

        undoRedoAction(proofWritingPane, undoManager);
    }
}
