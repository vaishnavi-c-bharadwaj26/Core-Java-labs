package lab3.ex8;

import java.util.Scanner;

public class Lab3Ex8 {
    // Method to check if a given string is a positive string
    public static boolean isPositiveString(String str) {
        // Check if the string is empty or consists of a single character (it's positive by default)
        if (str.isEmpty() || str.length() == 1) {
            return true;
        }

        // Iterate through the characters in the string
        for (int i = 1; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            char previousChar = str.charAt(i - 1);

            // Check if the current character comes after the previous character in alphabetical order
            if (currentChar <= previousChar) {
                return false; // If not, it's not a positive string
            }
        }

        return true; // If the loop completes without finding any violations, it's a positive string
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String userString = scanner.nextLine();

        // Call the isPositiveString method to check if the entered string is positive
        boolean isPositive = isPositiveString(userString);

        // Display the result
        if (isPositive) {
            System.out.println("The entered string is a positive string.");
        } else {
            System.out.println("The entered string is a negative string.");
        }

        scanner.close(); 
    }
}
