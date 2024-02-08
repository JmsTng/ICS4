/*
 * TITLE: Review 01 - Average Three Doubles
 * NAME: James Tung
 * DATE: 2024-02-05
 * DESCRIPTION: This program takes three doubles as input and returns the average of the three numbers.
 */

package Review01;

import java.util.Scanner;

public class AvgThreeDoubles {
    public static void main(String[] args) {
        // Variables
        Scanner sc = new Scanner(System.in);
        double avg = 0;

        // Input
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter a number: ");
            avg += sc.nextDouble();
        }

        avg /= 3;  // Calculate average by dividing by 3

        // Output
        System.out.println(avg);
    }
}
