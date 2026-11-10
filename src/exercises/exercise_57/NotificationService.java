package src.exercises.exercise_57;

public class NotificationService implements Notification {

    Adapter service;

    public NotificationService(Adapter service) {
        this.service = service;
    }

    @Override
    public void send(String message) {
        System.out.println(this.service.sendMessage(message));
    }
}
