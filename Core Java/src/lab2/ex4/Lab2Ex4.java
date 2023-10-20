package lab2.ex4;

import java.util.Arrays;

public class Lab2Ex4 {
    public static int[] modifyArray(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return arr; // No modification needed
        }

        // Sort the original array in ascending order
        Arrays.sort(arr);

        // Count the number of unique elements
        int uniqueCount = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                uniqueCount++;
            }
        }

        // Create a new array to store the unique elements
        int[] resultArray = new int[uniqueCount];
        resultArray[0] = arr[0];
        int index = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                resultArray[index] = arr[i];
                index++;
            }
        }

        // Create a new array to store the result in descending order
        int[] descendingArray = new int[resultArray.length];
        for (int i = 0; i < resultArray.length; i++) {
            descendingArray[i] = resultArray[resultArray.length - 1 - i];
        }

        return descendingArray;
    }

    public static void main(String[] args) {
        int[] arr = {5, 12, 9, 3, 21, 12, 5};

        int[] modifiedArray = modifyArray(arr);

        System.out.println("Modified Array (Descending Order without Duplicates):");
        for (int num : modifiedArray) {
            System.out.print(num + " ");
        }
    }
}



