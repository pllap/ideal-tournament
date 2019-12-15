package logic;

import javax.swing.*;

public class ContentItem {

    private final ImageIcon image;
    private final String name;

    public ContentItem(ImageIcon image, String name) {
        this.image = image;
        this.name = name;
    }

    public ImageIcon getImage() {
        return image;
    }

    @Override
    public String toString() {
        return name;
    }
}
