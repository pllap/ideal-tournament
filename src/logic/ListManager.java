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

        Collections.shuffle(list);
        return list;
    }

    private static int getCutListSize(List<ContentItem> list) {

        int size = list.size();

        int cutSize = 1;
        while (cutSize < size) {
            cutSize *= 2;
        }

        return cutSize/2;
    }

}
