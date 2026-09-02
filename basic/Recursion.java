public class Recursion {

    static int factorial(int n) {
        if (n == 0) return 1;
        return n * factorial(--n);
    }

    static void main() {
        System.out.println(Recursion.factorial(5));
    }

}
