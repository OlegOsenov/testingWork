package TreeMapDemoV;

import java.util.*;

public class TreeMapDemonstration {

    public static void main(String[] args) {

        TreeMap<Integer, String> user = new TreeMap<>();
        user.put(1, "Alex");
        user.put(2, "Nik");
        user.put(3, "Leo");
        user.put(4, "John");

        // Получим объект по ключу
        System.out.println("Получим объект по ключу (2): " + user.get(2));

        // Получим вес набор ключей
        Set<Integer> keys = user.keySet();
        System.out.println("Получим весь набор ключей: " + keys);

        // Получим набор всех значение
        Collection<String> values = user.values();
        System.out.println("Получим набор всех значение: " + values);

        // Получим все объекты, после объекта с ключом 2
        Map<Integer, String> afterMap = user.tailMap(2);
        System.out.println("Получим все объекты, после объекта с ключом 2: " + afterMap);



    }


}
