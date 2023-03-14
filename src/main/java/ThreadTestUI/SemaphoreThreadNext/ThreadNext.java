package ThreadTestUI.SemaphoreThreadNext;

import java.util.concurrent.locks.LockSupport;

public class ThreadNext {
    Runnable task = () -> {
//        Запаркуем текущий поток
        System.err.println("Will be Parked");
        LockSupport.park();
//        Как только нас распаркуют - начнем действовать
        System.err.println("Unparked");
    };

}
