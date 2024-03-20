/*
 * TITLE: Algorithms07 - Largest Of List
 * NAME: James Tung
 * DATE: 03/20/2024
 * DESCRIPTION:
 */

package Algos07;

public class LargestOfList {
    public static void main(String[] args) {
        System.out.println(largest(new int[]{5, 123, 2, 76, 34, 2, 7, 1, 236, 4, 3, 2}));
    }

    public static int largest(int[] list) {
        return largest(list, 0, list.length - 1);
    }

    public static int largest(int[] list, int start, int end) {
        if (start >= end) return list[end];

        return Math.max(Math.max(list[start], list[end]), largest(list, start + 1, end - 1));
    }
}
