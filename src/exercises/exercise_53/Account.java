package src.exercises.exercise_53;

public class Account {

    protected final String number;
    protected final String holder;
    protected int balance = 0;

    public Account(String number, String holder, int balance) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
    }

    public boolean deposit(int amount) {
        this.balance += amount;
        return true;
    }

    public boolean withdraw(int amount) {
        this.balance -= amount;
        return true;
    }

    public int consult() {
        return this.balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "number=" + number +
                ", holder='" + holder + '\'' +
                ", balance=" + balance +
                '}';
    }
}
