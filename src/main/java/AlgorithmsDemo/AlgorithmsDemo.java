package AlgorithmsDemo;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

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


    }

}
