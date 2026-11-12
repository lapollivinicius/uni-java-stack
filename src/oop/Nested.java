package src.oop;

public class Nested {

    /*
    * 1. REGULAR/NESTED
    * 2. STATIC
    * 3. LOCAL/METHOD
    * 4. ANONYMOUS
    * */

    // REGULAR / CLASSIC NESTED
    public int execute() {
        Regular regular = new Regular();
        return regular.calculate(10, 10);
    }

    // STATIC CLASS is when the SuperClass has no relation with inner class
    // so, we transform in a static class or put in an external file
    private static class Regular {
        final int fee = 10;

        public int getFee() {
            return fee;
        }

        public int calculate(int x, int y) {
            return x + y + this.fee;
        }
    }

    // OUTER CLASS - use the inheritance to access the inner class
    // SuperClass . InnerClass (this) . method -> to access method or attribute
    // SuperClass . new InnerClass() -> to instance

    // LOCAL / METHOD CLASS - they are class that can be accessed only inside methods
    // can access local variables (must be final), super att and parameters
    public static void methodClass(String name) {

        class SayHey {
            public String hi(name) {
                return "hi, " + name;
            }
            public String hey(name) {
                return "hey, " + name;
            }
        }

        SayHey sh = new SayHey();
        System.out.println(sh.hey());


    }

    // ANONYMOUS CLASS are classes instanced from interfaces for exemple
    public static void main(String[] args) {

        /*
        Interface if = new Interface() {

            @Override
            public void checkTax() {
                System.out.println(10);
            }

            @Override
            public void myMethod() {
                Interface.super.myMethod();
            }
        }

        if - receive an instance from an interface from anonymous way

        */

        Regular rg = new Regular() {
            @Override
            public int calculate(int x, int y) {
                return super.calculate(x, y + 10);
            }
        };

    }



}
