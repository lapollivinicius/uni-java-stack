package src.Advanced.exercises;

import java.util.Scanner;

public class exercise_13 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Your height (m): ");
        double height = scan.nextDouble();

        System.out.print("Your weight (kg): ");
        double weight = scan.nextDouble();

        System.out.print("Your genre (f/m): ");
        String genre = scan.next();

        double idealWeight;
        switch (genre) {
            case "m":
                idealWeight = (72.7 * height) - 58;
                if (weight > idealWeight) {
                    System.out.println("overweight");
                } else {
                    System.out.println("underweight");
                }
                break;
            case "f":
                idealWeight = (62.1 * height) - 44.7;
                if (weight > idealWeight) {
                    System.out.println("overweight");
                } else {
                    System.out.println("underweight");
                }
                break;
            default:
                System.out.println("invalid genre");
                break;
        }

    }

}
