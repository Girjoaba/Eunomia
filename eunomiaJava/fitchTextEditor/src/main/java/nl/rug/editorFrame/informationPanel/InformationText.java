package nl.rug.editorFrame.informationPanel;

import nl.rug.editorFrame.EunomiaColors;

import javax.swing.*;
import java.awt.*;
import java.nio.charset.StandardCharsets;

public class InformationText extends JTextPane {

    public InformationText() {
        super();
        initInformationText();
    }

    private void initInformationText() {
        this.setBackground(Color.decode(EunomiaColors.BACKGROUND_SECOND));
        this.setForeground(Color.decode(EunomiaColors.FOREGROUND_MAIN));
        this.setEditable(false);
        this.setContentType("text/html; charset=UTF-8");
        this.setFont(new Font("Arial", Font.PLAIN, 15));

        this.setPreferredSize(new Dimension(300, 600));

        this.setText(new String(
            """
                Syntax: <br> <br>

                Negation: ¬ (CTRL + N) <br>
                Identity: == <br>
                Conjunction: ∧ (CTRL + W) <br>
                Disjunction: ∨ (CTRL + V) <br>
                Implication: → (CTRL + I) <br>
                Biconditional: ↔ (CTRL + B) <br>
                Contradiction: ⟂ (CTRL + T) <br>
                Universal Quantifier: ∀ (CTRL + U) <br>
                Existential Quantifier: ∃ (CTRL + E) <br> <br>

                Subproof start: assume <br>
                Subproof end: qed

                """.getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8)
        );
    }
}
