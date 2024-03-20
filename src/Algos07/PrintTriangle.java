/*
 * TITLE: Algorithms07 - Print Triangle
 * NAME: James Tung
 * DATE: 03/20/2024
 * DESCRIPTION: Recursively print a right isosceles triangle with legs of length N.
 */

package Algos07;

public class PrintTriangle {
    public static void main(String[] args) {
        printTriangle(10);
    }

    public static void printTriangle(int n) {
        if (n > 0) {
            printTriangle(n - 1);
            printTriangleRow(n);
            System.out.println();
        }
    }

    public static void printTriangleRow(int n) {
        if (n > 0) {
            printTriangleRow(n - 1);
            System.out.print("*");
        }
    }
}
