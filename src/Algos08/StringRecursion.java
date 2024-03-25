/*
 * TITLE: Algorithms08 - String Recursion
 * NAME: James Tung
 * DATE: 03/22/2024
 * DESCRIPTION: A collection of standard string methods, implemented using recursion.
 */

package Algos08;

public class StringRecursion {
    public static void main(String[] args) {
        // Code
    }

    public static int length(String s) {
        if (s.isEmpty()) return 0;

        return length(s.substring(1)) + 1;
    }

    public static boolean equalsIgnoreCase(String s1, String s2) {
        if (s1.charAt(0) != s2.charAt(0)) {
            if (s1.substring(0, 0).toLowerCase().equals(s2.substring(0, 0).toLowerCase())) {

            }
        }

        return equalsIgnoreCase(s1.substring(1), s2.substring(1));
    }
}
