package lab6.ex4;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Lab6Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Integer, String> studentMedals = new HashMap<>();

        int registrationNumber;
        
        while (true) {
            System.out.print("Enter student registration number (or 0 to finish): ");
            registrationNumber = scanner.nextInt();

            if (registrationNumber == 0) {
                break; // Exit the input loop if 0 is entered
            }

            System.out.print("Enter student marks: ");
            int marks = scanner.nextInt();

            String medalType = determineMedalType(marks);

            // Add the student's registration number and medal type to the map
            studentMedals.put(registrationNumber, medalType);
        }

        // Display the students and their medal types
        for (Map.Entry<Integer, String> entry : studentMedals.entrySet()) {
            int regNumber = entry.getKey();
            String medalType = entry.getValue();
            System.out.println("Student " + regNumber + " received a " + medalType + " medal.");
        }

        scanner.close();
    }

    // Helper method to determine the medal type based on the marks
    private static String determineMedalType(int marks) {
        if (marks >= 90) {
            return "Gold";
        } else if (marks >= 80) {
            return "Silver";
        } else if (marks >= 70) {
            return "Bronze";
        } else {
            return "No Medal";
        }
    }
}
