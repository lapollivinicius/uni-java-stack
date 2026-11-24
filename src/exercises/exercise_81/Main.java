package src.Advanced.exercises.exercise_81;

public class Main {

    static void main() {


        var integer = Transform.execute("100", Integer::parseInt);
        System.out.println(integer + 1);

        var string = Transform.execute(100, Object::toString);
        System.out.println(string + " apples");


    }

}
