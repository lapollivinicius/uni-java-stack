package src.exercises.exercise_63;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Main {

    public static void listProducts(List<Product> products) {
        for (Product product : products) {
            System.out.println(product);
        }
    }

    public static List<Product> searchByTitle(List<Product> products, String title) {
        List<Product> searchProducts = new ArrayList<Product>();
        for (Product product : products) {
            if (product.getTitle().startsWith(title)) {
                searchProducts.add(product);
            }
        }
        return searchProducts;
    }

    public static List<Product> searchByCategory(List<Product> products, String category) {
        List<Product> searchProducts = new ArrayList<Product>();
        for (Product product : products) {
            if (product.getCategory().startsWith(category)) {
                searchProducts.add(product);
            }
        }
        return searchProducts;
    }

    public static List<Product> removeByTitle(List<Product> products, String title) {
        List<Product> searchProducts = new ArrayList<Product>();
        for (Product product : products) {
            if (!product.getTitle().equals(title)) {
                searchProducts.add(product);
            }
        }
        return searchProducts;
    }

    public static int averagePrice(List<Product> products) {
        int totalPrice = 0;
        for (Product product : products) {
            totalPrice += product.getPrice();
        }
        return totalPrice / products.size();
    }

    public static Product productMaxPrice(List<Product> products) {
        Product current = products.getFirst();
        for (Product product : products) {
            if(product.getPrice() > current.getPrice()) {
                current = product;
            }
        }
        return current;
    }

    public static Product productMinPrice(List<Product> products) {
        Product current = products.getFirst();
        for (Product product : products) {
            if(product.getPrice() < current.getPrice()) {
                current = product;
            }
        }
        return current;
    }

    public static void main(String[] args) {

        List<Product> products = new ArrayList<Product>();

        Product smartphone = new Product("Iphone X", "Smartphone", 900);
        Product smartphone2 = new Product("Iphone 18", "Smartphone", 300);
        Product tv = new Product("Samsung 4K '50", "Television", 1300);
        Product tv2 = new Product("LG 4K '50", "Television", 1300);
        Product videoGame = new Product("PS5 PRO", "Video Game", 11700);

        products.add(smartphone);
        products.add(smartphone2);
        products.add(tv);
        products.add(tv2);
        products.add(videoGame);

        System.out.println("\u001B[33m|---- ALL PRODUCTS ----| \u001B[0m");
        listProducts(products);

        System.out.println("\u001B[33m|---- Search Title: 'Iphone' ----| \u001B[0m\n" + searchByTitle(products, "Iphone"));
        System.out.println("\u001B[33m|---- Search Category: 'Television' ----| \u001B[0m\n" + searchByTitle(products, "Iphone"));
        System.out.println("\u001B[33m|---- Product 'Iphone 18' removed ----|\u001B[0m\n" + removeByTitle(products, "Iphone 18"));
        System.out.println("\u001B[33m|---- Average Price ----| \u001B[0m\n" + NumberFormat.getCurrencyInstance(new Locale.Builder().setLanguage("pt").setRegion("BR").build()).format(averagePrice(products)));
        System.out.println("\u001B[33m|---- Product Max Price ----| \u001B[0m\n" + productMaxPrice(products));
        System.out.println("\u001B[33m|---- Product Max Price ----| \u001B[0m\n" + productMinPrice(products));

    }

}
