package ThreadTestUI.SemaphoreThreadNext;

import java.util.concurrent.locks.LockSupport;

public class ThreadNext {

    public static void main(String[] args) throws InterruptedException {
        Runnable task = () -> {
//        Запаркуем текущий поток
            System.err.println("Will be Parked");
            LockSupport.park();
//        Как только нас распаркуют - начнем действовать
            System.err.println("Unparked");
        };
        Thread th = new Thread(task);
        th.start();
        Thread.currentThread().sleep(2000);
        System.err.println("Thread state: " + th.getState());

        LockSupport.unpark(th);
        Thread.currentThread().sleep(2000);

    }


}
