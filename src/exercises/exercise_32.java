package src.Advanced.exercises;

public class exercise_32 {

  int account;
  String status = "standard";
  double balance = 0;

  public void withdrawal(double value) {
    this.balance += value;
  }

  public void deposit(double value) {
    this.balance -= value;
  }

  public double consult() {
    return this.balance;
  }

  public String status() {
    return this.status;
  }

  public static void main(String[] args) {
    exercise_32 account = new exercise_32();
    account.deposit(100.00);
    System.out.println(account.consult());
  }
}
