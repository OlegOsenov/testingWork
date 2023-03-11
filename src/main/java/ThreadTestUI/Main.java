package ThreadTestUI;

public class Main {

    public static void main(String[] args) {
       /* Elements obj1 = new Elements();
        obj1.start();

        Elements obj2 = new Elements();
        obj2.start();
*/
        Thread obj3 = new Thread(new NewTest());
        obj3.start();

        Thread obj4 = new Thread(new NewTest());
        obj4.start();

    }


}
