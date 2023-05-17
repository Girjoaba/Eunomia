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

                """.getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8)
        );
    }
}
