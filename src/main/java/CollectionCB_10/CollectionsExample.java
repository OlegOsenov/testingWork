package CollectionCB_10;

import java.util.ArrayList;
import java.util.List;

public class CollectionsExample {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Januare");
        list.add("February");
        list.add("March");
        list.add(0,"February");
        list.remove("February");
        System.out.println(list);
        System.out.println(list.size());

    }
}
