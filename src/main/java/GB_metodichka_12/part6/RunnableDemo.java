package GB_metodichka_12.part6;

public class RunnableDemo {
    static class RunnableClass implements Runnable {
        boolean suspended = false;

        @Override
        public void run() {
            System.out.println("Запуск потока");
            try {
                for (int i = 10; i > 0; i++) {
                    System.out.println(i);
                    Thread.sleep(300);
                    synchronized (this) {
                        while (suspended) {
                            wait();
                        }
                    }
                }
            } catch (InterruptedException e) {
                System.out.println("Поток прерван");
            }
            System.out.println("Завершение потока");
        }

        public void mySuspend() {
            suspended = true;
        }

        public synchronized void myResume() {
            suspended = false;
            notify();
        }
    }

    public static void main(String[] args) {
        RunnableClass rc = new RunnableClass();
        new Thread(rc).start();
        try {
            Thread.sleep(800);
            rc.mySuspend();
            Thread.sleep(3000);
            rc.myResume();
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }

}
