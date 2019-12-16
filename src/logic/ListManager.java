package logic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListManager {

    public static List<ContentItem> cutList(List<ContentItem> list) {

        List<ContentItem> temp = new ArrayList<>();
        int size = getCutListSize(list);
        for (int i = 0; i < size; ++i) {
            temp.add(list.get(i));
        }
        return temp;
    }

    public static List<ContentItem> shuffleList(List<ContentItem> list) {

        List<ContentItem> temp = list;
        Collections.shuffle(temp);
        return temp;
    }

    private static int getCutListSize(List<ContentItem> list) {

        int size = list.size();
        if (size <= 1) {
            return 1;
        }
        else if (size < 4) {
            return 2;
        }
        else if (size < 8) {
            return 4;
        }
        else if (size < 16) {
            return 8;
        }
        else if (size < 32) {
            return 16;
        }
        else if (size < 64) {
            return 32;
        }
        else if (size < 128) {
            return 64;
        }
        else {
            return 128;
        }
    }

}
