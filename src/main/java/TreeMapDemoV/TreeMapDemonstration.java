package TreeMapDemoV;

import java.util.Collection;
import java.util.Collections;
import java.util.Set;
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

        // Получим вес набор ключей
        Set<Integer> keys = user.keySet();
        System.out.println("Получим весь набор ключей: " + keys);

        // Получим набор всех значение
        Collection<String> values = user.values();
        System.out.println("Получим набор всех значение: " + values);



    }


}
