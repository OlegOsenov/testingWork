package CollectionCB_10;

import java.util.*;

public class CollectionsExample {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Januare");
        list.add("February");
        list.add("March");
        list.add(0,"February");
        list.remove("February");
        list.addAll(Arrays.asList("April","May","June"));
        System.out.println(list);
        System.out.println(list.size());
        System.out.println("----------------------------------------");
        Set<String> set = new HashSet<>();
        set.add("Januare");
        set.add("February");
        set.add("March");
        System.out.println(set);

    }
}
