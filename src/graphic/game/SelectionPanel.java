package graphic.game;

import javax.swing.*;
import java.awt.*;

public class SelectionPanel {

    private JPanel selectionPanel = new JPanel(new BorderLayout());
    private boolean isSelected = false;

    public SelectionPanel() {

        selectionPanel.add(new JButton("image"), BorderLayout.CENTER);
        selectionPanel.add(new JLabel("text"), BorderLayout.SOUTH);
    }

    public Color getBackground() {
        return this.selectionPanel.getBackground();
    }

    public void setBackground(Color color) {
        this.selectionPanel.setBackground(color);
    }

    public boolean getSelected() {
        return isSelected;
    }

    public void setSelected(boolean selected) {
        isSelected = selected;
    }

    public JPanel getPanel() {
        return this.selectionPanel;
    }
}
