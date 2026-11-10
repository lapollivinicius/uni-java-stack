package src.exercises.exercise_55;

public class Product {

    private final String title;
    private final double price;
    private final Category category;
    private int stock;

    public Product(String title, double price, int stock, Category category) {
        this.title = title;
        this.price = price;
        this.stock = stock;
        this.category = category;
    }

    public void addStock(int amount) {
        this.stock += amount;
    }

    public void removeStock(int amount) {
        this.stock -= amount;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    public Category getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return "Product{" +
                "title='" + title + '\'' +
                ", price=" + price +
                ", stock=" + stock +
                ", category=" + category.getTitle() +
                '}';
    }
}
