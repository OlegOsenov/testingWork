package ThreadTestUI;

import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;

public class Main {

    public static void main(String[] args) {
        try {
            URL website = new URL("http://google.com");
            ReadableByteChannel rbc = Channels.newChannel(website.openStream());
            FileOutputStream file = new FileOutputStream("data.html");
            file.getChannel().transferFrom(rbc,0,Long.MAX_VALUE);
        } catch (IOException e) {
            e.printStackTrace();
        }

       /* Elements obj1 = new Elements();
        obj1.start();

        Elements obj2 = new Elements();
        obj2.start();
*/
    /*    Thread obj3 = new Thread(new NewTest());
        obj3.start();

        Thread obj4 = new Thread(new NewTest());
        obj4.start();
*/
        /*
        Thread obj5 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 10; i++) {
                    System.out.println("Элемент: " + i);
                }
            }
        });
        obj5.start();

        Thread obj6 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 10; i++) {
                    System.out.println("Элемент: " + i);
                }
            }
        });
        obj6.start();

*/

    }


}
