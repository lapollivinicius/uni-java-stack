package src.exercises.exercise_73;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {

        List<Product> products = new ArrayList<>(List.of(
                new Product("Banana", 2.00),
                new Product("Apple", 2.80),
                new Product("Melon", 4.20),
                new Product("Lemon", 1.30),
                new Product("Potato", 1.80)

        ));

        List<Product> newList = sortByPrice(
                filter(
                        products, product -> product.getPrice() >= 2
                )
        );
        newList.forEach(System.out::println);

    }

    public static List<Product> sortByName(List<Product> list) {
        List<Product> newList = new ArrayList<>(List.copyOf(list));
        newList.sort(Comparator.comparing((Product item) -> item.getTitle()));
        return newList;
    }

    public static List<Product> sortByPrice(List<Product> list) {
        List<Product> newList = new ArrayList<>(List.copyOf(list));
        newList.sort(Comparator.comparing((Product item) -> item.getPrice()).reversed());
        return newList;
    }

    public static List<Product> filter(List<Product> list, Predicate<Product> condition) {
        List<Product> newList = new ArrayList<>();
        for (Product product : list) {
            if (condition.test(product)) {
                newList.add(product);
            }
        }
        return newList;
    }



}
