package graphic.titlePanel;

import javax.swing.*;
import java.awt.*;

public class MenuPanel {

    private JPanel menuPanel = new JPanel(new GridLayout(3,1,0,5));
    private final String[] MENU_TEXT = { "게임 시작", "설정", "게임 종료" };

    public MenuPanel(JButton[] menuButton) {

        Font menuFont = new Font("맑은 고딕", Font.PLAIN, 30);

        menuPanel.setBorder(BorderFactory.createEmptyBorder(100,300,50,300));
        menuPanel.setBackground(Color.white);
        for (int i = 0; i < 3; ++i) {
            menuButton[i] = new JButton(MENU_TEXT[i]);
            menuButton[i].setHorizontalAlignment(SwingConstants.CENTER);
            menuButton[i].setFont(menuFont);
            menuPanel.add(menuButton[i]);
        }
    }

    public JPanel getPanel() {
        return this.menuPanel;
    }
}
