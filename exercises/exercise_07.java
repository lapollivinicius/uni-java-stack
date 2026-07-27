package exercises;

import java.util.Scanner;

public class exercise_07 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Digit the length of a side of the square: ");
        int lengthSideSquare = scan.nextInt();

        double area = (lengthSideSquare * lengthSideSquare);

        double doubleArea = area * 2;

        System.out.println("Double area is " + doubleArea);

    }

}
