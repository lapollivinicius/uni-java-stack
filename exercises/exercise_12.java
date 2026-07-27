package exercises;

import java.util.Scanner;

public class exercise_12 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Digit your height (m): ");
        double height = scan.nextDouble();

        double idealWeight = (72.7 * height) - 58;

        System.out.println("Your ideal weight is " + idealWeight);



    }

}
