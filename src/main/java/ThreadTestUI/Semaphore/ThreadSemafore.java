package ThreadTestUI.Semaphore;

import java.util.concurrent.Semaphore;

public class ThreadSemafore {

    public static void main(String[] args) {

        Semaphore semaphore = new Semaphore(0);
        try {
            semaphore.acquire();
        } catch (InterruptedException e) {
//            Просим разрешение и ждем, пока не получим его
            e.printStackTrace();
        }
        System.out.println("Hello world!");

    }



}
