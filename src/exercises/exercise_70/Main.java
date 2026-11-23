package src.exercises.exercise_70;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Integer> list = List.of(1, 2, 3, 4, 5);
        List<Integer> newList = filter(list, n -> n % 2 == 0);
        System.out.println(newList + "" + list);
    }

    public static List<Integer> filter(List<Integer> list, Condition condition) {
        List<Integer> newList = new ArrayList<>();
        for (Integer number : list) {
            if (condition.test(number)) {
                newList.add(number);
            }
        }
        return newList;
    }

    @FunctionalInterface
    public interface Condition {
        boolean test(int n);
    }

}
