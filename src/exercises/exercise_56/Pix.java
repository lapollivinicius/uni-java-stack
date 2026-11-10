package src.exercises.exercise_56;

public class Pix implements Payments {

    @Override
    public void pay(double amount) {
        System.out.printf("%.2f was paid via Pix \n", amount);
    }

    @Override
    public void cancel(double amount) {
        System.out.printf("%.2f was not paid via Pix \n", amount);
    }
}
