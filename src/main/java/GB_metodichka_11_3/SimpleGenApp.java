package GB_metodichka_11_3;

public class SimpleGenApp {

    public static void main(String[] args) {
        TwoGen<Integer, String> twoGenObj = new TwoGen<>(555, "Hello");
        twoGenObj.showTypes();

        int intValue = twoGenObj.getObj1();
        String strvalue = twoGenObj.getObj2();
        System.out.println(intValue);
        System.out.println(strvalue);


    }

}
