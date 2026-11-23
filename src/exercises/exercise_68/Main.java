package src.exercises.exercise_68;

public class Main {

    public static void main(String[] args) {
        repeat(System.out::println, 5);
    }

    public static void repeat(Operation code, int times) {
        for (int i = 0; i < times; i++) {
            code.repeat(i);
        }
    }

}
