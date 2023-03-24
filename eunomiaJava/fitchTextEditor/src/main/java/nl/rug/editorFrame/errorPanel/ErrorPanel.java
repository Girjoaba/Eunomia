package nl.rug.editorFrame.errorPanel;

import javax.swing.*;
import java.awt.*;

public class ErrorPanel extends JPanel {

    final private ErrorText errorText;

    public ErrorPanel() {
        super();
        errorText = new ErrorText();
        initErrorPanel();
    }

    private void initErrorPanel() {
        this.setBackground(Color.getHSBColor(40, 40, 40));
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        this.setPreferredSize(new Dimension(300, 200));
        this.add(errorText);
    }

    public void addErrorLine(String error) {
        errorText.addErrorLine(error);
    }

    public void clearErrorLines() {
        errorText.clearErrorLines();
    }
}
