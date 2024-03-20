/*
 * TITLE: Algorithms06 - Recursive Power
 * NAME: James Tung
 * DATE: 03/18/2024
 * DESCRIPTION: Calculate X to the N using recursion.
 */

package Algos06;

public class RecursePower {
    public static void main(String[] args) {
        System.out.println(power(2, 5));
    }

    public static int power(int x, int n) {
        if (n == 0) return 1;
        else if (n == 1) return x;

        return x * power(x, n - 1);
    }
}
