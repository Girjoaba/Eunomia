package nl.rug.editorFrame.informationPanel;

import javax.swing.*;
import java.awt.*;
import java.nio.charset.StandardCharsets;

public class InformationText extends JTextPane {

    public InformationText() {
        super();
        initInformationText();
    }

    private void initInformationText() {
        this.setBackground(Color.DARK_GRAY);
        this.setForeground(Color.white);
        this.setEditable(false);
        this.setContentType("text/html; charset=UTF-8");
        this.setFont(new Font("Arial", Font.PLAIN, 15));

        this.setPreferredSize(new Dimension(300, 600));

        this.setText(new String(
            """
                <font size="+1">
                Syntax: <br> <br>

                Negation: ¬ <br>
                Identity: == <br>
                Conjunction: ∧ <br>
                Disjunction: ∨ <br>
                Implication: → <br>
                Biconditional: ↔ <br>
                Contradiction: ⟂ <br>
                Universal Quantifier: ∀ <br>
                Existential Quantifier: ∃ <br> <br>

                Subproof start: assume <br>
                Subproof end: qed
                </font>

                """.getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8)
        );
    }
}
