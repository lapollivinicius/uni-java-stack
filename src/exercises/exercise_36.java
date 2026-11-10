package src.Advanced.exercises;

public class exercise_36 {

    public static void main(String[] args) {

        String result = upperCase("jorge is cool", "jor");
        System.out.println(result);

    }

    public static String upperCase(String string, String part) {
        return string.replace(part, part.toUpperCase());
    }

}
