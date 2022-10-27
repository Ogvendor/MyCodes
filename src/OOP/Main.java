package OOP;

public class Main {
    public static void main(String[] args) {
        Bank cb = new Bank();

        cb.deposit(100);
        cb.withdraw(50);

        cb.deposit(60);
        cb.withdraw(100);

    }
}
