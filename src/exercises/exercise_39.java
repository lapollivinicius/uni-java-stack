package src.exercises;

import java.util.Arrays;
import java.util.Scanner;

public class exercise_39 {

    public static void main(String[] args) {
        int num = addNumber();
        System.out.println(Double.parseDouble(Integer.toString(num)));
        System.out.println(Integer.toHexString(num));
        System.out.println(Integer.toOctalString(num));
    }

    public static int addNumber() {
        try {
            Scanner scan = new Scanner(System.in);
            System.out.print("Digit a number: ");
            int num = Integer.parseInt(String.valueOf(scan.nextInt()));
            scan.close();
            return num;
        } catch(Exception e) {
            System.out.println(e.getMessage());
            return 0;
        }
    }

}
