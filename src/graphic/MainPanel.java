package graphic;

import graphic.game.GamePanel;
import graphic.title.TitlePanel;

import javax.swing.*;
import java.awt.*;

public class MainPanel {

    private JPanel mainPanel = new JPanel(new BorderLayout());
    private GamePanel gamePanel;
    private TitlePanel titlePanel;

    public MainPanel() {

        // gamePanel
        gamePanel = new GamePanel();

        // titlePanel
        titlePanel = new TitlePanel(this, gamePanel);
        mainPanel.add(titlePanel.getPanel(), BorderLayout.CENTER);
    }

    public JPanel getPanel() {
        return mainPanel;
    }
}
