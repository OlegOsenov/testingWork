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

    }

}
