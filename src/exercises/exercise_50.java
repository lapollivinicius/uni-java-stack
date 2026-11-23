package src.exercises;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;

public class exercise_50 {

    public static void main(String[] args) {

        System.out.println(verifyNumber(n -> n > 2 , 11));
        System.out.println(transformText(String::toUpperCase, "Eniesta"));
        System.out.println(calculate(Math::max, 10, 11));
    }

    public static boolean verifyNumber(Predicate<Integer> func, int n) {
        return func.test(n);
    };

    public static String transformText(Function<String, String> func, String text) {
        return func.apply(text);
    }

    public static int calculate(BiFunction<Integer, Integer, Integer> func, int n1, int n2) {
        return func.apply(n1, n2);
    }

}
