package Address;

import java.util.LinkedList;

public class MyList {

    public static void main(String[] args) {

        LinkedList<Address> ml = new LinkedList<>();
        //Добавить элементы
        ml.add(new Address("J.W. West", "11 Oak Ave",
                "Urbana", "IL", "61801"));
        ml.add(new Address("Oleg Osenov", "1142 Maple Lane",
                "Mahomet", "IL", "61853"));
        ml.add(new Address("Ivan Ivanov", "867 Elm St",
                "Champing", "IL", "61820"));

        //Отобразить содержимое списка почтовых адресов
        for (Address element : ml)
            System.out.println(element + "\n");
        System.out.println();

    }
}
