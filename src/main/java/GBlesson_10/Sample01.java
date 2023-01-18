package GBlesson_10;

import java.util.ArrayList;

public class Sample01 {

    public static void main(String[] args) {

        Cat cat01 = new Cat("Персик");

        ArrayList<Cat> cats = new ArrayList<>();

        cats.add(cat01);
        cats.add(cat01);
        cats.add(new Cat("Тиграша"));
        cats.add(1,new Cat("Мурзик"));

        printList(cats);

        System.out.println("Размер коллекции " + cats.size());

        cats.remove(cat01);
        System.out.println("---------------");
        printList(cats);




    }


    private static void printList(ArrayList<Cat> cats) {
        for (Cat cat: cats) {
            System.out.println(cat.getName());
        }
    }

}
