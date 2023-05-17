package nl.rug.editorFrame.errorPanel;

import nl.rug.editorFrame.EunomiaColors;

import javax.swing.*;
import java.awt.*;

public class ErrorText extends JTextArea {

    public ErrorText() {
        super();
        initErrorText();
    }

    private void initErrorText() {
        this.setPreferredSize(new Dimension(300, 200));
        // set a gray background
        this.setBackground(Color.decode(EunomiaColors.BACKGROUND_MAIN));
        this.setForeground(Color.decode(EunomiaColors.FOREGROUND_MAIN));

        this.setForeground(Color.WHITE);
        this.setEditable(false);
        this.setLineWrap(true);
        this.setWrapStyleWord(true);
        this.setText("No errors found");
    }

    public void addErrorLine(String error) {
        this.setText(this.getText() + "\n" + error);
    }

    public void clearErrorLines() {
        this.setText("");
    }
}
