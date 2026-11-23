package src.exercises.exercise_71;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class PhoneBook {

    public static void main(String[] args) {
        Map<String, String> book = Map.of(
                "john", "555-231",
                "abby", "555-321",
                "mary", "555-213"
        );
        Optional<String> op_phone = findByName(book, "mary");

        if (op_phone.isPresent()) {
            System.out.println(op_phone.get());
        } else {
            throw new IllegalArgumentException();
        }
    }

    public static Optional<String> findByName(Map<String, String> book, String name) {
        if (name == null) return Optional.empty();
        for (Map.Entry<String, String> item : book.entrySet()) {
            if (item.getKey().equals(name.toLowerCase())) {
                return Optional.of(item.getValue());
            }
        }
        return Optional.empty();
    };

}
