/*
 * TITLE: RecurseBinSearch
 * NAME: James Tung
 * DATE: 03/20/2024
 * DESCRIPTION:
 */

package Algos07;

public class RecurseBinSearch {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 24, 66, 312, 523, 634, 1235, 2931, 12492, 25662, 32832};

        System.out.println(binary(arr, 32832, 0, arr.length));
    }

    public static int binary(int[] list, int item, int start, int end) {
        System.out.println(start + "    " + end);
        if (start >= end) return -1;

        int pivot = (start + end) / 2;
        if (list[pivot] == item)     return pivot;
        else if (list[pivot] > item) return binary(list, item, start, pivot);
        else                         return binary(list, item, pivot + 1, end);
    }
}
