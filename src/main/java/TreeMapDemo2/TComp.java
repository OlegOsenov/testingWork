package TreeMapDemo2;

import java.util.Comparator;

class TComp implements Comparator<String> {
    @Override
    public int compare(String aStr, String bStr) {
        int i, j, k;
        //найти индекс начинающий с фамилии
        i = aStr.lastIndexOf(' ');
        j = bStr.lastIndexOf(' ');
        k = aStr.substring(i).compareToIgnoreCase(bStr.substring(j));
        if (k == 0) // фамилии совпадают, проверить полное имя
            return aStr.compareToIgnoreCase(bStr);
        else
            return k;
    }
}
