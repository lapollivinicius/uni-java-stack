package src.basic;

@SuppressWarnings("all")
public class WrapperTypes {

    public static void main(String[] args) {

        // it's class for primitives types (convert into objects)
        int x = 10;
        Integer i = Integer.valueOf(x); // return 10 (Integer)
        Double d = Double.valueOf(x);
        // ... other types

        // those classes have methods to convert values (bases 2, 8, 10 ...)
        String Bi = Integer.toBinaryString(15);
        String He = Double.toHexString(10);
        int dc = Integer.decode("ff00");

        // every class have a method parse*** that convert to primitive type
        int i2 = Integer.parseInt("10"); // return 10 (int)
        boolean b = Boolean.parseBoolean("true");

        // to compare we should use compareTo not = (objects not int)


    }
}
