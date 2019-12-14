package graphic;

import javax.swing.*;
import java.awt.*;

public class MainFrame {

    JPanel mainPanel;
    TitlePanel titlePanel;
    GamePanel gamePanel;

    public MainFrame() {
        JFrame mainFrame = new JFrame();
        mainFrame.setTitle("이상형 월드컵");


        // mainPanel
        mainPanel = new JPanel(new BorderLayout());
        mainFrame.getContentPane().add(mainPanel, BorderLayout.CENTER);

        // gamePanel
        gamePanel = new GamePanel();
//        mainPanel.add(gamePanel.getPanel(), BorderLayout.CENTER);

        // titlePanel
        titlePanel = new TitlePanel(mainPanel, gamePanel);
        mainPanel.add(titlePanel.getPanel(), BorderLayout.CENTER);


        mainFrame.setSize(1280, 720);
        mainFrame.setResizable(false);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setVisible(true);
    }
}
