package lab3.ex1;

import java.util.Scanner;

public class Lab3Ex1 {
    private static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);

        // Prompt the user to enter a line of integers (space-separated)
        System.out.print("Enter a line of integers: ");
        String inputLine = scanner.nextLine();

        // Split the input line into tokens using space as a delimiter
        String[] tokens = inputLine.split(" ");
        int sum = 0;

        // Iterate through the tokens
        for (String token : tokens) {
            try {
                // Attempt to parse each token as an integer
                int number = Integer.parseInt(token);
                System.out.println("Integer: " + number);
                sum += number;
            } catch (NumberFormatException e) {
                // Handle exceptions for non-integer tokens
                System.out.println("Invalid token: " + token);
            }
        }

        // Display the sum of valid integers
        System.out.println("Sum of Integers: " + sum);
    }
}
