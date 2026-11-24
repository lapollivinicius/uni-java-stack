package src.Advanced.exercises.exercise_84;

import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {

    static void main() {

        List<Integer> ints = List.of(1, 2, 3, 4, 5);
        List<Double> dbls = List.of(1.1, 2.2, 3.3, 4.4, 5.5);
        List<String> strs = List.of("hello", "john", "apple");

        System.out.println(maxValue(strs));

    }

    public static <T extends Comparable<T>> T maxValue(List<T> list) {
        return list.stream().max(Comparator.naturalOrder()).orElseThrow();
    }

}
