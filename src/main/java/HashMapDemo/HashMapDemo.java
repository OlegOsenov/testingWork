package HashMapDemo;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

    public static void main(String[] args) {

        //Создать хэш карту
        HashMap<String, Double> hm = new HashMap<>();
        //Поместить элементы в карту
        hm.put("John Doe", 3434.34);
        hm.put("Tom Smith", 123.22);
        hm.put("Jane Baker", 1378.00);
        hm.put("Tod Hall", 99.22);

        // Получить набор элементов
        Set<Map .Entry<String, Double>> set = hm.entrySet();



    }
}
