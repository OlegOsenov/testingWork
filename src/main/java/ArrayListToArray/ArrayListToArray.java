package ArrayListToArray;

import java.util.ArrayList;

public class ArrayListToArray {

    public static void main(String[] args) {
        //Преобразование ArrayList в массив
        //Создать списковый массив
        ArrayList<Integer> al = new ArrayList<>();
        //Добавить элементы в списковый массив
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        System.out.println("Содержимое массива al: " + al);
        //Получить массив
        Integer[] ia = new Integer[al.size()];
        ia = al.toArray(ia);

    }

}
