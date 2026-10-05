package src.exercises.exercise_55;

public class Main {

    public static void main(String[] args) {

        Category fruits = new Category("Fruits", "Fruits are cool");
        Category drinks = new Category("Drinks", "Drinks are cool");
        Category meats = new Category("Meats", "Meats are cool");

        System.out.println(meats);

        Product banana = new Product("Banana", 1, 100, fruits);
        Product coke = new Product("Coke", 10, 20, drinks);
        Product hamburger = new Product("Hamburger", 4, 80, meats);

        System.out.println(hamburger);

        Customer John = new Customer("John", "new jersey");

        Cart cart = new Cart(John);
        cart.addProduct(coke);
        cart.addProduct(hamburger);
        cart.addProduct(banana);
        System.out.println(cart);

        System.out.println(cart.calculateTotal());

        Order order = new Order(John);
        order.addProduct(coke);
        order.addProduct(hamburger);
        System.out.println(order);

    }

}
