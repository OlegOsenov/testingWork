package GB_metodichka_12;

public class Classwork {
    public static void main(String[] args) {

        System.out.println("Начало работы главного потока ...");
        /*
        Thread thread = Thread.currentThread();
        System.out.println(thread.getName());
        System.out.println(thread.getPriority());

        MyThread myThread01 = new MyThread("thread #1");
        myThread01.start();

        try {
            myThread01.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        */

        /*
        MyThread[] threads = new MyThread[5];
        for (int i = 0; i < 5; i++) {
            threads[i] = new MyThread("thread #" + (i + 1));
            threads[i].start();
        }

        for (MyThread myThread : threads) {
            try {
                myThread.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

         */

        System.out.println("Завершение главного потока ...");


    }

    static class MyThread extends Thread {

        public MyThread() {
        }

        public MyThread(String name) {
            super(name);
        }

        @Override
        public void run() {
            System.out.printf("Поток %s запущен \n", Thread.currentThread().getName());
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.printf("Поток %s завершил свою работу \n", Thread.currentThread().getName());
        }
    }


}

class MyThreadV2 implements Runnable {

    @Override
    public void run() {
        System.out.printf("Поток %s запущен \n", Thread.currentThread().getName());
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.printf("Поток %s завершил свою работу \n", Thread.currentThread().getName());
    }
}
