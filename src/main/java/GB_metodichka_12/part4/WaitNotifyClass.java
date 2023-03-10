package GB_metodichka_12.part4;

public class WaitNotifyClass {

    private final Object mon = new Object();
    private volatile char currentLetter = 'A';

    public static void main(String[] args) {

        WaitNotifyClass w = new WaitNotifyClass();
        Thread t1 = new Thread(() -> {
            w.printA();
        });
        Thread t2 = new Thread(()->{
            w.prinB();
        });
        t1.start();
        t2.start();

        }

    private void prinB() {
        synchronized (mon){
            try {
                for (int i = 0; i < 3; i++) {
                    while (currentLetter != 'B'){
                        mon.wait();
                    }
                    System.out.print("B");
                    currentLetter = 'A';
                    mon.notify();
                }
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }

    private void printA() {
        synchronized (mon){
            try {
                for (int i = 0; i < 3; i++) {
                    while (currentLetter != 'A'){
                        mon.wait();
                    }
                    System.out.print("A");
                    currentLetter = 'B';
                    mon.notify();
                }
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
        }

    }


}
