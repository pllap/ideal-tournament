package logic;

import javax.swing.*;
import java.awt.image.BufferedImage;

public class ContentItem {

    private final BufferedImage image;
    private final String name;

    public ContentItem(BufferedImage image, String name) {
        this.image = image;
        this.name = name;
    }

    public BufferedImage getImage() {
        return image;
    }

    @Override
    public String toString() {
        return name;
    }
}
