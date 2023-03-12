package ThreadTestUI.ThreadWhile;

public class ThreadWhile {

    public static void main(String[] args) {

        Runnable task = () -> {
            while (!Thread.currentThread().isInterrupted()){
                // Do some work
            }
            System.out.println("Finished");
        };
        Thread thread = new Thread(task);
        thread.start();
        thread.interrupt();

    }

}
