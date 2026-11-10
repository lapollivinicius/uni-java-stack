package src.Advanced.exercises;

import java.util.Scanner;

public class exercise_11 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Digit a integer number: ");
        int integer_01 = scan.nextInt();

        System.out.print("Digit other integer number: ");
        int integer_02 = scan.nextInt();

        System.out.print("Digit a real number: ");
        double real = scan.nextDouble();

        double a = (integer_01 * 2) + (double) (integer_02 / 2);
        double b = (integer_01 * 3) + real;
        double c = real * real * real;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
