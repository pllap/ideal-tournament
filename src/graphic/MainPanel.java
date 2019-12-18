package graphic;

import graphic.game.GamePanel;
import graphic.setting.SettingPanel;
import graphic.soundbar.SoundBarPanel;
import graphic.title.TitlePanel;
import logic.SoundManager;

import javax.swing.*;
import java.awt.*;

public class MainPanel {

    private JPanel mainPanel;
    private GamePanel gamePanel;
    private TitlePanel titlePanel;
    private SettingPanel settingPanel;
    private SoundBarPanel soundBarPanel;

    public MainPanel() {

        this.mainPanel = new JPanel(new BorderLayout());

        soundBarPanel = new SoundBarPanel();
        gamePanel = new GamePanel();
        settingPanel = new SettingPanel();
        titlePanel = new TitlePanel(this, gamePanel, settingPanel, soundBarPanel);

        mainPanel.add(soundBarPanel.getPanel(), BorderLayout.NORTH);
        mainPanel.add(titlePanel.getPanel(), BorderLayout.CENTER);

        gamePanel.addRestartGame(this::restartGame);
        settingPanel.addBackButtonClick(this::showTitle);
    }

    public void restartGame() {

        System.out.println("restartGame");

        SoundManager.playClick();
        mainPanel.removeAll();

        gamePanel.resetGame();
        mainPanel.add(soundBarPanel.getPanel(), BorderLayout.NORTH);
        mainPanel.add(titlePanel.getPanel(), BorderLayout.CENTER);

        mainPanel.revalidate();
        mainPanel.repaint();
    }

    public void showTitle() {

        System.out.println("restartGame");

        SoundManager.playClick();
        mainPanel.removeAll();

        mainPanel.add(soundBarPanel.getPanel(), BorderLayout.NORTH);
        mainPanel.add(titlePanel.getPanel(), BorderLayout.CENTER);

        mainPanel.revalidate();
        mainPanel.repaint();
    }

    public JPanel getPanel() {
        return mainPanel;
    }
}
