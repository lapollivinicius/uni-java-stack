package oop;

// use final to class that cannot be extended
// like String, Math and other ones
public final class Final {

    private String account;
    private double balance;

    // use final to declare a constant (it cannot be modified)
    private final String number_account = "00000";

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
