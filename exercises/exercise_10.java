package exercises;

import java.util.Scanner;

public class exercise_10 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Temperature in celsius: ");
        double c = scan.nextDouble();

        double f =  (c * ((double) 9 / 5)) + 32;
        System.out.printf("Temperature in fahrenheit is %.2f", f);
    }

}
