/*
2.Write a java program to find the maximum value from the given type of elements using a
generic function.
 */
package javaex12;

/**
 *
 * @author VISHWA
 */

public class MaxValueFinder {

    public static <T extends Comparable<T>> T findMax(T[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array must not be empty or null");
        }

        T max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i].compareTo(max) > 0) {
                max = array[i];
            }
        }

        return max;
    }

    public static void main(String[] args) {
        Integer[] intArray = {1, 5, 3, 7, 2, 8, 4};
        Double[] doubleArray = {2.5, 8.1, 4.7, 9.3, 5.6};
        String[] stringArray = {"apple", "banana", "orange", "grape"};

        System.out.println("Maximum value in Integer array: " + findMax(intArray));
        System.out.println("Maximum value in Double array: " + findMax(doubleArray));
        System.out.println("Maximum value in String array: " + findMax(stringArray));
    }
}