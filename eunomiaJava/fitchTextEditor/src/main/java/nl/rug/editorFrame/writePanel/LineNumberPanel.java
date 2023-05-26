package nl.rug.editorFrame.writePanel;

import nl.rug.editorFrame.EunomiaColors;

import javax.swing.*;
import java.awt.*;

public class LineNumberPanel extends JTextArea {
    public LineNumberPanel() {
        super();
        this.setEditable(false);
        this.setFont(new Font("Arial", Font.PLAIN, 15));
        this.setBackground(Color.decode(EunomiaColors.BACKGROUND_MAIN));
        this.setForeground(EunomiaColors.ACCENT_DILUTED);
        this.setPreferredSize(new Dimension(20, 600));
        this.setBorder(null);
    }

    public void updateLineNumbers(int lines) {
        StringBuilder lineNumbers = new StringBuilder();
        for (int i = 1; i <= lines; i++) {
            lineNumbers.append(i).append(".").append("\n");
        }
        this.setText(lineNumbers.toString());
    }
}
