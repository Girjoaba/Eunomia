package nl.rug.editorFrame.writePanel;

import nl.rug.editorFrame.communication.EunomiaColors;

import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;

public class ErrorStyle extends SimpleAttributeSet {
    public ErrorStyle() {
        super();
        StyleConstants.setForeground(this, EunomiaColors.ERROR);
    }
}
