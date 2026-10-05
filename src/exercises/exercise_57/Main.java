package src.exercises.exercise_57;

public class Main {

    public static void main(String[] args) {

        Email email = new Email();
        Sms sms = new Sms();

        NotificationService nf = new NotificationService(sms);
        nf.send("HELLO");

    }

}
