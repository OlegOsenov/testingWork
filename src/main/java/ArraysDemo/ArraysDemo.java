package ArraysDemo;

import java.util.Arrays;

public class ArraysDemo {

    public static void main(String[] args) {

        // Разместить в памяти и распределить массив
        int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = -3 * i;
        }
        // Отобразать, отсортировать и снова отобразить содержимое массива
        System.out.print("Исходный массив: ");
        display(array);
        Arrays.sort(array);
        System.out.print("Содержимое после сортировки: ");
        display(array);
        //Заполнить массив и отобразить его содержимое
        Arrays.fill(array, 2, 6, -1);
        System.out.print("Содержимое после вызова fill(): ");
        display(array);
        // Отсортировать массив и отобразить его содержимое
        Arrays.sort(array);
        System.out.print("Содержимое после повторной сортировки: ");
        Arrays.sort(array);
        display(array);


    }

    static void display(int[] array) {
        for (int i : array)
            System.out.print(i + " ");
        System.out.println();
    }


}
