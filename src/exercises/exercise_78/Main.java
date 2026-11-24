package src.exercises.exercise_78;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {

        System.out.println(count(null));

    }

    public static Map<Character, Long> count(String str) {
        return Optional
                .ofNullable(str)
                .stream()
                .map(s -> s.toLowerCase().chars())
                .flatMapToInt(Function.identity())
                .mapToObj(i -> (char) i)
                .filter(c -> !Character.isWhitespace(c))
                .collect(
                        Collectors.groupingBy(
                            Function.identity(),
                            Collectors.counting()
                        )
                );
    }

}
