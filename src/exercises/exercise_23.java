package src.Advanced.exercises;

import java.util.Scanner;

public class exercise_23 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("note 1: ");
        double n1 = scan.nextDouble();

        System.out.print("note 2: ");
        double n2 = scan.nextDouble();

        double average = (n1 + n2) / 2;

        if (average >= 10) {
            System.out.println("well done");
        } else if(average >= 7) {
            System.out.println("approved");
        } else {
            System.out.println("failed");
        }
    }

}
