/*
 * TITLE: Algorithms06 - Squares
 * NAME: James Tung
 * DATE: 03/18/2024
 * DESCRIPTION: Recursively calculate the value of a square number.
 */

package Algos06;

public class Squares {
    public static void main(String[] args) {
        System.out.println(square(15));
    }

    public static int square(int n) {
        if (n == 1) return 1;

        return square(n - 1) + 2 * n - 1;
    }
}
