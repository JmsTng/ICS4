/*
 * TITLE: Algorithms07 - CountHanoi
 * NAME: James Tung
 * DATE: 03/20/2024
 * DESCRIPTION:
 */

package Algos07;

public class CountHanoi {
    public static void main(String[] args) {
        System.out.println(countMoves(7));
    }

    public static int countMoves(int height) {
        if (height == 1) return 1;
        return 2 * countMoves(height - 1) + 1;
    }
}
