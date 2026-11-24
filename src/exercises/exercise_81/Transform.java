package src.Advanced.exercises.exercise_81;

import java.util.function.Function;

public class Transform {

    public static <T, R> R execute(T t, Function<T, R> function) {
        return function.apply(t);
    }

}
