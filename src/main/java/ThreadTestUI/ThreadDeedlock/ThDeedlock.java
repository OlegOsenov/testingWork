package ThreadTestUI.ThreadDeedlock;

public class ThDeedlock {

    static class Friend {
        private final String name;

        Friend(String name) {
            this.name = name;
        }

        String getName() {
            return this.name;
        }

        public synchronized void bow(Friend bower) {
            System.out.format("%s: %s has bowed to me!%n", this.name, bower.getName());
            bower.bowBack(this);
        }

        public synchronized void bowBack(Friend bower) {
            System.out.format("%s: %s has bowed back to me!%n", this.name, bower.getName());
        }


    }

    public static void main(String[] args) {

        final Friend alphonce = new Friend("Alphonce");
        final Friend gaston = new Friend("Gaston");
        new Thread(() -> alphonce.bow(gaston)).start();
        new Thread(() -> gaston.bow(alphonce)).start();

    }

}
