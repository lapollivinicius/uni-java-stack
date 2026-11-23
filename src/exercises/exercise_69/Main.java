package src.exercises.exercise_69;

public class Main {

    public static void main(String[] args) {

        run(
              null,
             (s) -> System.out.println(s.toUpperCase()),
             (s) -> System.out.println("String is null")
        );

    }


    public static void run(String s, Execute codeIfNotNull, Execute codeIfNull) {
        if(s == null) {
            codeIfNull.execute(null);
            // it can use other interface (without params)
        } else {
            codeIfNotNull.execute(s);
        }
    }

    @FunctionalInterface
    public interface Execute {
        void execute(String s);
    }

}
