package gb_lesson_11;

public class Sample01 {

    public static void main(String[] args) {

        SimpleAccount simpleAccount = new SimpleAccount(111111, 500.1);


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
}
