package lab3.ex2;

import java.util.Scanner;

public class Lab3Ex2 {
    // Method to generate the mirror image of a string
    public static String getImage(String input) {
        // Create a StringBuilder to store the result.
        StringBuilder result = new StringBuilder(input);
        
        // Append a pipe ('|') separator.
        result.append("|");
        
        // Reverse the input string and append it to the result.
        result.append(new StringBuilder(input).reverse());
        
        // Convert the StringBuilder to a String and return it.
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        
        // Read the user's input.
        String input = scanner.nextLine();

        // Generate the mirror image.
        String mirrorImage = getImage(input);
        
        // Display the original and mirror image strings.
        System.out.println("Original String: " + input);
        System.out.println("Mirror Image: " + mirrorImage);
        
        // Close the scanner to release system resources.
        scanner.close();
    }
}

