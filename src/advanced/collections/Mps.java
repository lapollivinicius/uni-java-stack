package src.Advanced.Collections;

import java.util.*;

public class Mps {

    /* MAPS
        - it have keys and values
        - keys are uniques (sets)
        - entry is a pair of key and value

        hashMap - use hashCode (keys are hashSet)
        linkedHashMap - keys are linkedHashSet
        treeMap - keys are treeSet

    */

    static void main() {

        Map<Integer, Character> map = new HashMap<>();

        map.put(1, 'A');
        map.put(2, 'B');
        map.put(3, 'C');

        map.put(1, 'D'); // Duplicate Map key (value will be replaced)

        // Iterate keys
        Set<Integer> keys = map.keySet();
        for (Integer key : keys) {
            System.out.println(key);
        }

        // Iterate values
        Collection<Character> values = map.values();
        for (Character value : values) {
            System.out.println(value);
        }

        // Iterate entry
        Set<Map.Entry<Integer, Character>> entries = map.entrySet();
        for (Map.Entry<Integer, Character> entry : entries) {
            System.out.format("%d => %s \n", entry.getKey(), entry.getValue());
        }

        // METHODS USED IN MAPS

        // Adds or replaces a key-value pair
        // map.put(key, value);

        // Adds all key-value pairs from another map
        // map.putAll(otherMap);

        // Adds a key-value pair only if the key does not exist
        // map.putIfAbsent(key, value);

        // Returns the value associated with a key
        // map.get(key);

        // Returns the value associated with a key, or a default value if not found
        // map.getOrDefault(key, defaultValue);

        // Checks if a key exists
        // map.containsKey(key);

        // Checks if a value exists
        // map.containsValue(value);

        // Removes a key-value pair
        // map.remove(key);

        // Removes a key-value pair only if the key and value match
        // map.remove(key, value);

        // Replaces the value associated with a key
        // map.replace(key, value);

        // Replaces the value only if the key exists
        // map.replace(key, value);

        // Replaces the value only if the current value matches
        // map.replace(key, oldValue, newValue);

        // Replaces all values using a function
        // map.replaceAll(function);

        // Returns the number of key-value pairs
        // map.size();

        // Checks if the map is empty
        // map.isEmpty();

        // Removes all key-value pairs
        // map.clear();

        // Returns all keys
        // map.keySet();

        // Returns all values
        // map.values();

        // Returns all key-value pairs
        // map.entrySet();

        // Performs an action for each key-value pair
        // map.forEach(action);

        // Removes the key and returns its value
        // map.remove(key);

        // Computes a value if the key is absent
        // map.computeIfAbsent(key, function);

        // Computes a new value for an existing key
        // map.computeIfPresent(key, function);

        // Computes a new value for a key
        // map.compute(key, function);

        // Merges a value with the existing value
        // map.merge(key, value, function);

        // Checks if two maps contain the same key-value pairs
        // map.equals(otherMap);

        // Returns the hash code of the map
        // map.hashCode();


    }


}
