package lab6.ex3;

import java.util.*;

public class Lab6Ex3 {
	
    // Method to calculate squares of numbers and store them in a map
    public static Map<Integer, Integer> getSquares(int[] numbers) {
        // Create a map to store number-square pairs
        Map<Integer, Integer> squareMap = new HashMap<>();

        // Iterate through the numbers
        for (int num : numbers) {
            // Calculate the square of the number
            int square = num * num;

            // Store the number and its square in the map
            squareMap.put(num, square);
        }

        return squareMap;
    }

    public static void main(String[] args) {
        // Array of numbers
        int[] numbers = {19, 36, 12, 55, 25};
        
        // Get the number-square map by calling the getSquares method
        Map<Integer, Integer> result = getSquares(numbers);

        // Iterate through the map and print number-square pairs
        for (Map.Entry<Integer, Integer> entry : result.entrySet()) {
            // Print the square and the original number
            System.out.println(entry.getValue() + " is the square of " + entry.getKey());
        }
    }
}








	 
	    