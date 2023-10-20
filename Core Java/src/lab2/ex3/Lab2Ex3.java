package lab2.ex3;

import java.util.Arrays;

public class Lab2Ex3 {
	public static int[] getSorted(int[] arr) {
        // Check if the input array is null or has 0 or 1 element
        if (arr == null || arr.length <= 1) {
            // If so, no sorting or reversing is needed, return the array as is
            return arr;
        }

        // Reverse the array
        for (int i = 0; i < arr.length / 2; i++) {
        	// Swap the elements at positions i and arr.length - 1 - i
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }

        // Sort the reversed array in ascending order
        Arrays.sort(arr);

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {5, 12, 9, 3, 21};

        int[] sortedAndReversedArray = getSorted(arr);

        System.out.println("Sorted and Reversed Array:");
        for (int num : sortedAndReversedArray) {
            System.out.print(num + " ");
        }
    }
}

