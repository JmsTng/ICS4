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
        int[][] pairs = new int[sc.nextInt()][2]; // Store input pairs
        sc.nextLine(); // Reset input buffer
        String[] next;

        for (int i = 0; i < pairs.length; i++) {
            next = sc.nextLine().split(" "); // Parse data in the form: n k
            pairs[i] = new int[]{Integer.parseInt(next[0]), Integer.parseInt(next[1])};
        }

        for (int i = 0; i < pairs.length; i++) {
            System.out.println("The bit patterns are");
            pattern(pairs[i][0], pairs[i][1]);
            System.out.println();
        }
    }

    public static void pattern(int n, int k) {
        pattern("", n, k);
    }

    public static void pattern(String s, int n, int k) {
        if (n == 0 && k == 0) {  // If target length reached and all 1s were used
            System.out.println(s);
        } else if (n > 0) {  // If target length has not been reached
            if (k > 0) pattern(s + "1", n - 1, k - 1);  // Generate 1 branch only if there are remaining 1s
            pattern(s + "0", n - 1, k);
        }
    }
}
