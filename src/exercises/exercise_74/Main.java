package src.exercises.exercise_74;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {

        Order order = new Order("John", 1000.99, Status.DELIVERED, false);

        Predicate<Order> HighAmountRule = _order -> _order.getAmount() > 500;
        Predicate<Order> isApprovedRule = _order -> _order.getStatus().equals(Status.APPROVED);
        Predicate<Order> isVipRule = _order -> _order.isVip();

        System.out.println(applyRule(order, HighAmountRule.and(isVipRule.negate())));

        List<Order> orders = new ArrayList<>(List.of(
                new Order("John", 1000.00, Status.DELIVERED, false),
                new Order("Abby", 500.00, Status.PENDENT, false),
                new Order("Lane", 900.00, Status.APPROVED, true),
                new Order("Mary", 1500.00, Status.PROCESSED, false)
        ));

        filterOrders(orders, order1 -> order1.getAmount() < 1000 && !order1.isVip())
                .forEach(System.out::println);

        System.out.println(
                applyDiscountToVip(
                    orders.get(2),
                    order1 -> order1.getAmount() - (order1.getAmount() * 0.10)
                    )
        );
        showOrders(orders, System.out::println);
    }

    public static boolean applyRule(Order order, Predicate<Order> rule) {
        return rule.test(order);
    }

    public static List<Order> filterOrders(List<Order> orders, Predicate<Order> rule) {
        return orders.stream().filter(rule).toList();
    }

    public static double applyDiscountToVip(Order order, Function<Order, Double> applicator) {
        if (!order.isVip()) return 0;
        return applicator.apply(order);
    }

    public static void showOrders(List<Order> orders, Consumer<Order> function) {
        orders.forEach(function);
    }

}
