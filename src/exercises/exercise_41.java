package src.exercises;

public class exercise_41 {

    public static void main(String[] args) {
        System.out.println(rollDice());
    }

    public static int rollDice() {
        return (int) Math.ceil(Math.random() * 6);
    }

}
