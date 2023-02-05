package TreeMapDemoV;

import java.util.TreeMap;

public class TreeMapDemonstration {

    public static void main(String[] args) {

        TreeMap<Integer, String> user = new TreeMap<>();
        user.put(1, "Alex");
        user.put(2, "Nik");
        user.put(3, "Leo");
        user.put(4, "John");

        // Получим объект по ключу
        System.out.println("Получим объект по ключу (2): " + user.get(2));


    }


}
