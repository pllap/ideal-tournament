package graphic.game;

import logic.ContentItem;
import logic.FontManager;

import javax.swing.*;
import java.awt.*;

public class ResultPanel {

    JPanel resultPanel = new JPanel(new BorderLayout());
    private ContentItem item;

    public ResultPanel(ContentItem contentItem) {

        resultPanel.setBackground(Color.white);
        resultPanel.setBorder(BorderFactory.createEmptyBorder(50,50,50,50));

        this.item = contentItem;

        JLabel imageLabel = new JLabel(new ImageIcon(item.getImage()));
        JLabel nameLabel = new JLabel(item.toString());

        nameLabel.setFont(FontManager.getFont(25));
        nameLabel.setHorizontalAlignment(SwingConstants.CENTER);

        resultPanel.add(imageLabel, BorderLayout.CENTER);
        resultPanel.add(nameLabel, BorderLayout.SOUTH);
    }

    public JPanel getPanel() {
        return resultPanel;
    }
}
