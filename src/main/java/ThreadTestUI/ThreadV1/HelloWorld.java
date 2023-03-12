package ThreadTestUI.ThreadV1;

public class HelloWorld {

    public static class MyThread extends Thread {
        @Override
        public void run() {
            System.out.println("Hello world!");
        }
    }

    public static void main(String[] args) {
        Thread thread = new MyThread();
        thread.start();
    }
}
