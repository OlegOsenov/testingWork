package MyComp;

import java.util.TreeSet;

public class CompDemo {

    public static void main(String[] args) {

        //Создать древовидный набор
        TreeSet<String> ts = new TreeSet<>(new MyComp());

        //Добавить элементы
        ts.add("C");
        ts.add("A");
        ts.add("B");
        ts.add("E");
        ts.add("F");
        ts.add("D");
    }

}
