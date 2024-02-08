/*
 * TITLE: Review 01 - Time Asleep
 * NAME: James Tung
 * DATE: 2024-02-05
 * DESCRIPTION: Returns days alive and hours asleep based on birthdate and current date.
 */

package Review01;

import java.util.Scanner;

public class TimeAsleep {
    public static void main(String[] args) {
        // Variables
        Scanner sc = new Scanner(System.in);
        int[] birthdate = new int[3];
        int days;

        // Input
        System.out.println("When were you born?");
        System.out.print("Year: ");
        birthdate[2] = sc.nextInt();
        System.out.print("Month: ");
        birthdate[1] = sc.nextInt();
        System.out.print("Day: ");
        birthdate[0] = sc.nextInt();

        System.out.println("What's the current date?");
        System.out.print("Year: ");
        days = sc.nextInt() - birthdate[2];
        System.out.print("Month: ");
        days += sc.nextInt() - birthdate[1];
        System.out.print("Day: ");
        days += sc.nextInt() - birthdate[0];

        // Output
        System.out.println("You have been alive for " + days + " days.");
        System.out.println("You have been asleep for " + (days * 8) + " hours.");
    }
}
