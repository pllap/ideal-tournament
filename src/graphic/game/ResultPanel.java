package graphic.game;

import logic.ContentItem;
import logic.FontManager;

import javax.swing.*;
import java.awt.*;

public class ResultPanel {

    JPanel resultPanel = new JPanel(new BorderLayout());
    private ContentItem item;

    public ResultPanel(ContentItem contentItem) {

        this.item = contentItem;
        resultPanel.setBorder(BorderFactory.createEmptyBorder(0,200,100,200));

        JLabel imageLabel = new JLabel(new ImageIcon(item.getImage()));
        JLabel nameLabel = new JLabel(item.toString());

        nameLabel.setFont(FontManager.getFont(25));


    }

    public JPanel getPanel() {
        return resultPanel;
    }
}
