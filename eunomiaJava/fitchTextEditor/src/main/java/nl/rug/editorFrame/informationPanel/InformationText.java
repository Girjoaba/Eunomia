package nl.rug.editorFrame.informationPanel;

import javax.swing.*;
import java.awt.*;

public class InformationText extends JTextArea {

    public InformationText() {
        super();
        initInformationText();
    }

    private void initInformationText() {
        this.setBackground(Color.DARK_GRAY);
        this.setForeground(Color.white);
        this.setEditable(false);
        this.setFont(new Font("Arial", Font.PLAIN, 15));
        this.setText(
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
    }
}
