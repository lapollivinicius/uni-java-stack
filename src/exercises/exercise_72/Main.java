package src.exercises.exercise_72;

import java.util.*;
import java.util.random.RandomGenerator;
import java.util.random.RandomGeneratorFactory;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        List<Student> students = List.of(
                new Student("John", List.of(9.4, 9.4, 9.4)),
                new Student("Mary", List.of(8.2, 5.3, 6.9)),
                new Student("Abby", List.of(6.5, 5.9, 7.7)),
                new Student("Jane", List.of(8.2, 8.4, 2.9)),
                new Student("Peter", List.of(9.1, 4.5, 6.8))
        );

        students
                .stream()
                .map(student -> {
                    return new Rank(
                            student.name(),
                            student.grades.stream()
                                    .mapToDouble(d -> d)
                                    .average()
                                    .orElse(0)
                    );
                })
                .sorted(Comparator.comparing(Rank::average).reversed())
                .limit(3)
                .forEach(System.out::println);

        students
                .stream()
                .map( s -> {
                    return new Result(
                            s.name(),
                            s.grades
                                    .stream()
                                    .mapToDouble(d -> d)
                                    .average()
                                    .orElse(0)
                                    >= 7 ? Status.PASS : Status.FAIL
                    );
                })
                .forEach(System.out::println);
    }

    enum Status { PASS, FAIL }
    public record Student(String name, List<Double> grades) {}
    public record Rank(String name, double average) {}
    public record Result(String name, Status status) {}



}
