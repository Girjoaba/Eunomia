package nl.rug.editorFrame.controllerCommunication;

import java.awt.*;

/**
 * Class that stores all the main colors used by application for easy access and maintainability.
 */
public class EunomiaColors {

    /**
     * The main color used for the foreground text. It is a very light gray.
     */
    public static final Color FOREGROUND_MAIN = Color.decode("#F1F1F1");

    /**
     * The main background color of the application.
     * Use it to blend elements. If they do not blend try BACKGROUND_SECOND.
     */
    public static final Color BACKGROUND_MAIN = Color.decode("#252526");

    /**
     * The second background color of the application.
     * Use it to blend elements. If they do not blend try BACKGROUND_MAIN.
     */
    public static final Color BACKGROUND_SECOND = Color.decode("#2D2D30");

    /**
     * It is a light yellow color. Use it to highlight elements or bring a bit of contrast to some elements
     * (as in buttons, tabs, et cetera).
     */
    public static final Color ACCENT_MAIN = Color.decode("#fccd7c");

    /**
     * It is a light yellow color. Use it to highlight elements or bring a bit of contrast to some elements
     * Less bright than ACCENT_MAIN.
     */
    public static final Color ACCENT_SECOND = Color.decode("#c9a463");

    /**
     * The color to display errors or wrong text. It is used to draw attention to mistakes.
     */
    public static final Color ERROR = Color.decode("#F44747");

    /**
     * The color used to display a correct solution. Green used as a landmark reward for the user.
     */
    public static final Color CORRECT = Color.decode("#89d185");

    /**
     * The main font which is used throughout the application.
     */
    public static final String MAIN_FONT = "Arial";
}
