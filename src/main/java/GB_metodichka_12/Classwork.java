package GB_metodichka_12;

public class Classwork {
    public static void main(String[] args) {

        System.out.println("Hello from main!!!, Thread  name is " + Thread.currentThread().getName());

        Thread t1 = new MyThread();
        t1.start();


    }

    static class MyThread extends Thread{
        @Override
        public void run() {
            System.out.println("Hello from MyThread!!!, Thread  name is " + Thread.currentThread().getName());
        }
    }


}
