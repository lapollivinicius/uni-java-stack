package src.exercises.exercise_79;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>(List.of(
                new Employee("John", "TI", 4000.00, 20, true),
                new Employee("Jane", "ADM", 3500.00, 40, true ),
                new Employee("Abby", "TI", 4000.00, 29, false),
                new Employee("Mary", "ADM", 4000.00, 45, false),
                new Employee("Lane", "TI", 2500.00, 33, true),
                new Employee("Roby", "SALES", 5500.00, 29, false),
                new Employee("Pete", "TI", 2000.00, 22, true),
                new Employee("Carl", "SALES", 6500.00, 36, true)
        ));

        System.out.println(groupByDepartament(employees));
        System.out.println(averageSalaryPerDepartment(employees));
        System.out.println(getHiggestSalaryPerDepartment(employees));
        System.out.println(segmentingActiveEmployee(employees));
        System.out.println(countingEmployeeByDepartment(employees));
        
    }

    public static Map<String, List<String>> groupByDepartament(List<Employee> employees) {
        return employees
                .stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.mapping(
                                Employee::getName,
                                Collectors.toList()
                        )
                ));
    }

    public static Map<String, Double> averageSalaryPerDepartment(List<Employee> employees) {
        return employees
                .stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.averagingDouble(Employee::getSalary)
                ));
    }

    public static Map<String, Optional<Double>> getHiggestSalaryPerDepartment(List<Employee> employees) {
        return employees
                .stream()
                .collect(Collectors.groupingBy(
                            Employee::getDepartment,
                            Collectors.collectingAndThen(
                                    Collectors.maxBy(Comparator.comparing(Employee::getSalary)),
                                    e -> e.map(Employee::getSalary))
                            )
                );
    }

    public static Map<Boolean, List<String>> segmentingActiveEmployee(List<Employee> employees) {
        return employees
                .stream()
                .collect(Collectors.partitioningBy(
                        Employee::isActive,
                        Collectors.collectingAndThen(
                                Collectors.toList(),
                                (e) -> e
                                        .stream()
                                        .map(Employee::getName)
                                        .toList()
                        )
                ));
    }

    public static Map<String, Long> countingEmployeeByDepartment(List<Employee> employees) {
        return employees
                .stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.counting()
                ));
    }

}
