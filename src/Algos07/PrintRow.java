/*
 * TITLE: PrintRow
 * NAME: James Tung
 * DATE: 03/20/2024
 * DESCRIPTION:
 */

package Algos07;

public class PrintRow {
    public static void main(String[] args) {
        printRow(19);
    }

    public static void printRow(int n) {
        if (n > 0) {
            printRow(n - 1);
            System.out.print("*");
        }
    }
}
