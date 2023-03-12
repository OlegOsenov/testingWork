package ThreadTestUI.ThreadGroup;
public class ThreadGroup {

    public static void main(String[] args) {
        Thread currentThread = Thread.currentThread();
        java.lang.ThreadGroup threadGroup = currentThread.getThreadGroup();
        System.out.println("Thread: " + currentThread.getName());
        System.out.println("Thread Group: " + threadGroup.getName());
        System.out.println("Parent Group: " + threadGroup.getParent().getName());
    }

}
