package oop;

// this class cannot be instantiated
public abstract class Abstract {

    private String account;
    private double balance;

    Abstract(String account) {
        this.account = account;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public void setBalance(double value) {
        this.balance = value;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double value) {
        double oldBalance = this.getBalance();
        this.setBalance(oldBalance + value);
    }

    public abstract void withdrawal(double value);
}
