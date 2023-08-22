package nl.rug.editorFrame;

import nl.rug.editorFrame.controllerCommunication.ActionInjector;

/**
 * Action receivers are usually JPanel or other JComponents which receive the Action Injector from the Controller and
 * must use it. <br>
 * Since the Action Injector must reach most composite components starting from the main frame, the components
 * which require the injector are defined with this interface.
 */
public interface ActionReceiver {

    /**
     * The actions are passed from the Controller Module through the ActionInjector.
     * @param actionInjector the action injector containing all the actions for loading the proofs.
     */
    void setActions(ActionInjector actionInjector);
}
