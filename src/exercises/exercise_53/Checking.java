package src.exercises.exercise_53;

public class Checking extends Account {

    public Checking(String number, String holder, int balance) {
        super(number, holder, balance);
    }

    @Override
    public boolean withdraw(int amount) {
        int balance = this.balance;
        if ((balance - amount) < -100 || amount < 0) return false;
        this.balance -= amount;
        return true;
    }

}
