package graphic;

import graphic.game.GamePanel;
import graphic.title.TitlePanel;

import javax.swing.*;
import java.awt.*;

public class MainPanel {

    private JPanel mainPanel;
    private GamePanel gamePanel;
    private TitlePanel titlePanel;

    public MainPanel() {

        this.mainPanel = new JPanel(new BorderLayout());

        // gamePanel
        gamePanel = new GamePanel();
        gamePanel.addRestartGame(this::restartGame);

        // titlePanel
        titlePanel = new TitlePanel(this, gamePanel);
        mainPanel.add(titlePanel.getPanel(), BorderLayout.CENTER);
    }

    public void restartGame() {

        System.out.println("restartGame");

        mainPanel.removeAll();

        gamePanel.resetGame();
        mainPanel.add(titlePanel.getPanel(), BorderLayout.CENTER);

        mainPanel.revalidate();
        mainPanel.repaint();
    }

    public JPanel getPanel() {
        return mainPanel;
    }
}
