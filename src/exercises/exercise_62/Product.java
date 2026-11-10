package src.exercises.exercise_62;

import java.text.NumberFormat;
import java.util.Locale;

public class Product {

    private String title;
    private String sku;
    private int price;

    public Product(String title, String sku, int price) {
        this.title = title;
        this.sku = sku;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "title='" + title + '\'' +
                ", sku='" + sku + '\'' +
                ", price=" + price +
                '}';
    }
}
