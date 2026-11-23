package src.advanced;

import java.util.Map;
import java.util.Optional;

public class OptionalType {


    // OPTIONAL is a class to handle Objects that can be null

    // EXEMPLE
    public static void main(String[] args) {
        Optional<String> user = findUserById(4);
        if (user.isEmpty()) {
            System.out.println("WITHOUT USER");
            System.exit(1);
        }
        System.out.println(user.get());
    }

    public static Optional<String> findUserById(int id) {
        Map<Integer, String> users = Map.of(
                1, "John",
                2, "Jane",
                3, "Abby"
        );
        for (Map.Entry<Integer, String> entry : users.entrySet()) {
            if (entry.getKey() == id) {
                return Optional.of(entry.getValue());
            }
        }
        return Optional.empty();
    }

    /*
        of(value)	        Create an Optional with value not null
        ofNullable(value)	Dont allow null
        empty()	            Create an Optional empty
        isPresent()	        Check if value exists
        isEmpty()	        Check if it is empty
        get()	            Get value
        orElse(value)	    Get an alternative value (IT IS ALWAYS CHECKED)
        orElseGet()	        Execute something if value don't exists
        orElseThrow()	    Throw an exception if value don't exists
        ifPresent()	        Run something if value exists
        map()	            Transform value
        filter()	        Filter value
        flatMap()	        Transform value without modifying original value

    */



}
