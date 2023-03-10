package ThreadTestUI.ThreadInterapt;

import java.util.concurrent.TimeUnit;

public class ThreadInterrupted {

    public static void main(String[] args) {
        Runnable task = () -> {
            try {
                TimeUnit.SECONDS.sleep(60);
            } catch (InterruptedException e) {
                System.out.println("Interrupted");
            }
        };

        Thread thread = new Thread(task);
        thread.start();
        thread.interrupt();
    }

}
