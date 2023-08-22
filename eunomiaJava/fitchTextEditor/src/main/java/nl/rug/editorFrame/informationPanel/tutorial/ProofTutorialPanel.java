package nl.rug.editorFrame.informationPanel.tutorial;

import nl.rug.editorFrame.controllerCommunication.EunomiaColors;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;
import java.awt.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/**
 * A panel containing the description of all the proof rules.
 */
public class ProofTutorialPanel extends JPanel {

    private static final double SCALING_FACTOR = 0.35;

    /**
     * Initializes the help panel.
     */
    public ProofTutorialPanel() {
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

    @Contract(" -> new")
    private @NotNull JScrollPane createIntroductionTutorial() {
        List<ImageIcon> images = new ArrayList<>();
        images.add(processImage("info_proofs/IdentityIntro.png"));
        images.add(processImage("info_proofs/ContrIntro.png"));
        images.add(processImage("info_proofs/NegIntro.png"));
        images.add(processImage("info_proofs/ConjIntro.png"));
        images.add(processImage("info_proofs/DisjIntro.png"));
        images.add(processImage("info_proofs/ImplIntro.png"));
        images.add(processImage("info_proofs/BiconIntro.png"));
        addBlankMargin(images);

        JList<ImageIcon> list = new JList<>(images.toArray(new ImageIcon[0]));
        list.setBackground(EunomiaColors.BACKGROUND_SECOND);

        return new JScrollPane(list);
    }

    @Contract(" -> new")
    private @NotNull JScrollPane createEliminationTutorial() {
        List<ImageIcon> images = new ArrayList<>();
        images.add(processImage("info_proofs/IdentityElim.png"));
        images.add(processImage("info_proofs/ContrElim.png"));
        images.add(processImage("info_proofs/NegElim.png"));
        images.add(processImage("info_proofs/ConjElim.png"));
        images.add(processImage("info_proofs/DisjElim.png"));
        images.add(processImage("info_proofs/ImpliElim.png"));
        images.add(processImage("info_proofs/BicondElim.png"));
        addBlankMargin(images);

        JList<ImageIcon> list = new JList<>(images.toArray(new ImageIcon[0]));
        list.setBackground(EunomiaColors.BACKGROUND_SECOND);

        return new JScrollPane(list);
    }

    @Contract(" -> new")
    private @NotNull JScrollPane createQuantifierTutorial() {
        List<ImageIcon> images = new ArrayList<>();
        images.add(processImage("info_proofs/UnivIntro.png"));
        images.add(processImage("info_proofs/UnivElim.png"));
        images.add(processImage("info_proofs/ExistIntro.png"));
        images.add(processImage("info_proofs/ExistElim.png"));
        addBlankMargin(images);

        JList<ImageIcon> list = new JList<>(images.toArray(new ImageIcon[0]));
        list.setBackground(EunomiaColors.BACKGROUND_SECOND);

        return new JScrollPane(list);
    }

    /**
     * Patch hack to make sure all the images can be displayed on any screen by concatenating blank images at the end
     * to the list.
     * @param images the list of images the concatenation is done on.
     */
    private void addBlankMargin(@NotNull List<ImageIcon> images) {
        images.add(processImage("info_proofs/blank.png"));
        images.add(processImage("info_proofs/blank.png"));
    }

    /**
     * Prepares the images which contain the tutorials for the proof rules.
     * @param resourcePath the path to the image in the resource folder.
     * @return the processed image.
     */
    private @NotNull ImageIcon processImage(String resourcePath) {

        URL proofURL = this.getClass().getResource("/" + resourcePath);
        assert proofURL != null;
        ImageIcon proofIcon = new ImageIcon(proofURL);
        int newWidth = (int) (proofIcon.getIconWidth() * ProofTutorialPanel.SCALING_FACTOR);
        int newHeight = (int) (proofIcon.getIconHeight() * ProofTutorialPanel.SCALING_FACTOR);

        Image image = proofIcon.getImage(); // transform it
        Image newimg = image.getScaledInstance(newWidth, newHeight,  java.awt.Image.SCALE_SMOOTH);
        proofIcon.setImage(newimg);

        return proofIcon;
    }
}
