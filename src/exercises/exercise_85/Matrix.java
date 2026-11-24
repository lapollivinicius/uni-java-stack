package src.Advanced.exercises.exercise_85;


import java.util.ArrayList;
import java.util.List;

public class Matrix<T> {

    List<List<T>> matrix = new ArrayList<>();

    public Matrix() {
        for (int c = 0; c <= 2; c++) {
            List<T> row = new ArrayList<>();
            for (int r = 0; r <= 2; r++) {
                row.add(null);
            }
            matrix.add(row);
        }
    }

    public void print() {
        for (List<T> i : matrix) {
            for (T j : i) {
                System.out.print(j + " ");
            }
            System.out.print("\n");
        }
    }

    public void set(int x, int y, T t) {
        matrix.get(x).set(y, t);
    }

}
