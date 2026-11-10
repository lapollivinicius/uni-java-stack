package src.Advanced.exercises;

import java.util.Scanner;

public class exercise_06 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Digit the radius: ");
        double radius = scan.nextDouble();

        double area = (radius * radius) * Math.PI;

        System.out.println("Circle Area is " + String.format("%.2f", area));
    }

}
