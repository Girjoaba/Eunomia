package nl.rug.editorFrame.menubar;

import nl.rug.editorFrame.communication.ActionID;
import nl.rug.editorFrame.communication.ActionPackage;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;
import java.awt.event.KeyEvent;

/**
 * Menu bar component for the main editor frame.
 */
public class MenuBar extends JMenuBar {

    private final JButton verifyButton;

    /**
     * Initializes the menu bar and adds the Verify Button.
     */
    public MenuBar() {
        verifyButton = new VerifyButton();
        this.add(verifyButton);
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

        fileMenu.add(newMenuItem);
        fileMenu.add(openMenuItem);
        fileMenu.add(saveMenuItem);
        fileMenu.add(saveAsMenuItem);

        this.add(fileMenu);

        this.add(Box.createHorizontalGlue());
        this.add(verifyButton);

        // Set shortcut Shift + Enter for verify button TODO: make this work
        verifyButton.getInputMap(JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT)
                .put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, KeyEvent.SHIFT_DOWN_MASK), "verify");
    }

    /**
     * Sets the actions for the menu bar.
     * @param actionPackage the action package delivered by the Controller.
     */
    public void setActions(@NotNull ActionPackage actionPackage) {
        verifyButton.addActionListener(actionPackage.getAction(ActionID.VERIFY_ACTION));
        createMenuItems(actionPackage);
        revalidate();
        repaint();
    }

}
