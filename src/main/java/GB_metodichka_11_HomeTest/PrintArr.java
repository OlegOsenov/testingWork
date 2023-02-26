package GB_metodichka_11_HomeTest;

import java.util.Arrays;

public class PrintArr {



    public static void main(String[] args) {

        String[] array = {"a", "b", "c", "d"};
        Integer[] number = {1, 2, 3, 4, 5};
        swapArr(array,1,2);
        System.out.println(Arrays.toString(array));
        swapArr(number,1,2);
        System.out.println(Arrays.toString(number));


    }

    // 1. Написать метод, который меняет два элемента массива местами (массив может быть любого ссылочного типа);
    private static  <T> void swapArr(T[] arr, int index1, int index2) {
        T temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

}
