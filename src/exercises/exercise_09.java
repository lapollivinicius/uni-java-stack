package src.Advanced.exercises;

import java.util.Scanner;

public class exercise_09 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Temperature in fahrenheit: ");
        double f = scan.nextDouble();

        double c = (5 * (f - 32) / 9);
        System.out.printf("Temperature in celsius is %.2f", c);

    }

}
