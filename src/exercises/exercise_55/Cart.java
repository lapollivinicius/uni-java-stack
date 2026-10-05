package src.exercises.exercise_55;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Cart {

    Customer customer;
    List<Product> products = new ArrayList<>();

    public Cart(Customer customer) {
        this.customer = customer;
    }

    public void addProduct(Product product) {
        this.products.add(product);
    }

    public void removeProduct(Product product) {
        this.products.remove(product);
    }

    public double calculateTotal() {
        double total = 0;
        for(Product product : products) {
            total += product.getPrice();
        }
        return total;
    }

    public String getAllProducts() {
        String[] allProducts = new String[this.products.size()];
        if (this.products.isEmpty()) return "cart is empty";
        for(int i = 0; i < this.products.size(); i++) {
            allProducts[i] = this.products.get(i).getTitle();
        }
        return Arrays.toString(allProducts);
    }

    @Override
    public String toString() {
        return "Cart{" +
                "customer=" + customer +
                ", cart_items=" + this.getAllProducts() +
                '}';
    }
}
