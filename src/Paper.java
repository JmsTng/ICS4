/*
 * TITLE: Review 02 - Paper
 * NAME: James Tung
 * DATE: 2024-02-06
 * DESCRIPTION: This program calculates the area and thickness of a piece of paper after being folded 40 times.
 */

public class Paper {
    public static void main(String[] args) {
        // Variables
        double thickness = 0.09;
        double area = 1;

        // Calculations
        for (int i = 1; i <= 40; i++) {  // Fold paper 40 times
            area /= 2;
            thickness *= 2;
        }

        // Output
        System.out.printf("Area: %.20fm^2 Thickness: %.2fmm\n", area, thickness);
    }
}
