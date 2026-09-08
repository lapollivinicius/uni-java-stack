package src.basic;

import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

/** ABOUT STRING CLASS
 *  - Strings are immutables
 *  - JVM creates a pool (a set within heap called POOL)
 *  In the pool, the JVM reuses the characters of the string
 *
 */

public class Text {

    @SuppressWarnings("all")
    public static void main(String[] args) {

        // class String
        String name = "John";

        // class that have methods
        name = name.toUpperCase();

        System.out.println(name);

        // String Manipulate
        //              012345678910
        String lorem = "Lorem Ipsum";

        // to return part of string subString ( start, end )
        // trim - cut white spaces
        System.out.println(lorem.substring(0, 5).trim()); // lorem

        // to find some text inside string (first)
        // lastIndexOf to find last
        System.out.println(lorem.indexOf("Ip")); // 6 (pos)

        // to return a string replaced (old, new)
        // if text won't be found - it return same text
        System.out.println(lorem.replace("Ipsum", "JORGE"));

        // compare (sorting) aphabetic strings
        String first = "ABC";
        String second = "BCA";
        // if first > second = 1 else if first == second = 0 else -1
        System.out.println(first.compareTo(second));

        // text blocks
        String textArea = """
                           Hello, John!
                               This is a text block!
                               How are you today?
                           """;

        System.out.println(textArea);

        // instance of String is different (it creates a new object in heap)
        String a_out_pool = new String("a");

        // comparing (in and out pool)
        String a = "a";
        String b = "a";
        System.out.println(a == b); // true (but jvm compare refs)
        System.out.println(a.equals(b)); // true (equals compare objects)

        // to move a string to pool
        String newA = a_out_pool.intern();

        // to concat strings use StringBuilder
        // it creates an array of chars (using to manipulate Strings)
        StringBuilder sB = new StringBuilder();
        for (char i = 'A'; i <= 'Z'; i++) {
            sB.append(i);
        }
        System.out.println(sB);

        // FORMATING - using formating in java (concat)
        String s = String.format("%s == %s = %b", a, b, (a == b));
        System.out.println(s);

        // similar to format without breakline (printf too)
        System.out.format("%s == %s = %b \n", a, b, (a == b));

        /*
         * String
         * - %s -> Strings
         * - %10s -> 10 white spaces before string
         * - %-10s -> align left with spaces
         *
         * Decimal
         * - %d -> integer numbers
         *
         * Float/Double
         * - %f -> double numbers
         * - %.2f -> double with 2 places
         */

        // FORMATING - currency
        Locale locale = new Locale("pt", "BR");

        double num = 5300.20;

        // NumberFormat is used to format numbers (based in locale)
        // NumberFormat formatNumber = NumberFormat.getInstance();
        NumberFormat formatNumber = NumberFormat.getCurrencyInstance(locale); // inc CURRENCY

        // use method format to apply
        System.out.println(formatNumber.format(num));

        // this class can be modify
        formatNumber.setGroupingUsed(false); // to remove decimal div
        formatNumber.setMinimumFractionDigits(3); // to change decimal places
        formatNumber.setCurrency(Currency.getInstance("EUR"));

        // use Currency.getAvailableCurrencies to know availables
        // use Locale.getAvailableLocale to know availables

        System.out.println(formatNumber.format(num));

    }


}
