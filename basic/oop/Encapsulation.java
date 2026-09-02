package oop;

public class Encapsulation {

    private String account;
    private double balance;

    Encapsulation(String account) {
        this.account = account;
    }

    // setter
    public void setBalance(double value) {
        balance = value;
    }

    // getter
    public double getBalance() {
        return balance;
    }

}
