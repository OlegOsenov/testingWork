package SpliteratorDemo;

import java.util.ArrayList;
import java.util.Spliterator;

public class SpliteratorDemo {
    public static void main(String[] args) {

        ArrayList<Double> vals = new ArrayList<>();
        vals.add(1.0);
        vals.add(2.0);
        vals.add(3.0);
        vals.add(4.0);
        vals.add(5.0);

        System.out.print("Содержимое vals:\n");
        Spliterator<Double> spliter = vals.spliterator();
        while (spliter.tryAdvance(System.out::println));
        System.out.println();



    }
}
