package src.exercises.exercise_66;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("YOUR NAME: ");
        String name = scan.nextLine();

        System.out.print("DATE (yyyy-mm-dd): ");
        String date = scan.nextLine();

        System.out.print("TIME (hh:mm): ");
        String time = scan.nextLine();

        System.out.print("DURATION (minutes): ");
        long duration = scan.nextLong();

        Appointment appointment = new Appointment(
                name,
                LocalDate.parse(date),
                LocalTime.parse(time),
                Duration.ofSeconds(duration*60)
        );

        Scheduling scheduling = new Scheduling();

        try {
            scheduling.addAppointment(appointment);
            scheduling.addAppointment(appointment);
        } catch (Exception err) {
            System.out.println(err.getMessage());
        }

    }
}
