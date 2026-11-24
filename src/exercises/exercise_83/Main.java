package src.Advanced.exercises.exercise_83;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    static void main() {

        List<Integer> integers = new ArrayList<>(List.of(1,2,3,4));
        List<Double> doubles = new ArrayList<>(List.of(1.1,2.2,3.3,4.4));
        List<Number> destination = new ArrayList<>();

        List<Cat> cats = new ArrayList<>(List.of(new Cat(), new Cat()));
        List<Dog> dogs = new ArrayList<>(List.of(new Dog(), new Dog()));
        List<Animals> petshop = new ArrayList<>();

        copyElements(dogs, petshop);
        System.out.println(petshop);

    }

    public static <T> void copyElements(List<? extends T>  origin, List<? super T>  destination) {
        destination.addAll(origin);
    }

    abstract static class Animals {
        void sayName() {}
    }

    public static class Cat extends Animals {
        String name = "GARFIELD";

        @Override
        void sayName() {
                System.out.println(this.name);
        };
        @Override
        public String toString() {
            return this.name;
        }
    }

    public static class Dog extends Animals {
        String name = "OLIE";
        @Override
        void sayName() {
            System.out.println(this.name);
        };
        @Override
        public String toString() {
            return this.name;
        }
    }

}
