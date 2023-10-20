package lab5.ex1;

class InvalidAgeException extends Exception {

    private static final long serialVersionUID = 1424537442727918238L;

    public InvalidAgeException(String message) {
        super(message);
    }
}

public class Lab5Ex1 {
    // Method to check the age and throw an InvalidAgeException if age is 15 or less
    public static void checkAge(int age) throws InvalidAgeException {
        if (age <= 15) {
            // If the age is 15 or less, create and throw an InvalidAgeException with a custom error message
            throw new InvalidAgeException("Age should be above 15");
        }
    }

    public static void main(String[] args) {
        int ageToCheck = 19; // Replace with the age you want to validate

        try {
            // Call the checkAge method to validate the age
            checkAge(ageToCheck);
            System.out.println("Age is valid.");
        } catch (InvalidAgeException e) {
            // Catch and handle the InvalidAgeException if it's thrown
            System.out.println("Invalid Age: " + e.getMessage());
        }
    }
}
