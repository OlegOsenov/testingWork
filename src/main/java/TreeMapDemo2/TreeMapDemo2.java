package TreeMapDemo2;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo2 {

    public static void main(String[] args) {

        //Создать древовидную карту
        TreeMap<String, Double> tm = new TreeMap<>(new TComp());
        //Поместить элементы в карту
        tm.put("John Doe", 3434.34);
        tm.put("Tom Sims", 123.22);
        tm.put("Jane Kalistr", 1378.00);
        tm.put("Ivan Vasiliev", 5434.55);
        tm.put("Jon Junior", 123.3);
        //Получить набор элементов
        Set<Map.Entry<String, Double>> set = tm.entrySet();
        //Отобразить элементы
        for (Map.Entry<String, Double> me: set){
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }
        System.out.println();
        //Пополнить счет клиента John Doe на 1000
        double balance = tm.get("John Doe");
        tm.put("John Doe", balance + 1000);
        System.out.println("Новый баланс клиента John Doe: " + tm.get("John Doe"));

    }

}
