package exercises;

public class exercise_34 {

    private static int number;

    exercise_34() {
        number++;
        System.out.println(number);
    }

    static void inc() {
        number++;
    }

    static void dec() {
        number--;
    }

    static int number() {
        return number;
    }

    public static void main() {
        exercise_34 myClass = new exercise_34();

        exercise_34.inc();

        System.out.println(exercise_34.number());

        exercise_34.dec();
        exercise_34.dec();

        System.out.println(exercise_34.number());

    }

}
