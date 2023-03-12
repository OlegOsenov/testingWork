package ThreadTestUI.ThreadJoin;

import java.util.concurrent.TimeUnit;

public class ThreadJoin {

    public static void main(String[] args) throws InterruptedException {
        Runnable task = ()->{
            try {
                TimeUnit.SECONDS.sleep(5);
            } catch (InterruptedException e) {
                System.out.println("Interrupted");
            }
        };
        Thread thread = new Thread(task);
        thread.start();
        thread.join();
        System.out.println("Finished");
    }
}
