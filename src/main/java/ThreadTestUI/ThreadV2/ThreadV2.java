package ThreadTestUI.ThreadV2;

public class ThreadV2 {

    public static void main(String[] args) {
        Runnable task = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello world!");
            }
        };
        Thread thread = new Thread(task);
        thread.start();
    }

}
