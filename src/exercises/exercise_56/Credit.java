package src.exercises.exercise_56;

public class Credit implements Payments {

    @Override
    public void pay(double amount) {
        System.out.printf("%.2f was paid via Credit Card \n", amount);
    }

    @Override
    public void cancel(double amount) {
        System.out.printf("%.2f was not paid via Credit Card \n", amount);
    }
}
