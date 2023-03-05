package GB_metodichka_12_metodichka.synchronizedMyV2;

import java.util.Objects;

public class Example_SB_2 {

    private Object lock1 = new Object();

    public static void main(String[] args) {
    Example_SB_2 e2 = new Example_SB_2();
        System.out.println("Старт main потока");
        new Thread(() -> e2.method1()).start();
        new Thread(() -> e2.method1()).start();

    }

    private void method1() {
        System.out.println("Метод запущен");
        System.out.println("Блок начало");
        for (int i = 0; i < 3; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Блок 1 конец");
        synchronized (lock1){
            System.out.println("Начало синхронизированного блока");
            for (int i = 0; i < 10; i++) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("Конец синхронизированного блока");
        }
        System.out.println("Метод завершил свою работу");
    }


}
