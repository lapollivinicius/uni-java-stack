package src.Advanced.Collections;

import java.util.*;

public class Lst {

    static void main() {

        // TODO more exercises and understand more about Collection, Comparator, Comparable class and interfaces

        /* LIST
            - they are interface
            - allows duplicate items
            - indexed items
            - maintains the insertion order
            - they work with objects

            ArrayList - interface impl as array (solve problems)
            LinkedList - data structure interface impl

            NOTE. Review Comparator, Collections and Comparable classes
        */

        // it needs to receive objects <>
        List<Integer> lst = new ArrayList<>();

        // immutable list (it cannot be modified)
        List<String> lst_2 = List.of("John", "Abby");

        // to add item
        lst.add(1);
        lst.add(2);
        lst.add(21);
        lst.add(3);

        // to remove
        lst.remove(2);

        // to get item
        int item_1 = lst.get(1); // 2
        System.out.println(item_1);

        // iterates
        for (int i : lst) {
            System.out.println(i);
        }

        // using iterator (other way)
        Iterator<Integer> ite = lst.iterator();
        while(ite.hasNext()) {
            int next = ite.next();
            System.out.println(next);

            // iterator methods
            // ite.remove();
        }

        // array -> list
        Integer[] arr = {1, 2, 3, 4, 5};
        List<Integer> lst_3 = Arrays.asList(arr);

        // list -> array
        lst_3.toArray(arr);

        List<String> list = new ArrayList<>();
        List<String> list_1 = new ArrayList<>();

        // Add an element to the end of the list
        list.add("Apple");

        // Add an element at a specific position
        list.add(0, "Banana");

        // Add all elements from another collection
        list.addAll(list_1);

        // Get an element by its index
        list.get(0);

        // Replace an element at a specific position
        list.set(0, "Orange");

        // Remove an element by its index
        list.remove(0);

        // Remove the first occurrence of a specific element
        list.remove("Apple");

        // Remove all elements that are also present in another collection
        list.removeAll(list_1);

        // Remove elements that match a condition
        list.removeIf(item -> item.startsWith("A"));

        // Check if the list contains a specific element
        list.contains("Apple");

        // Check if the list contains all elements from another collection
        list.containsAll(list_1);

        // Get the number of elements in the list
        list.size();

        // Check if the list is empty
        list.isEmpty();

        // Remove all elements from the list
        list.clear();

        // Get the index of the first occurrence of an element
        list.indexOf("Apple");

        // Get the index of the last occurrence of an element
        list.lastIndexOf("Apple");

        // Create a sublist between two indexes
        list.subList(0, 2);

        // Sorting using class Comparator (it can be modified)

        // Sort the list using natural ordering
        list.sort(Comparator.naturalOrder());

        // Sort the list using a custom comparator
        list.sort(Comparator.comparing(String::length));

        // Reverse the order of the elements
        Collections.reverse(list);

        // Shuffle the elements randomly
        Collections.shuffle(list);

        // Stream and others

        // Create a sequential stream from the list
        list.stream();

        // Create a parallel stream from the list
        list.parallelStream();

        // Convert the list to an array
        list.toArray();

        // Convert the list to a typed array
        list.toArray(new String[0]);

        // Iterate through each element using a lambda expression
        list.forEach(item -> System.out.println(item));

        // Get a list iterator for forward and backward traversal
        list.listIterator();

        // Get a list iterator starting at a specific index
        list.listIterator(2);

        // --------------------------
        /* LINKEDLIST
           - it works based in nodes
           - arrays with fixed spaces

         */



    }


}
