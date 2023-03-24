package nl.rug.editorFrame.errorPanel;

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
        this.setBackground(new Color(40, 40, 40));

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
