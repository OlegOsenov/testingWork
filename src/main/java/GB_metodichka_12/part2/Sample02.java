package GB_metodichka_12.part2;

public class Sample02 {

    public static void main(String[] args) {
        System.out.println("Начало работы главного потока ....");
        MyThread myThread = new MyThread("Thread #1");
        myThread.start();

        try {
            Thread.sleep(3000);
            myThread.interrupt();
            Thread.sleep(3000);
        }catch (InterruptedException e){

        }



        System.out.println("Завершение работы главного потока ....");
    }

}

class MyThread extends Thread {

    MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.printf("Поток %s запущен \n", Thread.currentThread().getName());

        int counter = 1;

        while (!isInterrupted()) {

            System.out.println("Цикл " + counter++);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Выполнение потока было прервано");
                break;
            }
        }

        System.out.printf("Поток %s завершил свою работу \n", Thread.currentThread().getName());

    }
}
