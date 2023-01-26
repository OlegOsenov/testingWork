package ArrayDequeDemo;

import java.util.ArrayDeque;

public class ArrayDequeDemo {

    public static void main(String[] args) {

        // Создать двустороннию очередь в виде массива
        ArrayDeque<String> abq = new ArrayDeque<>();
        abq.push("A");
        abq.push("B");
        abq.push("D");
        abq.push("E");
        abq.push("F");
        System.out.print("Извлечение из стека: ");
        while (abq.peek() != null){
            System.out.print(abq.pop() + " ");
        }

    }


}
