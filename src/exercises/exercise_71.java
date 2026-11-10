package src.exercises;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class exercise_71 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("DIGIT YOUR DATE OF BIRTH (DD-MM-YYYY): ");
        String input = scan.next();

        LocalDate dateBirth = LocalDate.parse(input, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        LocalDate dateNow = LocalDate.now();

        Period interval = Period.between(dateBirth, dateNow);

        System.out.println("YEARS: " + interval.getYears());
        System.out.println("MOUTHS: " + interval.getMonths());
        System.out.println("DAYS: " + interval.getDays());

    }

}
