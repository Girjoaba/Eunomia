package nl.rug.editorFrame.controllerCommunication;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

/**
 * An action package contains the actions that are used by the view.
 */
public class ActionPackage implements ActionInjector {
    private final Map<ActionID, ActionListener> actionMap;

    /**
     * Creates an empty action package.
     */
    public ActionPackage() {
        actionMap = new HashMap<>();
    }

    @Override
    public void addAction(ActionID actionID, ActionListener actionListener) {
        actionMap.put(actionID, actionListener);
    }

    @Override
    public ActionListener getAction(ActionID actionID) {
        if (!actionMap.containsKey(actionID)) {
            return e -> JOptionPane.showMessageDialog(null,
                    "Action not set: " + actionID.toString(), "Error", JOptionPane.ERROR_MESSAGE);

        }
        return actionMap.get(actionID);
    }
}
