/*
 * TITLE: Review 05 - CheckLine
 * NAME: James Tung
 * DATE: 2024-02-10
 * DESCRIPTION:
 */

package Review05;

import java.util.Scanner;

public class CheckLine {
    public static void main(String[] args) {
        // Variables
        Scanner sc = new Scanner(System.in);
        int x1, y1, x2, y2, x3, y3, x4, y4;

        // Input
        System.out.println("Enter the coordinate pairs of the first line:");
        System.out.print("First point (x1 y1): ");
        x1 = sc.nextInt();
        y1 = sc.nextInt();
        System.out.print("Second point (x2 y2): ");
        x2 = sc.nextInt();
        y2 = sc.nextInt();

        System.out.println("\nEnter the coordinate pairs of the second line:");
        System.out.print("First point (x3 y3): ");
        x3 = sc.nextInt();
        y3 = sc.nextInt();
        System.out.print("Second point (x4 y4): ");
        x4 = sc.nextInt();
        y4 = sc.nextInt();

        // Output
        System.out.println("\nResults:");
        System.out.println(Line.length(x1, y1, x2, y2) == Line.length(x3, y3, x4, y4) ? "The lines are the same length." : "The lines are not the same length.");  // Ternary operator to check if the lines are the same length
        if (Line.slope(x1, y1, x2, y2) == Line.slope(x3, y3, x4, y4)) {  // Check if the lines are parallel
            System.out.println("The lines are parallel.");
        } else if (Line.slope(x1, y1, x2, y2) == -1 / Line.slope(x3, y3, x4, y4)) {  // Check if the lines are perpendicular by calculating negative reciprocal
            System.out.println("The lines are perpendicular.");
        } else {
            System.out.println("The lines do not have the same slope.");
        }
    }
}
