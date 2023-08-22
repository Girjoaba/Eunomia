package nl.rug.editorFrame.informationPanel.manual;

import nl.rug.editorFrame.controllerCommunication.EunomiaColors;

import javax.swing.*;
import java.awt.*;

/**
 * The component containing the text of the information messages.
 */
public class UserManual extends JPanel {

    /**
     * Initializes the text to be displayed as information.
     */
    public UserManual() {
        initInformationText();
    }

    private void initInformationText() {
        setBackground(EunomiaColors.BACKGROUND_SECOND);
        setForeground(EunomiaColors.FOREGROUND_MAIN);

        setPreferredSize(new Dimension(300, 600));
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        setBorder(BorderFactory.createEmptyBorder(20, 25, 20, 20));

        useFactory();
    }

    private void useFactory() {
        ManualFactory factory = new ManualFactory(this);
        factory.createJComponent(ManualFactory.TITLE);
        factory.createJComponent(ManualFactory.GUIDE);
        factory.createJComponent(ManualFactory.BOXED_CONSTANT);
        factory.createJComponent(ManualFactory.KEYBOARD_SHORTCUTS);
    }
}
