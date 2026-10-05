package src.exercises.exercise_57;

public class Sms implements Adapter {

    @Override
    public String sendMessage(String message) {
        return message + " sent via SMS";
    }
}
