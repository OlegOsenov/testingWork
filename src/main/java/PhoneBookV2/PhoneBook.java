package PhoneBookV2;

import java.util.ArrayList;
import java.util.HashMap;

public class PhoneBook {


    // Для цикла for, отображения кол-во номеров
    private static int num = 0;

    // Создаем HashMap, который принимает уникальный ключ String и ArrayList<String>
    HashMap<String, ArrayList<String>> phoneMap = new HashMap<>();

    // Стандартный метод
    public static void main(String[] args) {

        // Инициализируем PhoneBook
        PhoneBook pb = new PhoneBook();
        // Добавляем сотрудников и номера телефонов в список
        pb.add("Иванов", "8(909)345-54-56");
        pb.add("Сидоров", "8(567)235-34-87");
        pb.add("Петров", "8(234)596-21-32");
        pb.add("Пунин", "8(567)567-65-54");
        pb.add("Жиглов", "8(345)678-12-13");
        pb.add("Иванов", "8(909)345-55-55");

        // Проверка имен, если совпадает имя, вывести на экран все телефоны
        for (String x: pb.get("Иванов")){
            num++;
            System.out.println("Иванов " + num + " телефон: " + x);
        }


    }

    // Создаем методот добавления сотрудников
    private void add(String surname, String phone) {

        // Создаем отдельный ArrayList
        ArrayList<String> strings = phoneMap.get(surname); // ищу существующий фамилию
        // Выводим
        System.out.println("String = " + strings);

        if (strings == null) {
            ArrayList<String> listOfPhones = new ArrayList<>();
            listOfPhones.add(phone);
            phoneMap.put(surname, listOfPhones);

        } else {
            strings.add(phone);
            phoneMap.put(surname, strings);
        }

    }

    public ArrayList<String> get(String surmane){
        return phoneMap.get(surmane);
    }

}
