package MyComp;

import java.util.Comparator;

class MyComp implements Comparator<String> {
    @Override
    public int compare(String aStr, String bStr) {
        return bStr.compareTo(aStr);

    }
}
