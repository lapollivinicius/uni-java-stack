package src.exercises.exercise_53;

public class Main {

    public static void main(String[] args) {

        Checking ca = new Checking("123", "John", 935);
        Saving sa = new Saving("321", "Jane", 1000);
        ca.deposit(25);
        sa.withdraw(1001);
        ca.withdraw(1000);
        System.out.println(ca.consult());
        System.out.println(sa.consult());

    }
}
