package oop;

public class Static {

    // variables and methods that can be access without class instance
    static int num1;
    static int num2;

    static int sum(int num1, int num2) {
        return num1 + num2;
    }

    public static void main() {

        Static.num1 = 10;
        Static.num2 = 20;
        int result = Static.sum(Static.num1, Static.num2);

        System.out.println(result);
    }

}
