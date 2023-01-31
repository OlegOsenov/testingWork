package AlgorithmsDemo;

import java.util.*;

public class AlgorithmsDemo {

    public static void main(String[] args) {

        //Создать и инициализировать связный список
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(-8);
        ll.add(20);
        ll.add(-20);
        ll.add(8);

        //Create a comparator with the reverse order
        Comparator<Integer> r = Collections.reverseOrder();

        //Sort the list using the created comparator
        Collections.sort(ll,r);

        System.out.print("Список отсортирован в обратном порядке ");
        for (int i: ll){
            System.out.print(i + " ");
        }
        System.out.println();

        //Тасовать список
        Collections.shuffle(ll);
        System.out.print("Список перетасован ");
        for (int i: ll){
            System.out.print(i + " ");
        }
        System.out.println();
        //


    }

}
