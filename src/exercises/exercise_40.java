package src.exercises;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class exercise_40 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Digit your CPF: ");
        String cpf = scan.next();

        String msg = validateFormatCPF(cpf) ? "CPF is valid" : "CPF is invalid";

        System.out.println(msg);

    }

    public static boolean validateFormatCPF(String cpf) {
        String regex = "\\d{3}([\\s.])?\\d{3}([\\s.])?\\d{3}([\\s-])?\\d{2}";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(cpf);
        return m.matches();
    }

}
