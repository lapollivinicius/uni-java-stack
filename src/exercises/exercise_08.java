package src.Advanced.exercises;

import java.util.Scanner;

public class exercise_08 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Earn per hour: ");
        double earnPerHour = scan.nextDouble();

        double salary = earnPerHour * 8 * 20;

        System.out.println("Your salary is $" + salary);

    }

}
