/*
 * TITLE: Algorithms06 - RecursePower
 * NAME: James Tung
 * DATE: 03/18/2024
 * DESCRIPTION: Calculate X to the N using recursion.
 */

package Algos06;

public class RecursePower {
    public static void main(String[] args) {
        System.out.println(power(2, 1));
    }

    public static int power(int x, int n) {
        if (n == 0) return 1;
        else if (n == 1) return x;

        return power(x, n - 1, x * x);
    }

    public static int power(int x, int n, int value) {
        if (n == 0) return value;

        return power(x, n - 1, value * x);
    }
}
