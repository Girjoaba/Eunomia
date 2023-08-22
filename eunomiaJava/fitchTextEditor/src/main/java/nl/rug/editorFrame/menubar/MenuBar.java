package nl.rug.editorFrame.menubar;

import nl.rug.editorFrame.ActionReceiver;
import nl.rug.editorFrame.controllerCommunication.ActionID;
import nl.rug.editorFrame.controllerCommunication.ActionInjector;
import nl.rug.editorFrame.controllerCommunication.ActionPackage;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;
import java.awt.event.KeyEvent;

/**
 * Menu bar component for the main editor frame.
 */
public class MenuBar extends JMenuBar implements ActionReceiver {

    private final JButton verifyButton;

    /**
     * Initializes the menu bar and adds the Verify Button.
     */
    public MenuBar() {
        verifyButton = new VerifyButton();
        this.add(verifyButton);
    }

    @Override
    public void setActions(@NotNull ActionInjector actionInjector) {
        verifyButton.addActionListener(actionInjector.getAction(ActionID.VERIFY_ACTION));
        createMenuItems((ActionPackage) actionInjector);
        revalidate();
        repaint();
    }

    private void createMenuItems(@NotNull ActionPackage actionPackage) {
        JMenu fileMenu = new JMenu("File");

        JMenuItem newMenuItem = new JMenuItem("New");
        newMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N,
                KeyEvent.CTRL_DOWN_MASK | KeyEvent.SHIFT_DOWN_MASK));
        newMenuItem.addActionListener(actionPackage.getAction(ActionID.NEW_ACTION));

        JMenuItem openMenuItem = new JMenuItem("Load");
        openMenuItem.setAccelerator(KeyStroke.getKeyStroke("control O"));
        openMenuItem.addActionListener(actionPackage.getAction(ActionID.LOAD_ACTION));

        JMenuItem saveMenuItem = new JMenuItem("Save");

        JMenuItem saveAsMenuItem = new JMenuItem("Save As");
        saveAsMenuItem.setAccelerator(KeyStroke.getKeyStroke("control S"));
        saveAsMenuItem.addActionListener(actionPackage.getAction(ActionID.SAVE_ACTION));

        JMenuItem verifyMenuItem = new JMenuItem("Verify");
        verifyMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, KeyEvent.CTRL_DOWN_MASK));
        verifyMenuItem.addActionListener(actionPackage.getAction(ActionID.VERIFY_ACTION));

        fileMenu.add(newMenuItem);
        fileMenu.add(openMenuItem);
        //fileMenu.add(saveMenuItem); //TODO: Implement normal save
        fileMenu.add(saveAsMenuItem);
        fileMenu.add(verifyMenuItem);

        this.add(fileMenu);

        this.add(Box.createHorizontalGlue());
        this.add(verifyButton);
    }
}
