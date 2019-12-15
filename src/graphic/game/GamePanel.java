package graphic.game;

import javax.swing.*;
import java.awt.*;

public class GamePanel {

    private JPanel gamePanel = new JPanel(new BorderLayout());

    public GamePanel() {

        // gamePanelTitle, NORTH
        JLabel gamePanelTitle = new JLabel("교수님 이상형 월드컵");
        gamePanelTitle.setBorder(BorderFactory.createEmptyBorder(50,0,0,0));
        gamePanelTitle.setHorizontalAlignment(SwingConstants.CENTER);
        gamePanelTitle.setFont(new Font("맑은 고딕", Font.PLAIN, 40));
        gamePanel.add(gamePanelTitle, BorderLayout.NORTH);

        // decisionPanel
        DecisionPanel decisionPanel = new DecisionPanel();
        gamePanel.add(decisionPanel.getPanel(), BorderLayout.CENTER);
    }

    public JPanel getPanel() {
        return gamePanel;
    }
}
