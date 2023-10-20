package lab2.ex2;

import java.util.Arrays;

public class Lab2Ex2 {
    public static String[] sortStrings(String[] arr) {
        if (arr == null || arr.length <= 1) {
            // If the array is null or has 0 or 1 element, no sorting or conversion is needed.
            return arr;
        }

        int middle = arr.length / 2;

        // Sort the array in alphabetical order
        Arrays.sort(arr);

        // Convert the left half to uppercase
        for (int i = 0; i < middle; i++) {
            arr[i] = arr[i].toUpperCase();
        }

        // Convert the right half to lowercase
        for (int i = middle; i < arr.length; i++) {
            arr[i] = arr[i].toLowerCase();
        }

        return arr;
    }

    public static void main(String[] args) {
        String[] arr = {"apple", "banana", "cherry", "date", "elderberry", "fig"};

        String[] sortedArray = sortStrings(arr);

        System.out.println("Sorted and Modified Array:");
        for (String str : sortedArray) {
            System.out.println(str);
        }
    }
}
