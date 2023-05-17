package nl.rug.editorFrame.menubar;

import nl.rug.editorFrame.EunomiaColors;

import javax.swing.*;
import java.awt.*;

public class VerifyButton extends JButton {

        public VerifyButton() {
            super();
            this.setText("Verify");
            this.setFocusable(false);
            this.setBackground(EunomiaColors.ACCENT_MAIN);
            this.setForeground(Color.BLACK);
//            this.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        }
}
