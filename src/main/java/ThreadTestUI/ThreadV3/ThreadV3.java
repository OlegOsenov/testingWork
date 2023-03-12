package ThreadTestUI.ThreadV3;

public class ThreadV3 {

    public static void main(String[] args) {
        Runnable task = ()->{
            System.out.println("Hello world!");
        };
        Thread thread = new Thread(task);
        thread.start();

    }
}
