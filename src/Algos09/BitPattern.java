/*
 * TITLE: Algorithms09 - Bit Pattern
 * NAME: James Tung
 * DATE: 03/25/2024
 * DESCRIPTION: Generate all patterns of 1s and 0s of length n, containing k 1s, in descending order.
 */

package Algos09;

import java.util.Scanner;

public class BitPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        pattern(sc.nextInt(), sc.nextInt());
    }

    public static void pattern(int n, int k) {
        pattern("", n, k);
    }

    public static void pattern(String s, int n, int k) {
        if (n == 0 && k == 0) {
            System.out.println(s);
        } else if (n > 0) {
            if (k > 0) pattern(s + "1", n - 1, k - 1);
            pattern(s + "0", n - 1, k);
        }
    }
}
