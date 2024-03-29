package graphic.title;

import events.MenuButtonListener;
import graphic.MainPanel;
import graphic.game.GamePanel;
import graphic.setting.SettingPanel;
import graphic.soundbar.SoundBarPanel;
import logic.FontManager;

import javax.swing.*;
import java.awt.*;

public class TitlePanel {

    private JPanel titlePanel = new JPanel(new BorderLayout());

    public TitlePanel(MainPanel mainPanel, GamePanel gamePanel, SettingPanel settingPanel, SoundBarPanel soundBarPanel) {

        titlePanel.setBackground(Color.white);
        JLabel titleLabel = new JLabel("교수님 이상형 월드컵");
        titleLabel.setFont(FontManager.getFont(80));
        titleLabel.setBorder(BorderFactory.createEmptyBorder(180,0,0,0));
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
        titlePanel.add(titleLabel, BorderLayout.NORTH);

        JButton[] menuButton = new JButton[3];
        MenuPanel menuPanel = new MenuPanel(menuButton);
        titlePanel.add(menuPanel.getPanel(), BorderLayout.CENTER);

        for (int i = 0; i < 3; ++i) {
            menuButton[i].addActionListener(new MenuButtonListener(mainPanel, gamePanel, settingPanel, soundBarPanel));
        }
    }

    public JPanel getPanel() {
        return this.titlePanel;
    }
}

