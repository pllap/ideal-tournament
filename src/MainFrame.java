import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {

    public MainFrame() {
        setTitle("이상형 월드컵");

        JPanel mainPanel = (JPanel) getContentPane();
        mainPanel.setLayout(new BorderLayout());

        JLabel test = new JLabel("test");
        test.setHorizontalAlignment(SwingConstants.CENTER);
        test.setFont(new Font("맑은 고딕", Font.PLAIN, 30));
        mainPanel.add(test, BorderLayout.CENTER);

        setSize(1600, 900);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

}
