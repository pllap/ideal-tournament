package graphic.game;

import events.SelectionListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class DecisionPanel {

    private JPanel decisionPanel = new JPanel(new BorderLayout());

    public DecisionPanel() {

        decisionPanel.setBorder(BorderFactory.createEmptyBorder(0,50,0,50));

        JButton confirmButton = new JButton("확인");
        confirmButton.setBorder(BorderFactory.createEmptyBorder(0,0,10,0));
        decisionPanel.add(confirmButton, BorderLayout.SOUTH);

        SelectionPanel westSelectionPanel = new SelectionPanel();
        SelectionPanel eastSelectionPanel = new SelectionPanel();
        decisionPanel.add(westSelectionPanel.getPanel(), BorderLayout.WEST);
        decisionPanel.add(eastSelectionPanel.getPanel(), BorderLayout.EAST);

        westSelectionPanel.getPanel().addMouseListener(new SelectionListener());
        eastSelectionPanel.getPanel().addMouseListener(new SelectionListener());
    }

    public JPanel getPanel() {
        return this.decisionPanel;
    }
}
