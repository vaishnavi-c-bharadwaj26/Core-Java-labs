package lab6.ex7;

import java.util.*;

public class Lab6Ex7 {
    public static int[] getSorted(int[] numbers) {
        // Create an array to store the reversed and sorted numbers
        int[] reversedAndSorted = new int[numbers.length];

        // Iterate through the input array
        for (int i = 0; i < numbers.length; i++) {
            // Reverse the number by converting it to a string
            String numberStr = String.valueOf(numbers[i]);
            String reversedNumberStr = new StringBuilder(numberStr).reverse().toString();

            // Parse the reversed string back to an integer
            reversedAndSorted[i] = Integer.parseInt(reversedNumberStr);
        }

        // Sort the reversed and parsed numbers
        Arrays.sort(reversedAndSorted);

        return reversedAndSorted;
    }

    public static void main(String[] args) {
        int[] numbers = {756, 998, 834};
        int[] result = getSorted(numbers);

        System.out.println("Original Array: " + Arrays.toString(numbers));
        System.out.println("Reversed and Sorted Array: " + Arrays.toString(result));
    }
}





	