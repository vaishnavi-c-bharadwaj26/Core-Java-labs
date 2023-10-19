package lab6.ex2;

import java.util.*;

public class Lab6Ex2 {
    public static Map<Character, Integer> countChars(char[] arr) {
        // Create a new HashMap to store the character counts.
        Map<Character, Integer> charCountMap = new HashMap<>();

        // Iterate through the input character array 'arr'.
        for (char c : arr) {
            // Check if the character 'c' is already in the map.
            if (charCountMap.containsKey(c)) {
                // If it is, increment the count associated with 'c'.
                int count = charCountMap.get(c);
                charCountMap.put(c, count + 1);
            } else {
                // If the character is not in the map, add it with a count of 1.
                charCountMap.put(c, 1);
            }
        }

        // After processing all characters, the map contains counts of each character.
        return charCountMap;
    }

    public static void main(String[] args) {
        // Create a sample character array 'arr' to count characters in.
        char[] arr = {'a', 'b', 'c', 'a', 'b', 'c', 'a'};

        // Call the 'countChars' method to count the characters in 'arr'.
        Map<Character, Integer> result = countChars(arr);

        // Iterate through the map and print the character and its count.
        for (Map.Entry<Character, Integer> entry : result.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}

 


	 