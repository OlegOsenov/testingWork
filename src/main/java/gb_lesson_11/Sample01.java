package gb_lesson_11;

public class Sample01 {

    public static void main(String[] args) {

        SimpleAccount simpleAccount = new SimpleAccount(111111, 500.1);
        System.out.println(simpleAccount);

        Account<String> account = new Account<>("AAAAAbbbb", 890.45);
        System.out.println(account);


    }
}
class SimpleAccount{

    private int id;
    private double amount;

    public SimpleAccount(int id, double amount) {
        this.id = id;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return String.format("Сумма средств на счете #%s : %2f руб.", id, amount);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
class Account<TId>{

    private TId id;
    private double amount;

    public TId getId() {
        return id;
    }

    public double getAmount() {
        return amount;
    }

    public Account(TId id, double amount) {
        this.id = id;
        this.amount = amount;
    }
    @Override
    public String toString() {
        return String.format("Сумма средств на счете #%s : %2f руб.", id, amount);
    }
}

