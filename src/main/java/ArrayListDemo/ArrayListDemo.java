package ArrayListDemo;

import java.util.ArrayList;

public class ArrayListDemo {

    public static void main(String[] args) {

        //Создать списковый массив
        ArrayList<String> al = new ArrayList<>();
        System.out.println("Начальный размер al: " + al.size());
        //Добавить элементы в список массив
        al.add("C");
        al.add("A");
        al.add("E");
        al.add("B");
        al.add("D");
        al.add("F");
        al.add(1,"A2");
        System.out.println("Размер al после добавления элементов: " + al.size());
        //Отобразить списковый массив
        System.out.println("Содержимое al: " + al);
        //Удалить элементы из списка массива
        al.remove("F");
        al.remove(2);
        System.out.println("Размер al после удаления элементов: " + al.size());
        System.out.println("Содержимое al: " + al);

    }

}
