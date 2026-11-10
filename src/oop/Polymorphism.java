package src.oop;

public class Polymorphism extends Abstract implements Interface {

    double tax = 0;

    public Polymorphism(String account) {
        super(account);
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    // use @override to implements or overwrite methods
    @Override
    public void deposit(double value) {
        double oldBalance = getBalance();
        super.setBalance(oldBalance + (value - this.tax));
    }

    @Override
    public void withdrawal(double value) {
        double oldBalance = getBalance();
        super.setBalance(oldBalance - (value + this.tax));
    }

    static void main(String[] args) {

        Polymorphism bank_02 = new Polymorphism("BANK-0001");
        bank_02.setTax(1.99);
        bank_02.deposit(100.50);
        bank_02.withdrawal(10);

        System.out.println(bank_02.getBalance());
    }

    @Override
    public void checkTax() {
        // this is a method from interface
        System.out.println(getTax());
    }
}
