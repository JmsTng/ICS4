/*
 * TITLE: Review 04 - Add Pairs
 * NAME: James Tung
 * DATE: 2024-02-10
 * DESCRIPTION: This program takes a number as input and returns the sum of pairs of digits.
 */

package Review04;

import java.util.Scanner;

public class AddPairs {
    public static void main(String[] args) {
        // Variables
        Scanner sc = new Scanner(System.in);
        char[] num;
        int sum = 0;

        // Input
        System.out.print("Enter a number: ");
        num = sc.next().toCharArray();

        // Calculations
        for (int i = 0; i < num.length; i += 2) {
            // Use an empty string to implicitly cast to String
            if (i == num.length - 1) sum += Integer.parseInt("" + num[i]);
            else                     sum += Integer.parseInt("" + num[i] + num[i + 1]);
        }

        // Output
        System.out.println("Sum of pairs: " + sum);
    }
}
