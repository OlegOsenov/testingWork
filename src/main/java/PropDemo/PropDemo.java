package PropDemo;

import java.util.Objects;
import java.util.Properties;
import java.util.Set;

public class PropDemo {

    public static void main(String[] args) {

        Properties capitals = new Properties();
        capitals.setProperty("Иллинойс", "Спрингфилд");
        capitals.setProperty("Миссури", "Джефферсон-Сити");
        capitals.setProperty("Вашингтон", "Олимпия");
        capitals.setProperty("Калифорния", "Сакраменто");
        capitals.setProperty("Индиана", "Индианаполис");
        // Получить представление в виде набора для ключей
        Set<?> states = capitals.keySet();
        // Отобразить все штаты и их столицы
        for (Object name : states) {
            System.out.println("Столица штата " + name + " - " + capitals.getProperty((String) name) + ".");
            System.out.println();
        }
        // Найти штат, отсутсвующий в списке - указать стандартные значение
        String str = capitals.getProperty("Флорида", "не найдена");
        System.out.println("Столица шатата Флориды - " + str);

    }


}
