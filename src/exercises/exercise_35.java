package src.Advanced.exercises;

public class exercise_35 {

    // f = (n-1) + (n-2)
    static int fibonacci(int n) {
        if(n < 2) return 1;
        return fibonacci(n-1) + fibonacci(n-2);
    }

    public static void main(String[] args)  {
        for(int i = 1; i < 10; i++) {
            System.out.println(exercise_35.fibonacci(i));
        }
    }
}
