package src.exercises;

import java.util.Arrays;

public class exercise_43 {

    public static void main(String[] args) {

        String namePhoto1 = "IMG_00013-1988-Sao_Paulo.jpg";
        String namePhoto2 = "IMG_00013-1999-Florianopolis.jpg";
        String namePhoto3 = "IMG_321-2015-Rio_de_janeiro.jpg";

        inspect(namePhoto3);

    }

    public static void inspect(String text) {
        String[] parts = text.split("[-.]");
        String code = "";
        String year = "";
        String city = "";
        for(String part : parts) {
            if(part.startsWith("IMG_")) {
                code = part.replaceAll("\\D", "");
            }
            if(part.matches("\\d{4}")) {
                year = part;
            }
            if(part.matches("([\\w{4}_])?")) {
                city = part.replaceAll("_", " ");
            }
        }

        System.out.println(code + " " + year + " " + city);
    }

}
