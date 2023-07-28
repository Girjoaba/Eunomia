package nl.rug.editorFrame.writePanel;

import nl.rug.editorFrame.communication.EunomiaColors;

import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;

/**
 * Describes the style in which the error lines are to be displayed.
 */
public class ErrorStyle extends SimpleAttributeSet {

    /**
     * Initializes the error style with all the desired attributes.
     */
    public ErrorStyle() {
        StyleConstants.setForeground(this, EunomiaColors.ERROR);
    }
}
