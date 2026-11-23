package src.exercises.exercise_77;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Sale> sales = new ArrayList<>(List.of(
                new Sale("Kwid", "Popular", 80000, 4, "John"),
                new Sale("Mobi", "Popular", 70000, 3, "Mary"),
                new Sale("BYD", "Eletric", 120000, 1, "Lane"),
                new Sale("Opal", "Eletric", 110000, 4, "John"),
                new Sale("HRV", "SVU", 220000, 5, "Mary"),
                new Sale("RAM", "Pickup", 320000, 6, "Lane"),
                new Sale("Pulse", "SVU", 120000, 3, "John"),
                new Sale("Kwid", "Popular", 80000, 8, "Mary")
        ));

        System.out.println(getTotalSale(sales));
        System.out.println(getProducts(sales));
        System.out.println(sortByTotalValue(sales));
        System.out.println(getInvoicing(sales));
        System.out.println(getHighSale(sales));
        System.out.println(getSellers(sales));

    }

    public static double getTotalSale(List<Sale> sales) {
        return sales
                .stream()
                .filter( sale -> sale.getPrice() > 115000)
                .mapToDouble(sale -> sale.getPrice() * sale.getQuantity())
                .reduce(0, Double::sum);
    }

    public static List<String> getProducts(List<Sale> sales) {
        return sales
                .stream()
                .map(sale -> sale.getProduct())
                .distinct()
                .toList();
    }

    public static List<Sale> sortByTotalValue(List<Sale> sales) {
        return sales
                .stream()
                .sorted(Comparator.comparing((Sale sale) -> sale.getPrice() * sale.getQuantity()).reversed())
                .toList();
    }

    public static double getInvoicing(List<Sale> sales) {
        return sales
                .stream()
                .mapToDouble(sale -> sale.getPrice() * sale.getQuantity())
                .reduce(0, Double::sum);
    }

    public static Sale getHighSale(List<Sale> sales) {
        return sales
                .stream()
                .max(Comparator.comparing((sale) -> sale.getQuantity() * sale.getPrice()))
                .orElse(null);
    }

    public static List<String> getSellers(List<Sale> sales) {
        return sales
                .stream()
                .map(sale -> sale.getSeller())
                .distinct()
                .toList();
    }

}
