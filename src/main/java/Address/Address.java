package Address;

public class Address {
    private String name;
    private String street;
    private String city;
    private String state;
    private String code;

    @Override
    public String toString() {
        return name + "\n" + street + "\n" + city + "\n" + state + " " + code;
    }

    Address(String n, String s, String c, String st, String cd) {
        name = n;
        street = s;
        city = c;
        state = st;
        code = cd;
    }

}
