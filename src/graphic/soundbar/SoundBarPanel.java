package graphic.soundbar;

import logic.SoundManager;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class SoundBarPanel {

    private JPanel soundBarPanel = new JPanel(new BorderLayout());

    public SoundBarPanel() {

        soundBarPanel.setBackground(Color.white);

        ImageIcon soundOnImg = new ImageIcon("res/sound_on.png");
        ImageIcon soundOffImg = new ImageIcon("res/sound_off.png");
        JLabel soundLabel = new JLabel(soundOnImg);

        soundLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                JLabel label = (JLabel) e.getSource();
                if (soundOnImg.equals(label.getIcon())) {
                    label.setIcon(soundOffImg);
                    SoundManager.stopBgm();
                }
                else {
                    label.setIcon(soundOnImg);
                    SoundManager.playBgm();
                }
            }
        });

        soundBarPanel.add(soundLabel, BorderLayout.EAST);
    }

    public JPanel getPanel() {
        return soundBarPanel;
    }
}
