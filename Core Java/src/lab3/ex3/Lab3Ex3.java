package lab3.ex3;

import java.util.Scanner;

public class Lab3Ex3 {
    // Function to check if a character is a vowel or not
    static boolean isVowel(char ch) {
    	if (!Character.toString(ch).matches("[aeiouAEIOU]")) {
            return false;
        }
        return true;
    }

    // Function that replaces consonants in a character array with the next alphabet
    static String replaceConsonants(char[] s) {
        for (int i = 0; i < s.length; i++) {
            if (!isVowel(s[i])) {
                if (s[i] == 'z') {
                    s[i] = 'b'; // Replace 'z' with 'b'
                } else {
                    s[i] = (char) (s[i] + 1); // Replace with the next immediate alphabet
                    if (isVowel(s[i])) {
                        s[i] = (char) (s[i] + 1); // If next immediate alphabet is a vowel, take the 2nd immediate alphabet
                    }
                }
            }
        }
        return String.valueOf(s);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Call the replaceConsonants method to replace consonants in the string
        String result = replaceConsonants(input.toCharArray());

        // Display the original and replaced strings
        System.out.println("Original String: " + input);
        System.out.println("Replaced String: " + result);

        scanner.close();
    }

}
