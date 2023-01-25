package LinkedListDemo;

import java.util.LinkedList;

public class LinkedListDemo {

    public static void main(String[] args) {

        LinkedList<String> ll = new LinkedList<>();
        ll.add("F");
        ll.add("B");
        ll.add("D");
        ll.add("E");
        ll.add("C");
        ll.addLast("Z");
        ll.addFirst("A");
        ll.add(1,"A2");
        System.out.println("Исходное содержимое ll: " + ll);
        //Удаление элементов
        ll.remove("F");
        ll.remove(2);
        System.out.println("После удаления содержимое ll: " + ll);


    }


}
