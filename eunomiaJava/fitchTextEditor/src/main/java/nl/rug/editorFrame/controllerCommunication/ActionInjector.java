package nl.rug.editorFrame.controllerCommunication;

import java.awt.event.ActionListener;

/**
 * Used to inject all the actions defined in the Controller into the View.
 */
public interface ActionInjector {

    /**
     * Adds an action to the injector.
     * @param actionID the ID of the action. The required IDs are defined by the view so the controller knows.
     * @param actionListener the action listener of the action.
     */
    void addAction(ActionID actionID, ActionListener actionListener);

    /**
     * Gets an action from the injector.
     * @param actionID the ID of the action.
     * @return the action listener of the action.
     */
    ActionListener getAction(ActionID actionID);
}
