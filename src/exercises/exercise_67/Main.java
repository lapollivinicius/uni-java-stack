package src.exercises.exercise_67;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Loans l1 = new Loans("John", "Narnia", LocalDate.of(2026, 10, 25), 1);

        System.out.println(l1.calculateReturnDate());
        System.out.println(l1.calculateDaysBeforeDelivery());
        System.out.println(l1.checkForDelays());
        System.out.println(l1.calculatePenality());
        System.out.println(l1.getResume());

    }

}
