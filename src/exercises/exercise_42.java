package src.exercises;

public class exercise_42 {

    public static void main(String[] args) {

        System.out.println(withoutNumbers("123abc123abc"));
        System.out.println(onlyNumbers("123abc123abc"));

    }

    public static String withoutNumbers(String text) {
        return text.replaceAll("\\d", "");
    }

    public static String onlyNumbers(String text) {
        return text.replaceAll("\\D", "");
    }

}
