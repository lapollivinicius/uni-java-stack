package src.exercises.exercise_66;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class Appointment {

    String name;
    LocalDate date;
    LocalTime time;
    Duration duration;

    public Appointment(String name, LocalDate date, LocalTime time, Duration duration) {
        this.name = name;
        this.date = date;
        this.time = time;
        this.duration = duration;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Appointment that)) return false;
        return Objects.equals(date, that.date) && Objects.equals(time, that.time);
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, time);
    }

    @Override
    public String toString() {
        return "Appointment \n" +
                "name: " + name + "\n" +
                "date: " + date.format(DateTimeFormatter.ofPattern("dd/MM/yy")) + "\n" +
                "start: " + time.format(DateTimeFormatter.ofPattern("hh'h'mm")) + "\n" +
                "end: " + time.plus(duration).format(DateTimeFormatter.ofPattern("hh'h'mm"));
    }
}
