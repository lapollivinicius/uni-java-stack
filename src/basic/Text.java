package src.basic;

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

    }


}
