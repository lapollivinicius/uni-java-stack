package src.Advanced.exercises.exercise_86;

import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Main {


    static void main() throws IOException {

        Scanner scan1 = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);

        closeAll(List.of(scan1, scan2));


    }

    public static <T extends Closeable> void closeAll(List<T> list) {
        list.forEach( item -> {
            try {
                item.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
    }

}
