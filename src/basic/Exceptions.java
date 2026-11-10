package src.basic;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Exceptions extends Exception {

    public static void main(String[] args) throws Exception {

        //   throwable -> parent class (error and exception
        //   error - closes the program (unchecked)
        //   exception - there may be a possible treatment
        //   runtimeExceiption (unchecked) unforeseen problem during execution
        //   IOExceotion, SQLException (checked) problem anticipated during execution

        int[] numbers = {2, 4, 8, 16, 32};
        int[] divs = {2, 0, 2, 0};

        for (int i = 0; i < numbers.length; i++) {

            // it will TRY to run the block
            try {
                checkIndex(i);
                System.out.println(numbers[i] / divs[i]);

            // if there is an error (catch will catch this error)
            // catch (typeException nameException)
            } catch (Throwable exc) {

                // Throwable have getMessage (error message)
                System.out.println("EXCEPTION: " + exc.getMessage());

                // and a method that show the exception address
                exc.printStackTrace();

                // exit negates the finally
                System.exit(0);

            // if there isn't exit finally always be executed
            } finally {
                System.out.println("this block will always be executed");
            }
        }

        // try-with-resources
        // close objects that needs to terminate
        try (BufferedReader br = new BufferedReader(new FileReader("file.txt"))) {
            String linha = br.readLine();
            System.out.println(linha);
        }
        // run the params and close when finished

    }

    static void checkIndex(int index) {
        if(index == 2) throw new RuntimeException("THIS IS 2");
    }

}
