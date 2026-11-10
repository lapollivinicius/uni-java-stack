package src.oop;

// use `extends` to define inheritance for the class.
public class Inheritance extends Abstract {

    boolean isActive;

    public Inheritance(String account, boolean isActive) {
        // to access the constructor from parent class
        // use super.* to access the methods from parent class
        super(account);
        this.isActive = isActive;

    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    // from abstract method
    // use @override to implements or overwrite methods
    @Override
    public void withdrawal(double value) {
        // use super to use the super method and increment
        // super.withdrawal(value);
        double oldBalance = getBalance();
        super.setBalance(oldBalance - value);
    }

    public static void main(String[] args) {
        Inheritance bank_01 = new Inheritance("BANK-0001", true);

        bank_01.deposit(100.00);
        bank_01.withdrawal(10);

        if(bank_01.isActive()) {
            System.out.println(bank_01.getAccount() + "\n" + bank_01.getBalance());
        }
    }


}
