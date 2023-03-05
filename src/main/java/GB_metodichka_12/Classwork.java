package GB_metodichka_12;

public class Classwork {
    public static void main(String[] args) {

        System.out.println("Начало работы главного потока ...");

        Thread thread = Thread.currentThread();
        System.out.println(thread.getName());
        System.out.println(thread.getPriority());

        MyThread myThread01 = new MyThread("thread #1");
        myThread01.start();

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
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.printf("Поток %s завершил свою работу \n", Thread.currentThread().getName());
        }
    }


}
