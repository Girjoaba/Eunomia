package nl.rug.editorFrame;

/**
 * Multiple factories are defined throughout the project. These factories have the purpose of creating multiple
 * JComponents and adding them to their respective containers.
 */
public interface ComponentFactory {

    /**
     * Creates a JComponent and adds it to the container.
     * @param token the token serves as a way to identify the component to be created. A list of public static
     *              such tokens should be created in each factory. The tokens should have descriptive names.
     */
    void createJComponent(int token);
}
