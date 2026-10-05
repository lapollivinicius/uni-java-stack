package src.exercises.exercise_59;

public class Order {

    Status orderStatus = Status.PENDENT;

    void nextStage(Status currentStatus) {
        switch (Status.valueOf(currentStatus.name())) {
            case PENDENT -> orderStatus = Status.PAID;
            case PAID -> orderStatus = Status.SENT;
            case SENT -> orderStatus = Status.DELIVERED;
            case DELIVERED -> orderStatus = Status.FINISHED;
        }
    }

    void cancelOrder() {
        orderStatus = Status.CANCELLED;
    }

    public Status getOrderStatus() {
        return orderStatus;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderStatus=" + orderStatus +
                '}';
    }
}
