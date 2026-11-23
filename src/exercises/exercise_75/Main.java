package src.exercises.exercise_75;

import src.exercises.exercise_73.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<Employer> employers = new ArrayList<>(List.of(
                new Employer("John", 4000.00, Position.MAINTENANCE),
                new Employer("Jane", 3500.00, Position.OPERATION),
                new Employer("Abby", 4000.00, Position.ADMINISTRATION),
                new Employer("Mary", 4000.00, Position.OPERATION),
                new Employer("Lane", 2500.00, Position.ADMINISTRATION),
                new Employer("Roby", 5500.00, Position.OPERATION),
                new Employer("Pete", 2000.00, Position.ADMINISTRATION),
                new Employer("Carl", 6500.00, Position.OPERATION)
        ));

        filter(employers, employer -> employer.getWage() > 3000)
                .forEach(System.out::println);

        print(employers, System.out::println);

        names(
                employers,
                list -> list
                        .stream()
                        .map(employer -> employer.getName())
                        .toList()
        ).forEach(System.out::print);

    }

    public static List<Employer> filter(List<Employer> list, Predicate<Employer> condition) {
        return list.stream().filter(condition).toList();
    };

    public static void print(List<Employer> list, Consumer<Employer> consumer) {
        list.forEach(consumer);
    }

    public static List<String> names(List<Employer> list, Function<List<Employer>, List<String>> function) {
        return function.apply(list);
    };

}
