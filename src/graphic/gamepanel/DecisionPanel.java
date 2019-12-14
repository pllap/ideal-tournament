package graphic.gamepanel;

import javax.swing.*;
import java.awt.*;

public class DecisionPanel {

    private JPanel decisionPanel = new JPanel(new BorderLayout());

    public DecisionPanel() {

        JButton confirmButton = new JButton("확인");
        confirmButton.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
        decisionPanel.add(confirmButton, BorderLayout.SOUTH);

        SelectionPanel westSelectionPanel = new SelectionPanel();
        SelectionPanel eastSelectionPanel = new SelectionPanel();
        decisionPanel.add(westSelectionPanel.getPanel(), BorderLayout.WEST);
        decisionPanel.add(eastSelectionPanel.getPanel(), BorderLayout.EAST);
    }

    public JPanel getPanel() {
        return this.decisionPanel;
    }
}
