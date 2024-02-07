/*
 * TITLE: Review 03 - Non-uniform 2D Array
 * NAME: James Tung
 * DATE: 02/07/2024
 * DESCRIPTION:
 */

public class NonUniform2DArray {
    public static void main(String[] args) {
        // Variables
        int sum = 0;
        int[][] data = {
            {3, 2, 5},
            {1, 4, 4, 8, 13},
            {9, 1, 0, 2},
            {0, 2, 6, 4, -1, -8}
        };

        // Summation
        for (int[] i : data) {
            for (int j : i) {
                sum += j;
            }
            System.out.println(sum);  // Output every loop
            sum = 0;
        }
    }
}
