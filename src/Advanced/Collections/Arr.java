package src.Advanced.Collections;

import java.util.Arrays;

@SuppressWarnings("All")
public class Arr {

    static void main() {

        // TODO more exercises about arrays and manipulate: search, iterate and compare

        /* ARRAYS
           - they are objects (it's handle as object)
             some array var is a ref to heap
           - index from 0 to arr.length() - 1
           - it must init with the size and cannot resize
        */

        // to declare an array
        // arrays always init with soma value conform type
        int[] arr_int = new int[5];
        int[] arr_int2 = {1, 2, 3, 4, 5};

        // use class Arrays and to string to show array
        System.out.println(Arrays.toString(arr_int)); // [0, 0, 0, 0, 0]
        System.out.println(Arrays.toString(arr_int2)); // [1, 2, 3, 4, 5]

        // to access
        arr_int[0] = 10;

        // we can use loop structures to iterate arrays
        // for, foreach, while, do-while
        for (int number : arr_int2) {
            System.out.println(number * 2);
        }

        // params
        System.out.println(sum(arr_int2));
        System.out.println(sum(1, 2, 3, 4, 5, 6));

        // multidimensional array
        int[][] mtr_int = new int[3][3]; // [[x,x,x],[x,x,x],[x,x,x]
        int[][][] mtr_int_3 = new int[2][2][2]; // [[[x,x],[x,x]][[x,x],[x,x]]]

        // multidimensional array with arrays of unfixed size
        int[][] mtr_arr_var = new int[2][];
        mtr_arr_var[0] = new int[2];
        mtr_arr_var[1] = new int[4];

        // iterate arr_mult
        for (int i = 0; i < mtr_int.length; i++) {
            for (int j = 0; j < mtr_int[i].length; j++) {
                mtr_int[i][j] = (int) (Math.random() * 10);
                System.out.print(mtr_int[i][j]);
            }
            System.out.println(" ");
        }

        // methods of Array class
        String[] array = new String[5];
        String[] array1 = new String[5];
        String[] array2 = new String[5];
        String value = "1";

        array[0] = "2";
        array[1] = "1";
        array[2] = "3";
        array[3] = "3";
        array[4] = "3";

        // Sorts the array in ascending order
        Arrays.sort(array);

        // Searches for a value using binary search
        Arrays.binarySearch(array, value);

        // Compares two arrays and returns true if they are equal
        Arrays.equals(array1, array2);

        // Fills all elements of the array with the specified value
        Arrays.fill(array, value);

        // Copies the array to a new array with the specified length
        int newLength = 10;
        Arrays.copyOf(array, newLength);

        // Copies a specific range of the array
        int from = 0, to = 4;
        Arrays.copyOfRange(array, from, to);

        // Returns a string representation of the array
        Arrays.toString(array);

        // Compares two arrays lexicographically
        Arrays.compare(array1, array2);

        // Returns the hash code of the array
        Arrays.hashCode(array);

        // Compares two arrays deeply, including nested arrays
        Arrays.deepEquals(array1, array2);

        // Returns a deep string representation of nested arrays
        Arrays.deepToString(array);

        // Returns a deep hash code for nested arrays
        Arrays.deepHashCode(array);

        // Converts the array into a List
        Arrays.asList(array);

        // Sets all elements using a lambda expression
        // Arrays.setAll(array, i -> i * 2);

        // Sets all elements of a parallel array using a lambda expression
        // Arrays.parallelSetAll(array, i -> i * 2);

        // Sorts the array using a parallel sorting algorithm
        // Arrays.parallelSort(array);

        // Fills the array using a parallel operation
        // Arrays.parallelPrefix(array, (a, b) -> a + b);

    }

    // spread mode with var args
    // sum(int... arr) or sum(int[] arr)
    public static int sum(int... arr) {
        int num = 0;
        for (int n : arr) {
            num += n;
        }
        return num;
    }

}
