package logic;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class FileManager {

    int numData = 0;
    private final List<ContentItem> contents = new ArrayList<>();
    private final String PATH = "res/img/";
    private String[] names = {
            "이상한 총장님","황기태 교수님","유상미 교수님","권영미 교수님","김남윤 교수님","강희중 교수님",
            "최병수 교수님","정인환 교수님","장재영 교수님","엄종석 교수님","민경진 교수님","이재문 교수님",
            "김진환 교수님","계희원 교수님","이항찬 교수님","김성동 교수님","김진모 교수님","이석기 교수님",
            "황호영 교수님","김영웅 교수님","정인환 교수님","허준영 교수님"
    };

    public FileManager() {

        File data = new File(PATH);
        int i = 0;
        for (String fileName : Objects.requireNonNull(data.list())) {
            try {
                contents.add( new ContentItem(ImageIO.read(new File(PATH + i + ".png")), names[i]) );
                ++i;
            } catch (IOException e) {
                System.out.println(i);
                e.printStackTrace();
            }
        }

        numData = i;
    }

    public List<ContentItem> getContents() {
        return contents;
    }

    public List<ContentItem> getShuffledContents() {

        List<ContentItem> temp = new ArrayList<>(contents);

        return ListManager.cutList(ListManager.shuffleList(temp));
    }

    public int getNumData() {
        return numData;
    }
}
