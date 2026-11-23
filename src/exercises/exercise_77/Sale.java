package src.exercises.exercise_77;

public class Sale {

    private String product;
    private String category;
    private double price;
    private int quantity;
    private String seller;

    public Sale( String product,  String category,  double price,  int quantity,  String seller) {
        this.product = product;
        this.category = category;
        this.price = price;
        this.quantity = quantity;
        this.seller = seller;
    }

    public String getProduct() {
        return this.product;
    }

    public void setProduct( String product) {
        this.product = product;
    }

    public String getCategory() {
        return this.category;
    }

    public void setCategory( String category) {
        this.category = category;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice( double price) {
        this.price = price;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setQuantity( int quantity) {
        this.quantity = quantity;
    }

    public String getSeller() {
        return this.seller;
    }

    public void setSeller( String seller) {
        this.seller = seller;
    }

    @Override
    public String toString() {
        return "Sale{" +
                "product='" + product + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", seller='" + seller + '\'' +
                '}';
    }
}
