package graphic.game;

import logic.ContentItem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.function.Consumer;

public class ContentPanel {

    private JPanel contentPanel = new JPanel(new BorderLayout());

    private Consumer<ContentItem> contentClick;
    private ContentItem item;

    public ContentPanel(ContentItem contentItem) {

        contentPanel.setBorder(BorderFactory.createEmptyBorder(50,50,50,50));
        contentPanel.setBackground(Color.white);

        this.item = contentItem;
        JLabel imageLabel = new JLabel(new ImageIcon(contentItem.getImage()));
        JLabel nameLabel = new JLabel(contentItem.toString());
        nameLabel.setHorizontalAlignment(SwingConstants.CENTER);
        nameLabel.setFont(new Font("a옛날사진관4", Font.PLAIN, 25));

        contentPanel.add(imageLabel, BorderLayout.CENTER);
        contentPanel.add(nameLabel, BorderLayout.SOUTH);

        contentPanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                contentClick.accept(item);
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                contentPanel.setBackground(Color.pink);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                contentPanel.setBackground(Color.white);
            }
        });
    }

    public void addContentClick(Consumer<ContentItem> contentClick) {
        this.contentClick = contentClick;
    }

    public JPanel getPanel() {
        return contentPanel;
    }
}
