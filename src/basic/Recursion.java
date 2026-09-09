package src.basic;

public class Recursion {

    static int factorial(int n) {
        if (n == 0) return 1;
        return n * factorial(--n);
    }

    public static void main(String[] args) {
        System.out.println(Recursion.factorial(5));
    }

}
