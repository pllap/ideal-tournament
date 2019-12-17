package logic;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class FileManager {

    private final List<ContentItem> contents = new ArrayList<>();
    private final String PATH = "res/img/";

    public FileManager() {

        File data = new File(PATH);
        for (String fileName : Objects.requireNonNull(data.list())) {
            try {
                System.out.println(fileName);
                contents.add( new ContentItem(ImageIO.read(new File(PATH + fileName)), fileName.replace(".png", "")) );
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public List<ContentItem> getContents() {
        return contents;
    }

    public List<ContentItem> getShuffledContents() {

        List<ContentItem> temp = new ArrayList<>(contents);

        return ListManager.cutList(ListManager.shuffleList(temp));
    }
}
