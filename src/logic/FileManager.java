package logic;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class FileManager {

    public final List<ContentItem> contents = new ArrayList<>();
    private final String PATH = "res/img/";

    public FileManager() {
        for (int i = 0; i < 19; ++i) {
            contents.add(new ContentItem(new ImageIcon(PATH+i+".png"), String.valueOf(i)));
        }
    }

    public List<ContentItem> getContents() {
        return contents;
    }
}
