package src.exercises.exercise_59;

public class Main {

    public static void main(String[] args) {

        Order order = new Order();
        System.out.println(order);
        order.nextStage(order.getOrderStatus());
        order.nextStage(order.getOrderStatus());
        System.out.println(order);
        order.cancelOrder();
        System.out.println(order);

    }

}
