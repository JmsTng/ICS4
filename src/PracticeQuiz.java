/*
 * TITLE: Practice Quiz 01
 * NAME: James Tung
 * DATE: 02/08/2024
 * DESCRIPTION: Solutions for Practice Quiz 01 - Grade 11 Java Review.
 */

import java.util.Scanner;

public class PracticeQuiz {
    public static void main(String[] args) {
         daysWorking();
         charStats();
         coldestMonth();
    }

    public static void daysWorking() {
        // Constants
        final float DAYS_PER_YEAR = 365f;

        // Variables
        Scanner sc = new Scanner(System.in);
        int msDays, mrDays;

        // Input
        System.out.println("# of days worked");
        System.out.print("Ms. Jackson: ");
        msDays = sc.nextInt();
        System.out.print("Mr. Jackson: ");
        mrDays = sc.nextInt();

        // Calculations + Output
        System.out.printf("Ms. Jackson: %.0f%%%n", (msDays / DAYS_PER_YEAR) * 100);
        System.out.printf("Mr. Jackson: %.0f%%%n", (mrDays / DAYS_PER_YEAR) * 100);
        System.out.printf("Average Attendance: %.0f%%", ((msDays + mrDays) / (2 * DAYS_PER_YEAR)) * 100);
    }

    public static void charStats() {
        // Variables
        Scanner sc = new Scanner(System.in);
        int uppers = 0;
        char highest = 0;
        char in;

        // Input
        System.out.println("Enter 's' or 'S' to exit.");
        System.out.print("Character: ");
        in = sc.nextLine().charAt(0);

        // Looping
        while (in != 's' && in != 'S') {
            // Logic
            if (in >= 'A' && in <= 'Z') uppers++;
            if (in > highest) highest = in;

            // Input
            System.out.print("Character: ");
            in = sc.nextLine().charAt(0);
        }

        // Output
        System.out.println("\nUppercase Characters: " + uppers);
        System.out.println("Lexicographically Largest Character: " + (highest == 0 ? "None" : highest));
    }

    public static void coldestMonth() {
        // Constants
        final int MONTHS = 12;
        final int PROVINCE = 1;

        // Variables
        Scanner sc = new Scanner(System.in);
        String[] provinces = {"Alberta", "British Columbia", "Manitoba", "New Brunswick", "Newfoundland & Labrador", "Nova Scotia", "Ontario", "Prince Edward Island", "Quebec", "Saskatchewan", "Northwest Territories", "Nunavut", "Yukon"};
        String provinceName;
        int[][] temps = new int[PROVINCE][MONTHS];
        int coldest, coldestTemp;
        boolean found = false;

        // Input
        for (int i = 0; i < PROVINCE; i++) {
            System.out.println("Province/Territory - " + provinces[i]);
            for (int j = 0; j < MONTHS; j++) {
                System.out.print("Temperature for month #" + (j + 1) + ": ");  // 1-indexed (1 = January)
                temps[i][j] = sc.nextInt();  // Set the temperature for the month
            }
        }

        sc.nextLine();  // Clear the buffer
        System.out.print("\nEnter the name of a province/territory: ");
        provinceName = sc.nextLine();

        // Output
        for (int i = 0; i < PROVINCE && !found; i++) {
            if (provinces[i].equalsIgnoreCase(provinceName)) {
                found = true;
                coldestTemp = temps[i][0];
                coldest = 0;
                for (int j = 1; j < MONTHS; j++) {
                    if (temps[i][j] < coldestTemp) {
                        coldestTemp = temps[i][j];
                        coldest = j;
                    }
                }
                System.out.println("The coldest month in " + provinceName + " is month #" + (coldest + 1) + ".");
            }
        }

        if (!found) System.out.println("Province not found.");
    }
}
