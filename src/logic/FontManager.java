package logic;

import java.awt.*;

public class FontManager {

    public static Font getFont(String font, int type, int size) {
        return new Font(font, type, size);
    }

    public static Font getFont(String font, int size) {
        return new Font(font, Font.PLAIN, size);
    }

    public static Font getFont(int size) {
        return new Font("a옛날사진관4", Font.PLAIN, size);
    }
}
