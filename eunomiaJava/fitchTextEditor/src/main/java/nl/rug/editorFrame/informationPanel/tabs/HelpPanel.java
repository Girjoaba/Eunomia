package nl.rug.editorFrame.informationPanel.tabs;

import nl.rug.editorFrame.communication.EunomiaColors;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;
import java.awt.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/**
 * A panel containing the description of all the proof rules.
 */
public class HelpPanel extends JPanel {

    private static final double SCALING_FACTOR = 0.35;

    /**
     * Initializes the help panel.
     */
    public HelpPanel() {
        initHelpPanel();
    }

    private void initHelpPanel() {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        setPreferredSize(new Dimension(300, 600));
        setMinimumSize(new Dimension(0, 0));
        setBackground(EunomiaColors.BACKGROUND_SECOND);

        addProofTutorials();
    }

    private void addProofTutorials() {

        JTabbedPane introElimPanel = new JTabbedPane(JTabbedPane.TOP);
        introElimPanel.addTab("Introduction", createIntroductionTutorial());
        introElimPanel.addTab("Elimination", createEliminationTutorial());
        introElimPanel.addTab("Quantifier", createQuantifierTutorial());
        add(introElimPanel);
    }

    private @NotNull ImageIcon prepareImage(double scalingFactor, String resourcePath) {

        URL proofURL = this.getClass().getResource("/" + resourcePath);
        assert proofURL != null;
        ImageIcon proofIcon = new ImageIcon(proofURL);
        int newWidth = (int) (proofIcon.getIconWidth() * scalingFactor);
        int newHeight = (int) (proofIcon.getIconHeight() * scalingFactor);

        Image image = proofIcon.getImage(); // transform it
        Image newimg = image.getScaledInstance(newWidth, newHeight,  java.awt.Image.SCALE_SMOOTH);
        proofIcon.setImage(newimg);

        return proofIcon;
    }

    private JScrollPane createIntroductionTutorial() {
        List<ImageIcon> images = new ArrayList<>();
        images.add(prepareImage(SCALING_FACTOR, "info_proofs/IdentityIntro.png"));
        images.add(prepareImage(SCALING_FACTOR, "info_proofs/ContrIntro.png"));
        images.add(prepareImage(SCALING_FACTOR, "info_proofs/NegIntro.png"));
        images.add(prepareImage(SCALING_FACTOR, "info_proofs/ConjIntro.png"));
        images.add(prepareImage(SCALING_FACTOR, "info_proofs/DisjIntro.png"));
        images.add(prepareImage(SCALING_FACTOR, "info_proofs/ImplIntro.png"));
        images.add(prepareImage(SCALING_FACTOR, "info_proofs/BiconIntro.png"));

        JList<ImageIcon> list = new JList<>(images.toArray(new ImageIcon[0]));
        list.setBackground(EunomiaColors.BACKGROUND_SECOND);

        return new JScrollPane(list);
    }

    private JScrollPane createEliminationTutorial() {
        List<ImageIcon> images = new ArrayList<>();
        images.add(prepareImage(SCALING_FACTOR, "info_proofs/IdentityElim.png"));
        images.add(prepareImage(SCALING_FACTOR, "info_proofs/ContrElim.png"));
        images.add(prepareImage(SCALING_FACTOR, "info_proofs/NegElim.png"));
        images.add(prepareImage(SCALING_FACTOR, "info_proofs/ConjElim.png"));
        images.add(prepareImage(SCALING_FACTOR, "info_proofs/DisjElim.png"));
        images.add(prepareImage(SCALING_FACTOR, "info_proofs/ImpliElim.png"));
        images.add(prepareImage(SCALING_FACTOR, "info_proofs/BicondElim.png"));

        JList<ImageIcon> list = new JList<>(images.toArray(new ImageIcon[0]));
        list.setBackground(EunomiaColors.BACKGROUND_SECOND);

        return new JScrollPane(list);
    }

    private JScrollPane createQuantifierTutorial() {
        List<ImageIcon> images = new ArrayList<>();
        images.add(prepareImage(SCALING_FACTOR, "info_proofs/UnivIntro.png"));
        images.add(prepareImage(SCALING_FACTOR, "info_proofs/UnivElim.png"));
        images.add(prepareImage(SCALING_FACTOR, "info_proofs/ExistIntro.png"));
        images.add(prepareImage(SCALING_FACTOR, "info_proofs/ExistElim.png"));

        JList<ImageIcon> list = new JList<>(images.toArray(new ImageIcon[0]));
        list.setBackground(EunomiaColors.BACKGROUND_SECOND);

        return new JScrollPane(list);
    }
}
