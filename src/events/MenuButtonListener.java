package events;

import graphic.MainPanel;
import graphic.game.GamePanel;
import graphic.soundbar.SoundBarPanel;
import logic.SoundManager;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuButtonListener implements ActionListener {

    MainPanel mainPanel;
    GamePanel gamePanel;
    SoundBarPanel soundBarPanel;

    public MenuButtonListener(MainPanel mainPanel, GamePanel gamePanel, SoundBarPanel soundBarPanel) {
        this.mainPanel = mainPanel;
        this.gamePanel = gamePanel;
        this.soundBarPanel = soundBarPanel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        SoundManager.playClick();
        JButton button = (JButton) e.getSource();
        String compare = button.getText();
        switch (compare) {
            case "게임 시작":
                System.out.println("game start");
                mainPanel.getPanel().removeAll();
                mainPanel.getPanel().add(soundBarPanel.getPanel(), BorderLayout.NORTH);
                mainPanel.getPanel().add(gamePanel.getPanel(), BorderLayout.CENTER);
                mainPanel.getPanel().revalidate();
                mainPanel.getPanel().repaint();
                break;
            case "설정":
                System.out.println("setting");
                break;
            case "게임 종료":
                System.out.println("exit");
                System.exit(0);
        }
    }
}
