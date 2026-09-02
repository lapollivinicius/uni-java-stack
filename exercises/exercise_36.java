package exercises;

public class exercise_36 {

    static int sum(int n) {
        if(n == 1) return 1;
        return n + sum(n-1);
    }

    static void main() {
        System.out.println(exercise_36.sum(3));
    }
}
