package graphic.gamepanel;

import javax.swing.*;
import java.awt.*;

public class SelectionPanel {

    private JPanel selectionPanel = new JPanel(new BorderLayout());

    public SelectionPanel() {

        selectionPanel.add(new JButton("image"), BorderLayout.CENTER);
        selectionPanel.add(new JLabel("text"), BorderLayout.SOUTH);
    }

    public JPanel getPanel() {
        return this.selectionPanel;
    }
}
