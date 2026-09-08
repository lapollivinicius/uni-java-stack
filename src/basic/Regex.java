package src.basic;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {

    /*
     * Some Rules
     * \d -> (0 to 9)
     * \s -> white spaces
     * \w -> alphanumerics and underscore
     * . -> any character
     * [] -> or (ex: [abc] = a or b or c)
     * [-] -> range (ex: [a-f] = a to f)
     * \\ -> scape to show \
     *
     * occurrence
     * * -> zero or more occurrence
     * + -> one or more occurrence
     * ? -> none or one occurrence
     * (ex: 00-00 or 00 00 or 0000 use \d\d([\s-])?\d\d)
     *
     */

    static void main(String[] args) {

        printMatch("asdj983jaojda39031#*4yq983h4", "\\d([a-z])+");

        boolean v = validate("asd asd asd asd", ".*asd.*");
        System.out.println(v);

    }

    public static void printMatch(String text, String regex) {

        // to prepare the regex
        Pattern p = Pattern.compile(regex);

        // to find (match)
        Matcher m = p.matcher(text);

        // method find return boolean if found
        while(m.find()) {
            System.out.format("pos %d with '%s' \n", m.start(), m.group());
        }

    }

    public static boolean validate(String text, String regex) {
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(text);
        return m.matches(); // it considers the entire string
        // to search some part use m.find()
    }


}
