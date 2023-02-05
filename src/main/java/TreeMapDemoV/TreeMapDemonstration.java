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

        // Получим все объекты до объекта с ключом 3
        Map<Integer, String> beforeMap = user.headMap(3);
        System.out.println("Получим все объекты до объекта с ключом 3: " + beforeMap);

        // Получим последний элемент дерева
        Map.Entry<Integer, String> lastItem = user.lastEntry();
        System.out.printf("Получим последний элемент дерева: key %d values %s\n",
                lastItem.getKey(), lastItem.getValue());

        Map<String, Person> persons = new TreeMap<>();
        persons.put("1233", new Person("Alex"));
        persons.put("3456", new Person("Ivan"));
        persons.put("76545", new Person("Petr"));

        // Перебор коллекции
        System.out.println("\nПеребор коллекции");
        for (Map.Entry<String, Person> item : persons.entrySet()){
            System.out.printf("Key: %s Value: %s \n", item.getKey(), item.getValue().getName());
        }


    }


}
