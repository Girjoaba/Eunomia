package nl.rug.editorFrame.informationPanel.ui;

import javax.swing.plaf.basic.BasicTabbedPaneUI;
import java.awt.*;

/**
 * Describes the look of the tabs in the information panel.
 */
public class InformationTabbedUI extends BasicTabbedPaneUI {
    private static final int TAB_SELECTED_OFFSET = 10;
    private static Boolean WAS_OFFSET = false;

    @Override
    protected void paintFocusIndicator(Graphics g, int tabPlacement, Rectangle[] rects, int tabIndex,
                                       Rectangle iconRect, Rectangle textRect, boolean isSelected) {
        WAS_OFFSET = isSelected;    // I have no idea why this works, let's call it a hack for focus
    }

    @Override
    protected void paintTabBorder(Graphics g, int tabPlacement, int tabIndex, int x, int y, int w, int h,
                                  boolean isSelected ) {
        if(isSelected && !WAS_OFFSET) {
            x -= TAB_SELECTED_OFFSET;
        }
        super.paintTabBorder(g, tabPlacement, tabIndex, x, y, w, h, isSelected);
    }

    @Override
    protected void paintTabBackground(Graphics g, int tabPlacement, int tabIndex, int x, int y, int w, int h,
                                      boolean isSelected ) {
        if (isSelected && !WAS_OFFSET) {
            x -= TAB_SELECTED_OFFSET;
        }
        super.paintTabBackground(g, tabPlacement, tabIndex, x, y, w, h, isSelected);
    }

    @Override
    protected LayoutManager createLayoutManager() {

        return new BasicTabbedPaneUI.TabbedPaneLayout() {
            @Override
            protected void calculateTabRects(int tabPlacement, int tabCount) {
                final int spacer = 2; // should be non-negative
                final int indent = 4;

                super.calculateTabRects(tabPlacement,tabCount);

                for (int i = 0; i < rects.length; i++) {
                    rects[i].y += i * spacer + indent;
                    rects[i].x += TAB_SELECTED_OFFSET;
                }
            }

        };
    }
}
