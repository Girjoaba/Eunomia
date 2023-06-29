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
        JMenu editMenu = new JMenu("Edit");
        JMenu helpMenu = new JMenu("Help");
        JMenuItem newMenuItem = new JMenuItem("New");
        JMenuItem openMenuItem = new JMenuItem("Load");
        openMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_L,
                KeyEvent.CTRL_DOWN_MASK | KeyEvent.SHIFT_DOWN_MASK));
        openMenuItem.addActionListener(actionPackage.getAction(ActionID.LOAD_ACTION));

        JMenuItem saveMenuItem = new JMenuItem("Save");

        JMenuItem saveAsMenuItem = new JMenuItem("Save As");
        saveAsMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S,
                KeyEvent.CTRL_DOWN_MASK | KeyEvent.SHIFT_DOWN_MASK));
        saveAsMenuItem.addActionListener(actionPackage.getAction(ActionID.SAVE_ACTION));

        JMenuItem exitMenuItem = new JMenuItem("Exit");
        JMenuItem cutMenuItem = new JMenuItem("Cut");
        JMenuItem copyMenuItem = new JMenuItem("Copy");
        JMenuItem pasteMenuItem = new JMenuItem("Paste");
        JMenuItem aboutMenuItem = new JMenuItem("About");

        fileMenu.add(newMenuItem);
        fileMenu.add(openMenuItem);
        fileMenu.add(saveMenuItem);
        fileMenu.add(saveAsMenuItem);
        fileMenu.add(exitMenuItem);
        editMenu.add(cutMenuItem);
        editMenu.add(copyMenuItem);
        editMenu.add(pasteMenuItem);
        helpMenu.add(aboutMenuItem);

        this.add(fileMenu);
        this.add(editMenu);
        this.add(helpMenu);

        this.add(Box.createHorizontalGlue());
        this.add(verifyButton);
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
