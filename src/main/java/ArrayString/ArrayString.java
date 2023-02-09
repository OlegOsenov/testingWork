package ArrayString;

import java.util.HashMap;
import java.util.Map;

/*
 * 1. Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся):
 * а) Посчитать сколько раз встречается каждое слово;
 * б) Найти список уникальных слов, из которых состоит массив (дубликаты не считаем);
*/
public class ArrayString {

    public static void main(String[] args) {
        String[] words = {"cat","dog","tiger","pet","dog","dog","start","new","switch","java","pet","start","start"};


        //task 1 а

        Map<String, Integer> map = new HashMap<>();
        for (String s : words){
            map.put(s, map.getOrDefault(s,0) + 1);
        }
        System.out.println(map);


    }

}
