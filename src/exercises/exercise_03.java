package src.Advanced.exercises;

import java.util.Scanner;

public class exercise_03 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Digit a number: ");
        int n1 = scan.nextInt();

        System.out.print("Digit other number: ");
        int n2 = scan.nextInt();

        System.out.println("Your sum is " + (n1 + n2));

    }

}
