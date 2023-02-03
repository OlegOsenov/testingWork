package GB_HOME_10_Sring;

import java.util.Arrays;
import java.util.HashMap;
import java.util.TreeSet;

public class Main {
    // Создать массив с набором слов
    // Найти и вывести список уникальных слов, из которых состоит массив(дубликаты не считаем)
    // Подсчитать сколько раз встречается каждое слово

    private static final String words =
            "Lie upon the lie " +
                    "upon the lie " +
                    "upon the lie " +
                    "upon the lie " +
                    "And it all comes down to this " +
                    "That a pig is a pig is a pig is a pig";

    private static TreeSet<String> getWords(String[] arr) {
        return new TreeSet<>(Arrays.asList(arr));
    }

    private static HashMap<String, Integer> getWordsCount(String[] arr){
        HashMap<String, Integer> map = new HashMap<>();
    }

    public static void main(String[] args) {
        System.out.println(getWords(words.toLowerCase().split(" ")));
        System.out.println(getWordsCount(words.toLowerCase().split(" ")));
    }


}
