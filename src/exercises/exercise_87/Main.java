package exercises.exercise_87;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        Logger01 log1 = new Logger01();
        Logger02 log2 = new Logger02();

        for (int i = 0; i < 10; i++) {
            Thread.sleep(2000);
            log1.doSomething();
            log2.doSomething();
        }

    }



}
