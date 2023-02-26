package GB_metodichka_11_HomeTest;

import java.util.Arrays;
import java.util.List;

public class PrintArr {


    public static void main(String[] args) {

        System.out.println("Задание 1: ");
        String[] array = {"a", "b", "c", "d"};
        Integer[] number = {1, 2, 3, 4, 5};
        swapArr(array, 1, 2);
        System.out.println(Arrays.toString(array));
        swapArr(number, 1, 2);
        System.out.println(Arrays.toString(number));

        System.out.println("Задание 2: ");
        String[] arrayStr = {"apple", "beer", "cola", "door"};
        System.out.println("arrayStr: " + Arrays.toString(arrayStr));
        List<String> list = convertToArrayAsList(arrayStr);
        System.out.println("list: " + list);


    }

    // 1. Написать метод, который меняет два элемента массива местами (массив может быть любого ссылочного типа);
    private static <T> void swapArr(T[] arr, int index1, int index2) {
        T temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    // 2. Написать метод, который преобразует массив в ArrayList;
    public static <T>List<T> convertToArrayAsList(T array[]){
        return Arrays.asList(array);
    }

}
