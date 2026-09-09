package src.advanced;

import java.math.BigInteger;

public class Mathematics {

    public static void main(String[] args) {

        // Returns the larger of two numbers
        int max = Math.max(10, 20);
        System.out.println(max);

        // Returns the smaller of two numbers
        int min = Math.min(10, 20);
        System.out.println(min);

        // Returns the absolute value (removes the negative sign)
        int abs = Math.abs(-10);
        System.out.println(abs);

        // Rounds to the nearest integer
        double round = Math.round(10.6);
        System.out.println(round);

        // Rounds down
        double floor = Math.floor(10.9);
        System.out.println(floor);

        // Rounds up
        double ceil = Math.ceil(10.1);
        System.out.println(ceil);

        // Returns the square root
        double sqrt = Math.sqrt(25);
        System.out.println(sqrt);

        // Raises a number to a power
        double pow = Math.pow(2, 3);
        System.out.println(pow);

        // Returns a random number between 0.0 (inclusive) and 1.0 (exclusive)
        double random = Math.random();
        System.out.println(random);

        // Returns the sine of an angle in radians
        double sin = Math.sin(Math.PI / 2);
        System.out.println(sin);

        // Returns the cosine of an angle in radians
        double cos = Math.cos(0);
        System.out.println(cos);

        // Returns the tangent of an angle in radians
        double tan = Math.tan(Math.PI / 4);
        System.out.println(tan);

        // Converts degrees to radians
        double toRadians = Math.toRadians(180);
        System.out.println(toRadians);

        // Converts radians to degrees
        double toDegrees = Math.toDegrees(Math.PI);
        System.out.println(toDegrees);

        // Returns the value of PI
        double pi = Math.PI;
        System.out.println(pi);

        // Returns the value of E (base of the natural logarithm)
        double e = Math.E;
        System.out.println(e);

        // Returns the natural logarithm (base E)
        double log = Math.log(10);
        System.out.println(log);

        // Returns the logarithm with base 10
        double log10 = Math.log10(100);
        System.out.println(log10);

        // bigInteger class (bigDec)
        BigInteger big = new BigInteger("1111111111111111111111111111111");
        BigInteger big2 = new BigInteger("1111111111111111111111111111111");

        // with operators (add, mul, ...)
        big = big.add(big);
        System.out.println(big);

        // compare (1 to equal)
        System.out.println(big.compareTo(big2));



    }
}
