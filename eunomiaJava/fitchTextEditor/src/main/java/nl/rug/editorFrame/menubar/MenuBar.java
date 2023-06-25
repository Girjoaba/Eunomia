package nl.rug.editorFrame.menubar;

import javax.swing.*;

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
        initMenuBar();
    }

    void initMenuBar() {
        JMenu fileMenu = new JMenu("File");
        JMenu editMenu = new JMenu("Edit");
        JMenu helpMenu = new JMenu("Help");
        JMenuItem newMenuItem = new JMenuItem("New");
        JMenuItem openMenuItem = new JMenuItem("Open");
        JMenuItem saveMenuItem = new JMenuItem("Save");
        JMenuItem saveAsMenuItem = new JMenuItem("Save As");
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

    public JButton getVerifyButton() {
        return verifyButton;
    }
}
