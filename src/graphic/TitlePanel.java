package graphic;

import events.MenuButtonListener;

import javax.swing.*;
import java.awt.*;

public class TitlePanel {

    private JPanel titlePanel = new JPanel(new BorderLayout());
    private final String TITLE_IMAGE_PATH = "res/titlePanel/titleImage.png";

    public TitlePanel(JPanel mainPanel, GamePanel gamePanel) {

        titlePanel.setLayout(new BorderLayout());

        ImageIcon titleImage = new ImageIcon(TITLE_IMAGE_PATH);
        JLabel titleLabel = new JLabel(titleImage);
        titlePanel.add(titleLabel, BorderLayout.NORTH);

        JButton[] menuButton = new JButton[3];
        MenuPanel menuPanel = new MenuPanel(menuButton);
        titlePanel.add(menuPanel, BorderLayout.CENTER);

        for (int i = 0; i < 3; ++i) {
            menuButton[i].addActionListener(new MenuButtonListener(mainPanel, gamePanel));
        }
    }

    public JPanel getPanel() {
        return this.titlePanel;
    }
}

/**
 *
 * Class for the buttons to be attached
 * @author Hyeokwoo Kwon
 */
class MenuPanel extends JPanel {

    private final String[] MENU_TEXT = { "게임 시작", "설정", "게임 종료" };

    public MenuPanel(JButton[] menuButton) {

        Font menuFont = new Font("맑은 고딕", Font.PLAIN, 50);

        this.setLayout(new GridLayout(3, 1, 0,5));
        this.setBorder(BorderFactory.createEmptyBorder(50,400,50,400));
        this.setBackground(Color.white);
        for (int i = 0; i < 3; ++i) {
            menuButton[i] = new JButton(MENU_TEXT[i]);
            menuButton[i].setHorizontalAlignment(SwingConstants.CENTER);
            menuButton[i].setFont(menuFont);
            this.add(menuButton[i]);
        }
    }
}
