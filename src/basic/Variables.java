package src.basic;

public class Variables {

    public static void main(String[] args) {

        // slot in memory to store something
        // use a name as reference to this slot
   
        /* Name RULES AND CONVENTION
           Starts with a-z A-Z _ &
           Can Contain a-z A-Z _ & 0-9
           Case Sensitive (Ab != aB)
           camelCase
        */

        // var give to java the decision (choose the type)
        var myVariable = 10;

        // type nameVar (=) value
        int itIsANumber = 123;
        String itIsAString = "John";
        double itIsAFloat = 12.12;

        System.out.println(itIsANumber);
        System.out.println(itIsAString);
        System.out.println(itIsAFloat);

    }

}
