package graphic.title;

import logic.FontManager;

import javax.swing.*;
import java.awt.*;

public class MenuPanel {

    private JPanel menuPanel = new JPanel(new GridLayout(3,1,0,5));

    public MenuPanel(JButton[] menuButton) {

        final String[] MENU_TEXT = { "게임 시작", "설정", "게임 종료" };

        menuPanel.setBorder(BorderFactory.createEmptyBorder(50,300,50,300));
        menuPanel.setBackground(Color.white);
        for (int i = 0; i < 3; ++i) {
            menuButton[i] = new JButton(MENU_TEXT[i]);
            menuButton[i].setHorizontalAlignment(SwingConstants.CENTER);
            menuButton[i].setFont(FontManager.getFont(30));
            menuPanel.add(menuButton[i]);
        }
    }

    public JPanel getPanel() {
        return this.menuPanel;
    }
}
