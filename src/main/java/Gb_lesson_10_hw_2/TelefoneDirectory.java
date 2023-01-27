package Gb_lesson_10_hw_2;

public class TelefoneDirectory {
    private final String surname;
    private final int telefone;

    @Override
    public String toString() {
        return "фамилия: " + surname + "\n" + "телефон: " + telefone;
    }

    public TelefoneDirectory(String surname, int telefone) {
        this.surname = surname;
        this.telefone = telefone;
    }
}
