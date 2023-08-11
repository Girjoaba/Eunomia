package nl.rug.editorFrame.communication;

/**
 * An enum that labels all the actions passed to the View from the Controller.
 * The View uses the enum to identify the action that it expects.
 */
public enum ActionID {
    SAVE_ACTION,
    LOAD_ACTION,
    VERIFY_ACTION,
    NEW_ACTION,
    LOAD_EXAMPLE_PROOF,
    LOAD_EXAMPLE_QUANTIFIER_PROOF
}
