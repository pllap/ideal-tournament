package graphic;

import javax.swing.*;
import java.awt.*;

public class MainFrame {

    private JFrame mainFrame;
    private MainPanel mainPanel;

    public MainFrame() {
        mainFrame = new JFrame();
        mainFrame.setTitle("이상형 월드컵");


        // mainPanel
        mainPanel = new MainPanel();
        mainFrame.getContentPane().add(mainPanel.getPanel(), BorderLayout.CENTER);


        mainFrame.setSize(800, 600);
        mainFrame.setResizable(false);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setVisible(true);
    }
}
