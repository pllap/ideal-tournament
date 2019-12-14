package graphic;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {

    private TitlePanel titlePanel;

    public MainFrame() {
        setTitle("이상형 월드컵");

        JPanel mainPanel = new JPanel();
        getContentPane().add(mainPanel, BorderLayout.CENTER);
        mainPanel.setLayout(new BorderLayout());

        TitlePanel titlePanel = new TitlePanel();
        mainPanel.add(titlePanel);

        setSize(1280, 720);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

}
