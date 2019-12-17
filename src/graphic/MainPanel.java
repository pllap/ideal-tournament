package graphic;

import graphic.game.GamePanel;
import graphic.soundbar.SoundBarPanel;
import graphic.title.TitlePanel;
import logic.SoundManager;

import javax.swing.*;
import java.awt.*;

public class MainPanel {

    private JPanel mainPanel;
    private GamePanel gamePanel;
    private TitlePanel titlePanel;
    private SoundBarPanel soundBarPanel;

    public MainPanel() {

        this.mainPanel = new JPanel(new BorderLayout());

        soundBarPanel = new SoundBarPanel();
        mainPanel.add(soundBarPanel.getPanel(), BorderLayout.NORTH);

        gamePanel = new GamePanel();
        gamePanel.addRestartGame(this::restartGame);

        titlePanel = new TitlePanel(this, gamePanel, soundBarPanel);
        mainPanel.add(titlePanel.getPanel(), BorderLayout.CENTER);
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

    public JPanel getPanel() {
        return mainPanel;
    }
}
