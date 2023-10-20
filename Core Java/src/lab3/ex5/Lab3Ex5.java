package lab3.ex5;

import java.util.Scanner;

public class Lab3Ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter text:");

        int characterCount = 0;
        int wordCount = 0;
        int lineCount = 0;

        while (true) {
            // Read a line of text entered by the user
            String line = scanner.nextLine();

            // Check if the entered line is empty
            if (line.isEmpty()) {
                break; // Exit the loop when an empty line is encountered
            }

            // Count characters (including spaces and punctuation) in the line
            characterCount += line.length();
            
            //For only characters(excluding spaces and punctuation)
//            for (char c : line.toCharArray()) {
//                if (Character.isLetter(c)) {
//                    characterCount++;

            // Count words by splitting the line into words based on spaces
            String[] words = line.split("\\s+"); // Split by one or more spaces The regular expression "\\s+" matches one or more spaces, tabs, or other whitespace characters
            wordCount += words.length;

            // Count lines (each line entered by the user)
            lineCount++;
        }

        // Display the counts of characters, words, and lines
        System.out.println("Character Count: " + characterCount);
        System.out.println("Word Count: " + wordCount);
        System.out.println("Line Count: " + lineCount);

        scanner.close();
    }
}
