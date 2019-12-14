package graphic;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {

    private TitlePanel titlePanel;

    public MainFrame() {
        setTitle("이상형 월드컵");



        // mainPanel
        JPanel mainPanel = new JPanel(new BorderLayout());
        getContentPane().add(mainPanel, BorderLayout.CENTER);

        // titlePanel
        TitlePanel titlePanel = new TitlePanel();
        mainPanel.add(titlePanel);



        setSize(1280, 720);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
