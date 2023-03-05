package GB_metodichka_12;

public class Classwork {
    public static void main(String[] args) {

        System.out.println("Начало работы главного потока ...");

        Thread thread = Thread.currentThread();
        System.out.println(thread.getName());
        System.out.println(thread.getPriority());

        System.out.println("Завершение главного потока ...");


    }

    static class MyThread extends Thread{

        public MyThread(){}
        public MyThread(String name){
            super(name);
        }
        @Override
        public void run() {
            System.out.println("Hello from MyThread!!!, Thread  name is " + Thread.currentThread().getName());
        }
    }


}
