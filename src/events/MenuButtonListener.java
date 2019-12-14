package events;

import graphic.GamePanel;
import graphic.TitlePanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuButtonListener implements ActionListener {

    JPanel mainPanel;
    GamePanel gamePanel;

    public MenuButtonListener(JPanel mainPanel, GamePanel gamePanel) {
        this.mainPanel = mainPanel;
        this.gamePanel = gamePanel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        JButton button = (JButton) e.getSource();
        String compare = button.getText();
        switch (compare) {
            case "게임 시작":
                mainPanel.removeAll();
                mainPanel.add(gamePanel.getPanel(), BorderLayout.CENTER);
                mainPanel.revalidate();
                mainPanel.repaint();
                break;
            case "설정":
                System.out.println("setting");
                break;
            case "게임 종료":
                System.exit(0);
        }
    }
}
