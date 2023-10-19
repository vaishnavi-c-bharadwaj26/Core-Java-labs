package lab5.ex2;

import java.util.Scanner;

class BlankNameException extends Exception {
    
	private static final long serialVersionUID = -1426958394247713310L;

	public BlankNameException(String message) {
        super(message);
    }
}

public class Lab5Ex2 {
    private static Scanner scanner;

	public static void validateFullName(String firstName, String lastName) throws BlankNameException {
        if (firstName.trim().isEmpty() || lastName.trim().isEmpty()) {
            // If either the first name or last name is blank, throw a custom exception.
            throw new BlankNameException("First name and last name cannot be blank.");
        }
    }

    public static void main(String[] args) {
        scanner = new Scanner(System.in);

        System.out.print("Enter First Name: ");
        // Read the first name from the user.
        String firstName = scanner.nextLine();

        System.out.print("Enter Last Name: ");
        // Read the last name from the user.
        String lastName = scanner.nextLine();

        try {
            // Attempt to validate the full name.
            validateFullName(firstName, lastName);
            System.out.println("Full name is valid.");
        } catch (BlankNameException e) {
            // Catch and handle the custom exception.
            System.out.println("Invalid Full Name: " + e.getMessage());
        }
    }
}
