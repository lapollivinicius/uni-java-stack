package src.basic;

import java.util.Scanner;

public class Input {
  
  public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);

    // read a whole line
    System.out.println("What is your name?: ");
    String name = scan.nextLine();
    System.out.println("Your name is " + name);

    // read by type 
    System.out.println("What is your name?: ");
    int age = scan.nextInt();
    System.out.println("Your age is " + age);

    scan.close();
  }

}
