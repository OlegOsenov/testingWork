package GBlesson_10;

import java.util.ArrayList;
import java.util.LinkedList;

public class Sample03 {
    public static void main(String[] args) {

        Cat cat01 = new Cat("Персик");
        LinkedList<Cat> cats = new LinkedList<>();
        cats.add(cat01);
        cats.add(cat01);
        cats.add(new Cat("Тиграша"));
        cats.add(1,new Cat("Мурзик"));

        printList(cats);

        System.out.println("Размер коллекции " + cats.size());

        cats.remove(cat01);
        System.out.println("---------------");
        printList(cats);
        System.out.println("---------------");
        Cat cat02 = cats.peekFirst();
        System.out.println(cat02.getName());




    }


    private static void printList(LinkedList<Cat> cats) {
        for (Cat cat: cats) {
            System.out.println(cat.getName());
        }
    }

}
