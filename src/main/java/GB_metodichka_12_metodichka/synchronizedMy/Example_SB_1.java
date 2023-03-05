package GB_metodichka_12_metodichka.synchronizedMy;

public class Example_SB_1 {

    public static void main(String[] args) {

        Example_SB_1 e1 = new Example_SB_1();
        new Thread(() -> e1.mothod1()).start();
        new Thread(() -> e1.method2()).start();

    }

    public synchronized void mothod1(){
        System.out.println("M1");
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("M2");
    }

    public synchronized void method2(){
        System.out.println("M1");
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


}
