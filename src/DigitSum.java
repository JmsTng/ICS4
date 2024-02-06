/*
 * TITLE: Review 01 - DigitSum
 * NAME: James Tung
 * DATE: 2024-02-05
 * DESCRIPTION: This program takes a three-digit number as input and returns the sum of its digits.
 */

import java.util.Scanner;

public class DigitSum {
    public static void main(String[] args) {
        // Variables
        Scanner sc = new Scanner(System.in);
        char[] num;
        int sum = 0;

        // Input
        System.out.print("Enter a three-digit number: ");
        num = sc.next().toCharArray();
        if (num.length != 3) {
            System.out.println("Input was not a three-digit number.");
            return;
        }

        // Calculations
        for (int i = 0; i < 3; i++) {
            sum += Integer.parseInt(String.valueOf(num[i]));
        }

        // Output
        System.out.println("Number: " + Integer.parseInt(String.valueOf(num)));
        System.out.println("Sum of digits: " + sum);
    }
}
