/*
 * TITLE: Practice Quiz 01
 * NAME: James Tung
 * DATE: 02/08/2024
 * DESCRIPTION:
 */

import java.util.Scanner;

public class PracticeQuiz {
    public static void main(String[] args) {
        daysWorking();
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
        char in = 0;

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
    }
}
