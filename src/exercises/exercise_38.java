package src.exercises;

public class exercise_38 {

    public static void main(String[] args) {
        int result = calculate(null, null);
        System.out.println(result);
    }

    public static int calculate(Integer n1, Integer n2) {
        n1 = n1 == null ? 0 : n1;
        n2 = n2 == null ? 0 : n2;
        return n1 + n2;
    }

}
