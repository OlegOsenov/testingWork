package GB_metodichka_12.part3;

public class Sample03 {

    public static void main(String[] args) {


        CommonResource commonResource = new CommonResource();

        for (int i = 0; i < 5; i++) {
            Thread t = new Thread(new CountThread(commonResource), "thread #" + (i + 1));
            t.start();
        }

    }

}

class CommonResource {

    int x = 0;
}

class CountThread implements Runnable {

    CommonResource resource;

    CountThread(CommonResource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        synchronized (resource) {
            resource.x = 1;
            for (int i = 0; i < 5; i++) {
                System.out.printf("%s - %d\n", Thread.currentThread().getName(), resource.x);
                resource.x++;
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }

        }
    }
}
