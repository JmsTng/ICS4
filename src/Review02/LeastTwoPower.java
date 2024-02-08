/*
 * TITLE: Review 02 - Least Power of Two
 * NAME: James Tung
 * DATE: 02/06/2024
 * DESCRIPTION: Given an integer n, finds the first integer m where 2^m is greater than or equal to n.
 */

package Review02;

import java.util.Scanner;

public class LeastTwoPower {
    public static void main(String[] args) {
        // Variables
        Scanner sc = new Scanner(System.in);
        int target, power;

        // Input
        System.out.print("Enter a number: ");
        target = sc.nextInt();

        // Calculations
        power = (int) Math.ceil(Math.log(target) / Math.log(2));

        // Output
        System.out.println("The least power of 2 greater than or equal to " + target + " is 2^" + power + " = " + (int) Math.pow(2, power));
    }
}
