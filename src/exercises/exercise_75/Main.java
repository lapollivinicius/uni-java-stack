package src.exercises.exercise_75;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {

        List<Employee> employers = new ArrayList<>(List.of(
                new Employee("John", 4000.00, Position.MAINTENANCE),
                new Employee("Jane", 3500.00, Position.OPERATION),
                new Employee("Abby", 4000.00, Position.ADMINISTRATION),
                new Employee("Mary", 4000.00, Position.OPERATION),
                new Employee("Lane", 2500.00, Position.ADMINISTRATION),
                new Employee("Roby", 5500.00, Position.OPERATION),
                new Employee("Pete", 2000.00, Position.ADMINISTRATION),
                new Employee("Carl", 6500.00, Position.OPERATION)
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

    public static List<Employee> filter(List<Employee> list, Predicate<Employee> condition) {
        return list.stream().filter(condition).toList();
    };

    public static void print(List<Employee> list, Consumer<Employee> consumer) {
        list.forEach(consumer);
    }

    public static List<String> names(List<Employee> list, Function<List<Employee>, List<String>> function) {
        return function.apply(list);
    };

}
