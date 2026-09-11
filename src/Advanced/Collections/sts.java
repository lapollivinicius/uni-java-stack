package src.advanced.Collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sts {

    public static void main(String[] args) {

        /* SETS
            - not allowed duplicate
            - no have ordered

            hashSet - Buckets
                - no duplicate
                - no order
            LinkedHashSet - Nodes
                - no duplicate
                - order insert
            TreeSet - Red Black
                - no duplicate
                - order sorted
        */

        Set<String> set = new HashSet<>();
        set.add("A");
        set.add("E");
        set.add("I");
        set.add("O");
        set.add("U");

        // ignored
        set.add("U");

        set.forEach(System.out::println);

        // Adds an element
        // set.add(element);

        // Removes an element
        // set.remove(element);

        // Checks if an element exists
        // set.contains(element);

        // Returns the number of elements
        // set.size();

        // Checks if the set is empty
        // set.isEmpty();

        // Removes all elements
        // set.clear();

        // Adds all elements from a collection
        // set.addAll(collection);

        // Removes elements found in a collection
        // set.removeAll(collection);

        // Keeps elements found in a collection
        // set.retainAll(collection);

        // Checks if all elements exist
        // set.containsAll(collection);

        // Checks if two sets are equal
        // set.equals(otherSet);

        // Returns an iterator
        // set.iterator();

        // Performs an action for each element
        // set.forEach(action);

        // Converts the set to an array
        // set.toArray();

        // HASHCODE and EQUALS
        // set identify using hashcode and equals to define elements/components equals

        // TREE SET
        // they sort elements when added - use comparator or comparable
        // TODO study more about comparator and comparable

        Set<Integer> treeSet = new TreeSet<>();

        // Returns the first (smallest) element
        // treeSet.first();

        // Returns the last (largest) element
        // treeSet.last();

        // Returns the greatest element less than the given element
        // treeSet.lower(element);

        // Returns the greatest element less than or equal to the given element
        // treeSet.floor(element);

        // Returns the smallest element greater than or equal to the given element
        // treeSet.ceiling(element);

        // Returns the smallest element greater than the given element
        // treeSet.higher(element);

        // Returns and removes the first (smallest) element
        // treeSet.pollFirst();

        // Returns and removes the last (largest) element
        // treeSet.pollLast();

        // Returns the elements in reverse order
        // treeSet.descendingSet();

        // Returns a view of elements less than the given element
        // treeSet.headSet(element);

        // Returns a view of elements greater than or equal to the given element
        // treeSet.tailSet(element);

        // Returns a view of elements within a specified range
        // treeSet.subSet(fromElement, toElement);

    }

    // this two methods must be implemented to java identify object equals

    // hashcode return an integer that is used to storage in set
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    // equals test an object equality
    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
