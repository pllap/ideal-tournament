package graphic;

import javax.swing.*;
import java.awt.*;

public class GamePanel {

    JPanel gamePanel = new JPanel();

    public GamePanel() {

        gamePanel.setLayout(new BorderLayout());

        // title, NORTH
        JLabel title = new JLabel("교수님 이상형 월드컵");
        title.setBorder(BorderFactory.createEmptyBorder(50,0,0,0));
        title.setHorizontalAlignment(SwingConstants.CENTER);
        title.setFont(new Font("맑은 고딕", Font.PLAIN, 40));
        gamePanel.add(title, BorderLayout.NORTH);

        // decisionPanel
        DecisionPanel decisionPanel = new DecisionPanel();
        gamePanel.add(decisionPanel.getPanel(), BorderLayout.CENTER);
    }

    public JPanel getPanel() {
        return gamePanel;
    }
}

class DecisionPanel {

    JPanel decisionPanel = new JPanel(new BorderLayout());

    public DecisionPanel() {

        decisionPanel.setLayout(new BorderLayout());

        SelectionPanel examplePanel = new SelectionPanel();

        JButton confirmButton = new JButton("확인");
        confirmButton.setBorder(BorderFactory.createEmptyBorder(0,200,0,200));
        decisionPanel.add(confirmButton, BorderLayout.SOUTH);
    }

    public JPanel getPanel() {
        return this.decisionPanel;
    }
}

class SelectionPanel {

    JPanel selectionPanel = new JPanel(new BorderLayout());

    public SelectionPanel() {
        selectionPanel.setLayout(new BorderLayout());

        selectionPanel.add(new JButton(""), BorderLayout.CENTER);
//        this.add
    }

    public JPanel getPanel() {
        return this.selectionPanel;
    }
}