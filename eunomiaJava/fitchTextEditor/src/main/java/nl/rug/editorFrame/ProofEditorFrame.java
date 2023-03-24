package nl.rug.editorFrame;

import nl.rug.editorFrame.errorPanel.ErrorPanel;
import nl.rug.editorFrame.informationPanel.InformationPanel;
import nl.rug.editorFrame.menubar.MenuBar;
import nl.rug.editorFrame.writePanel.WritePanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ProofEditorFrame extends javax.swing.JFrame implements ActionListener, ProofTextEditor {

    private final InformationPanel informationPanel;
    private final WritePanel writePanel;
    private final ErrorPanel errorPanel;
    private final MenuBar menuBar;

    public ProofEditorFrame() {
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
        this.setSize(1400, 1000);
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

        this.setResizable(true);
    }

    public void setVerifyAction(ActionListener actionListener) {
        menuBar.getVerifyButton().addActionListener(actionListener);
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
    public void addLineError(Integer line, String error) {
        errorPanel.addErrorLine(error);
        writePanel.markWrongLine(line);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {

    }
}
