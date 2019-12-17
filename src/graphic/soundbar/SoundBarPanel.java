package graphic.soundbar;

import javax.swing.*;
import java.awt.*;
import java.util.HashMap;

public class SoundBarPanel {

    private JPanel soundBarPanel = new JPanel(new BorderLayout());

    public SoundBarPanel() {

        soundBarPanel.setBackground(Color.white);

        ImageIcon soundOnImg = new ImageIcon("res/sound_on.png");
        JLabel soundOnLabel = new JLabel(soundOnImg);

        soundBarPanel.add(soundOnLabel, BorderLayout.EAST);
    }

    public JPanel getPanel() {
        return soundBarPanel;
    }
}
