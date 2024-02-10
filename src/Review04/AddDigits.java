/*
 * TITLE: Review 04 - Add Digits
 * NAME: James Tung
 * DATE: 2024-02-10
 * DESCRIPTION: This program takes a number as input and returns the sum of its digits.
 */

package Review04;

import java.util.Scanner;

public class AddDigits {
    public static void main(String[] args) {
        // Variables
        Scanner sc = new Scanner(System.in);
        int num;
        int sum = 0;

        // Input
        System.out.print("Enter a number: ");
        num = sc.nextInt();

        // Calculations
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }

        // Output
        System.out.println("Sum of digits: " + sum);
    }
}
