package src.Advanced.exercises;

import java.util.Scanner;

public class exercise_15 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Earn per hour: ");
        double earnPerHour = scan.nextDouble();

        double salary = earnPerHour * 8 * 20;
        double synd = salary * 0.05;
        double taxes = salary * 0.11;
        double liquid = salary - taxes - synd;

        System.out.println("salary: $" + salary);
        System.out.println("synd: $" + synd);
        System.out.println("taxes: $" + taxes);
        System.out.println("deposit: $" + liquid);


    }
}
