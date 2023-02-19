package GB_metodichka_11_4;

public class StatsDemoApp {

    public static void main(String[] args) {

        Stats<Integer> intStats = new Stats<>(1, 2, 3, 4, 5);
        System.out.println("Ср.значение intStats равно " + intStats.avg());


    }

}
