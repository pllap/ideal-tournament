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

        this.item = contentItem;
        contentPanel.add(new JLabel(contentItem.getImage()), BorderLayout.CENTER);
        contentPanel.add(new JLabel(contentItem.toString()), BorderLayout.SOUTH);

        contentPanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                contentClick.accept(item);
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
