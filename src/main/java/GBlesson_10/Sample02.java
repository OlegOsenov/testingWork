package GBlesson_10;

import java.util.ArrayList;
import java.util.HashSet;

public class Sample02 {

    public static void main(String[] args) {

        Cat cat01 = new Cat("Персик");
        HashSet<Cat> cats = new HashSet<>();
        cats.add(cat01);
        cats.add(cat01);
        cats.add(new Cat("Тиграша"));
        cats.add(new Cat("Мурзик"));


        // printList(cats);

        printHashSet(cats);

        System.out.println("Размер коллекции " + cats.size());

        cats.remove(cat01);
        System.out.println("---------------");

        printHashSet(cats);


    }

    private static void printHashSet(HashSet<Cat> cats) {
        for (Cat cat : cats) {
            System.out.println(cat.getName());
        }
    }


}

