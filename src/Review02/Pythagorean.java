/*
 * TITLE: Review 02 - Pythagorean
 * NAME: James Tung
 * DATE: 2024-02-06
 * DESCRIPTION: Print all Pythagorean triples who's largest member is less than or equal to an input number.
 */

package Review02;

import java.util.Scanner;

public class Pythagorean {
    public static void main(String[] args) {
        // Variables
        Scanner sc = new Scanner(System.in);
        int limit;

        // Input
        System.out.print("Enter the limit: ");
        limit = sc.nextInt();

        // Output
        for (int a = 1; a <= limit; a++) {
            for (int b = a; b <= limit; b++) {
                for (int c = b; c <= limit; c++) {
                    if (a * a + b * b == c * c) {
                        System.out.printf("%d, %d, %d%n", a, b, c);
                    }
                }
            }
        }
    }
}
