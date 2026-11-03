package src.exercises.exercise_62;

import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Locale;

public class Main {

    public static String toCapitalize(String str) {
        String[] arrStr = str.trim().split("\\s+");
        for(int i = 0; i < arrStr.length; i++) {
            arrStr[i] = arrStr[i].substring(0,1).toUpperCase() + arrStr[i].substring(1).toLowerCase();
        }
        return String.join(" ", arrStr);
    }

    public static void main(String[] args) {

        Product product = new Product("product aMarela estão maduras", "BNN-001", 199);

        Locale currency = new Locale.Builder().setLanguage("pt").setRegion("BR").build();
        NumberFormat formatter = NumberFormat.getCurrencyInstance(currency);

        System.out.println(Main.toCapitalize(product.getTitle()));
        System.out.println(formatter.format(product.getPrice()));



    }

}
