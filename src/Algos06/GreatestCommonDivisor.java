/*
 * TITLE: Algorithms06 - Greatest Common Divisor
 * NAME: James Tung
 * DATE: 03/18/2024
 * DESCRIPTION: Implement Euclid's Algorithm for finding the GCD recursively.
 */

package Algos06;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        System.out.println(gcd(198270, 90));
    }

    public static int gcd(int m, int n) {
        int result;

        if (m == n) {
            result = m;
        } else if (m > n) {
            result = gcd(n, m - n);
        } else {
            result = gcd(n, m);
        }

        return result;
    }
}
