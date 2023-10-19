package lab3.ex1;

import java.util.Scanner;

public class Lab3Ex1 {
    private static Scanner scanner;

	public static void main(String[] args) {
        scanner = new Scanner(System.in);
        System.out.print("Enter a line of integers (space-separated): ");
        String inputLine = scanner.nextLine();

        String[] tokens = inputLine.split(" ");
        int sum = 0;

        for (String token : tokens) {
            try {
                int number = Integer.parseInt(token);
                System.out.println("Integer: " + number);
                sum += number;
            } catch (NumberFormatException e) {
                System.out.println("Invalid token: " + token);
            }
        }

        System.out.println("Sum of Integers: " + sum);
    }
}
