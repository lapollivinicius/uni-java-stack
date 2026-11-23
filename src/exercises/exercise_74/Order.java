package src.exercises.exercise_74;

public class Order {

    private String customer;
    private double amount;
    private Status status;
    private boolean isVip;

    public Order(String customer, double amount, Status status, boolean isVip) {
        this.customer = customer;
        this.amount = amount;
        this.status = status;
        this.isVip = isVip;
    }

    public String getCustomer() {
        return this.customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public double getAmount() {
        return this.amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Status getStatus() {
        return this.status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public boolean isVip() {
        return this.isVip;
    }

    public void setVip(boolean vip) {
        this.isVip = vip;
    }

    @Override
    public String toString() {
        return "Order{" +
                "customer='" + customer + '\'' +
                ", amount=" + amount +
                ", status=" + status +
                ", isVip=" + isVip +
                '}';
    }
}
