package graphic.title;

import events.MenuButtonListener;
import graphic.game.GamePanel;

import javax.swing.*;
import java.awt.*;

public class TitlePanel {

    private JPanel titlePanel = new JPanel(new BorderLayout());

    public TitlePanel(JPanel mainPanel, GamePanel gamePanel) {

        titlePanel.setBackground(Color.white);
        JLabel titleLabel = new JLabel("교수님 이상형 월드컵");
        titleLabel.setFont(new Font("a옛날사진관4", Font.PLAIN, 80));
        titleLabel.setBorder(BorderFactory.createEmptyBorder(180,0,0,0));
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
        titlePanel.add(titleLabel, BorderLayout.NORTH);

        JButton[] menuButton = new JButton[3];
        MenuPanel menuPanel = new MenuPanel(menuButton);
        titlePanel.add(menuPanel.getPanel(), BorderLayout.CENTER);

        for (int i = 0; i < 3; ++i) {
            menuButton[i].addActionListener(new MenuButtonListener(mainPanel, gamePanel));
        }
    }

    public JPanel getPanel() {
        return this.titlePanel;
    }
}

