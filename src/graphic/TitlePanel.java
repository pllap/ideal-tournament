package graphic;

import events.MenuButtonListener;

import javax.swing.*;
import java.awt.*;

public class TitlePanel extends JPanel {

    public TitlePanel() {

        this.setLayout(new BorderLayout());

        ImageIcon titleImage = new ImageIcon("res/titlePanel/titleImage.png");
        JLabel titleLabel = new JLabel(titleImage);
        this.add(titleLabel, BorderLayout.NORTH);

        JButton[] menuButton = new JButton[3];
        MenuPanel menuPanel = new MenuPanel(menuButton);
        this.add(menuPanel, BorderLayout.CENTER);
    }
}

/**
 *
 * Class for the buttons to be attached
 * @author Hyeokwoo Kwon
 */
class MenuPanel extends JPanel {

    public MenuPanel(JButton[] menuButton) {

        Font menuFont = new Font("맑은 고딕", Font.PLAIN, 20);

        this.setLayout(new GridLayout(3, 1));
        for (int i = 0; i < 3; ++i) {
            menuButton[i] = new JButton();
            menuButton[i].setHorizontalAlignment(SwingConstants.CENTER);
            menuButton[i].setFont(menuFont);
            this.add(menuButton[i]);
            menuButton[i].addActionListener(new MenuButtonListener());
        }
        menuButton[0].setText("게임 시작");
        menuButton[1].setText("설정");
        menuButton[2].setText("게임 종료");
    }
}
