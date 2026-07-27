package exercises;

import java.util.Scanner;

public class exercise_05 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Insert value in meters: ");
        int meters = scan.nextInt();

        System.out.println("In centimeters is " + (meters * 100));

    }

}
