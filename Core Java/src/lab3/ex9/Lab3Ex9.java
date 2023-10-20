package lab3.ex9;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Lab3Ex9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a date
        System.out.print("Enter a date (YYYY-MM-DD): ");
        String inputDateStr = scanner.next();

        try {
            // Parse the user's input into a Date object
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            Date inputDate = dateFormat.parse(inputDateStr);

            // Get the current system date
            Date currentDate = new Date();

            // Calculate the duration in milliseconds
            long durationInMillis = currentDate.getTime() - inputDate.getTime();

            // Calculate the duration in days
            long days = durationInMillis / (1000 * 60 * 60 * 24);

            // Calculate the duration in years and months
            Calendar inputCalendar = Calendar.getInstance();
            inputCalendar.setTime(inputDate);

            Calendar currentCalendar = Calendar.getInstance();
            currentCalendar.setTime(currentDate);

            int years = currentCalendar.get(Calendar.YEAR) - inputCalendar.get(Calendar.YEAR);
            int months = currentCalendar.get(Calendar.MONTH) - inputCalendar.get(Calendar.MONTH);

            if (months < 0) {
                years--;
                months += 12;
            }

            // Display the calculated duration
            System.out.println("Duration: " + years + " years, " + months + " months, and " + days + " days.");
        } catch (ParseException e) {
            System.out.println("Invalid date format. Please use YYYY-MM-DD format.");
        }

        scanner.close();
    }
}
