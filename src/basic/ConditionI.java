package src.basic;

import java.util.Scanner;

public class ConditionI {
  
  public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);

    System.out.print("What is your age?: ");
    int age = scan.nextInt();

    scan.close();

    // if something is true run this 
    if (age < 16) {
      System.out.println("You cannot get a drive license");
    } else {
      System.out.println("You can get a drive license");
    }

    if ( (age > 16 & age < 18) | age > 65) {
      System.out.println("OPTIONAL VOTE");
    } else if (age > 18) {
      System.out.println("MANDATORY VOTE");
    } else {
      System.out.println("YOU CANNOT VOTE");
    }

    // ternary condition
    String person = age >= 18 ? "Adult" : "Teen";

  }

}
