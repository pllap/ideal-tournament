package graphic;

import graphic.game.GamePanel;
import graphic.title.TitlePanel;

import javax.swing.*;
import java.awt.*;

public class MainFrame {

    private JPanel mainPanel;
    private TitlePanel titlePanel;
    private GamePanel gamePanel;

    public MainFrame() {
        JFrame mainFrame = new JFrame();
        mainFrame.setTitle("이상형 월드컵");


        // mainPanel
        mainPanel = new JPanel(new BorderLayout());
        mainFrame.getContentPane().add(mainPanel, BorderLayout.CENTER);

        // gamePanel
        gamePanel = new GamePanel();

        // titlePanel
        titlePanel = new TitlePanel(mainPanel, gamePanel);
        mainPanel.add(titlePanel.getPanel(), BorderLayout.CENTER);


        mainFrame.setSize(800, 600);
        mainFrame.setResizable(false);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setVisible(true);
    }
}
