package src.advanced.lambda;

import java.util.List;
import java.util.Map;

public class Lambda {

    public static void main(String[] args) {

        // similar to anonymous functions in JS, use () -> {}
        // only can be applied in interfaces with ONE method @FunctionalInterface

        // an anonymous class
        InterfaceFunctional func = new InterfaceFunctional() {
            @Override
            public int calculate(int n1, int n2) {
                return n1 + n2;
            }
        };

        // lambda function
        // can omit type params
        InterfaceFunctional func2 = (n1, n2) -> {
            return n1 * n2;
        };

        InterfaceFunctional func3 = (n1, n2) -> n1 + n2;
        // (n1, n2) -> n1 + n2;

        calculateWithTen(func3, 10);

        calculateWithTen((n1, n2) -> n1 * n2, 100);

        // METHOD REFERENCE - when we have a lambda in a line
        // the calculate method receive the CALLBACK behavior
        calculateWithTen(Integer::sum, 100);


        // CLOSURE - to access an outside var in a lambda, this var needs to be FINAL or an attribute
        final int MULT = 2; // or MULT must be an attribute, but attribute can be modified
        InterfaceFunctional times = (n1, n2) -> (n1 + n2) * MULT;
        System.out.println(times.calculate(10, 10));

        // WITH COLLECTIONS AND DEFAULT FUNCTIONS
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);

        // CONSUMER
        numbers.forEach(System.out::print);

        Map<Integer, String> people = Map.of(
                1, "john",
                2, "abby",
                3, "mary",
                4, "jane"
        );

        // CONSUMER
        people.keySet().forEach(System.out::println);
        people.values().forEach(System.out::println);

        // BI CONSUMER
        people.forEach((key, value) -> System.out.println(key + ". " + value));

        // METHODS: forEach, removeIf, sort, replaceAll

    }

    public static void calculateWithTen(InterfaceFunctional func, int n1) {
        System.out.println(func.calculate(10, n1));
    }
}
