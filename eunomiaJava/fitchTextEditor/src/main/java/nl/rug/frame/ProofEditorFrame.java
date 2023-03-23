package nl.rug.frame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ProofEditorFrame extends javax.swing.JFrame implements ActionListener, ProofTextEditor {

    private final JButton verifyButton;
    private final JTextArea writeProofTextArea;

    public ProofEditorFrame() {
        initFrame();
        verifyButton = new JButton();
        writeProofTextArea = new JTextArea();

        this.setJMenuBar(createMenuBar());

        createProofPanel();
        createInfoPanel();
        createVerifyButton();

        this.setVisible(true);
    }

    private void initFrame() {
        this.setTitle("Eunomia");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());
        this.setSize(1400, 1000);
        this.setLocationRelativeTo(null);
    }

    private void createInfoPanel() {
        JTextArea informationTextArea = new JTextArea();
        informationTextArea.setBackground(Color.DARK_GRAY);
        informationTextArea.setForeground(Color.white);
        informationTextArea.setEditable(false);
        informationTextArea.setFont(new Font("Arial", Font.PLAIN, 15));
        informationTextArea.setText(
            """
                Syntax:\s

                Negation: !\s
                Identity: ==\s
                Conjunction: &&\s
                Disjunction: ||\s
                Implication: ->\s
                Biconditional: <->\s
                Contradiction: \\perp\s

                Subproof start: assume\s
                Subproof end: qed\s

                """
        );

        JPanel informationPanel = new JPanel();
        informationPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        informationPanel.setPreferredSize(new Dimension(300, 200));
        informationPanel.setBackground(Color.DARK_GRAY);
        informationPanel.add(informationTextArea);

        this.add(informationPanel, BorderLayout.EAST);
    }

    private void createProofPanel() {
        writeProofTextArea.setBackground(Color.lightGray);

        writeProofTextArea.setLineWrap(true);
        writeProofTextArea.setWrapStyleWord(true);
        writeProofTextArea.setFont(new Font("Arial", Font.PLAIN, 15));
        writeProofTextArea.setPreferredSize(new Dimension(1000, 1000));

        JPanel proofPanel = new JPanel();
        proofPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        proofPanel.setBackground(Color.lightGray);

        proofPanel.add(writeProofTextArea);

        this.add(proofPanel, BorderLayout.CENTER);
    }

    private void createVerifyButton() {
        verifyButton.addActionListener((ActionEvent e) -> {
            System.out.println(writeProofTextArea.getText());
        });
        verifyButton.setText("Verify");
        verifyButton.setFocusable(false);
    }

    private JMenuBar createMenuBar() {
        JMenuBar menuBar = new JMenuBar();
        JMenu file = new JMenu("File");
        JMenuItem open = new JMenuItem("Open");
        JMenuItem save = new JMenuItem("Save");
        JMenuItem saveAs = new JMenuItem("Save as");

        JMenu edit = new JMenu("Edit");
        JMenu help = new JMenu("Help");

        file.add(open);
        file.add(save);
        file.add(saveAs);

        menuBar.add(file);
        menuBar.add(edit);
        menuBar.add(help);

        menuBar.add(Box.createHorizontalGlue());
        menuBar.add(verifyButton);

        return menuBar;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {

    }

    @Override
    public void getProofText() {

    }

    @Override
    public void setLineError() {

    }
}
