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

}
