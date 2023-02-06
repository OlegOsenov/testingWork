package PhoneBookTestVers2;

public class Main {

    public static void main(String[] args) {

        PhoneBookVers2 phoneBookVers2 = new PhoneBookVers2();
        phoneBookVers2.add("Conor", "89273456789");
        phoneBookVers2.add("Jone", "89273445632");
        phoneBookVers2.add("Arni", "89279994577");
        phoneBookVers2.add("Osen", "89273456888");
        phoneBookVers2.add("Conor", "89173245696");
        phoneBookVers2.add("Arni", "89176994577");

        System.out.println("phone Conor: " + phoneBookVers2.get("Conor"));
        System.out.println("phone Arni: " + phoneBookVers2.get("Arni"));
        System.out.println(phoneBookVers2.getAllSurname());


    }

}
