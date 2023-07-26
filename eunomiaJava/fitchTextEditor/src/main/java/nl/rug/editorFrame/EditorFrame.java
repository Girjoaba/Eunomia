package nl.rug.editorFrame;

import nl.rug.editorFrame.communication.ActionInjector;
import nl.rug.editorFrame.communication.ActionPackage;
import nl.rug.editorFrame.errorPanel.ErrorPanel;
import nl.rug.editorFrame.informationPanel.InformationPanel;
import nl.rug.editorFrame.menubar.MenuBar;
import nl.rug.editorFrame.writePanel.WritePanel;

import javax.swing.*;
import java.awt.*;

/**
 * The main frame which represents a text editor for the user to write a proof in Fitch Style and get feedback on it.
 */
public class EditorFrame extends javax.swing.JFrame implements ProofTextEditor {

    private final InformationPanel informationPanel;
    private final WritePanel writePanel;
    private final ErrorPanel errorPanel;
    private final MenuBar menuBar;

    /**
     * Initializes the Proof Editor Frame and adds all the sub-panels.
     * 1. Error Panel
     * 2. Write Panel
     * 3. Information Panel
     */
    public EditorFrame() {
        informationPanel = new InformationPanel();
        writePanel = new WritePanel();
        errorPanel = new ErrorPanel();
        menuBar = new MenuBar();
        initFrame();
        this.setVisible(true);
    }

    private void initFrame() {
        this.setTitle("Eunomia");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());
        this.setSize(1500, 1000);
        this.setLocationRelativeTo(null);

        this.setJMenuBar(menuBar);

        JPanel proofPanel = new JPanel();
        proofPanel.setLayout(new BorderLayout());
        proofPanel.setMinimumSize(new Dimension(0, 0));

        JSplitPane verticalSplit = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, informationPanel, proofPanel);
        verticalSplit.setContinuousLayout(true);
        verticalSplit.setResizeWeight(1.0);
        this.add(verticalSplit, BorderLayout.CENTER);

        JSplitPane horizontalSplit = new JSplitPane(JSplitPane.VERTICAL_SPLIT, writePanel, errorPanel);
        horizontalSplit.setContinuousLayout(true);
        horizontalSplit.setResizeWeight(1.0);
        proofPanel.add(horizontalSplit, BorderLayout.CENTER);

        this.setExtendedState(JFrame.MAXIMIZED_BOTH);

        this.setResizable(true);
    }

    @Override
    public String getProofText() {
        return writePanel.getProofText();
    }

    @Override
    public void clearErrors() {
        writePanel.clearErrors();
        errorPanel.clearErrorLines();
    }

    @Override
    public void addLineError(Integer line, String error, boolean isSyntaxError) {
        errorPanel.addErrorLine(error);
        writePanel.markWrongLine(line, isSyntaxError);
    }

    @Override
    public void importActionPackage(ActionInjector actionInjector) {
        menuBar.setActions((ActionPackage) actionInjector);
    }

    @Override
    public void setProofText(String proofText) {
        writePanel.setProofText(proofText);
    }

}
