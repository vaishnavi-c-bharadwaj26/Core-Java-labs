package lab5.ex1;

class InvalidAgeException extends Exception {
    
	private static final long serialVersionUID = 1424537442727918238L;

	public InvalidAgeException(String message) {
        super(message);
    }
}

public class Lab5Ex1 {
    public static void checkAge(int age) throws InvalidAgeException {
        if (age <= 15) {
            throw new InvalidAgeException("Age should be above 15");
        }
    }

    public static void main(String[] args) {
        int ageToCheck = 19;  // Replace with the age you want to validate

        try {
            checkAge(ageToCheck);
            System.out.println("Age is valid.");
        } catch (InvalidAgeException e) {
            System.out.println("Invalid Age: " + e.getMessage());
        }
    }
}
