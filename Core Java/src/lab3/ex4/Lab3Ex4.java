package lab3.ex4;

import java.util.Scanner;

public class Lab3Ex4 {
    
    public static int modifyNumber(int number) {
        // Convert the input number to a string to process each digit individually
        String numStr = Integer.toString(number);
        
        // Create a StringBuilder to build the modified number
        StringBuilder modifiedNumStr = new StringBuilder();

        // Iterate through the digits in the string except the last one
        for (int i = 0; i < numStr.length() - 1; i++) {
        	
            // Get the current digit and the next digit
            int currentDigit = Character.getNumericValue(numStr.charAt(i));
            int nextDigit = Character.getNumericValue(numStr.charAt(i + 1));
            
            // Calculate the absolute difference between the current and next digits
            int difference = Math.abs(currentDigit - nextDigit);

            // Append the calculated difference to the modified number
            modifiedNumStr.append(difference);
        }

        // Append the last digit as it is
        modifiedNumStr.append(numStr.charAt(numStr.length() - 1));

        // Convert the modified number from StringBuilder to an integer
        return Integer.parseInt(modifiedNumStr.toString());
    }

    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Input from the user
        System.out.print("Enter a number: ");
        
        // Read the original number from the user's input
        int originalNumber = scanner.nextInt();

        // Calculate the modified number using the modifyNumber method
        int modifiedNumber = modifyNumber(originalNumber);

        // Display the original and modified numbers
        System.out.println("Original Number: " + originalNumber);
        System.out.println("Modified Number: " + modifiedNumber);

    
        scanner.close();
    }
}
