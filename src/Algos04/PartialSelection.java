/*
 * TITLE: Partial Selection Sort
 * NAME: James Tung
 * DATE: 03/04/2024
 * DESCRIPTION: Sort the largest k values in an array.
 */

package Algos04;

import java.util.Arrays;
import java.util.Scanner;

public class PartialSelection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[sc.nextInt()];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(arr));
        partialSelection(arr, 3);
        System.out.println(Arrays.toString(arr));
    }

    public static void partialSelection(int[] arr, int k) {
        int temp;
        int high;

        for (int i = 1; i <= k; i++) {
            high = 0;

            for (int j = arr.length - i; j >= 0; j--) {
                if (arr[j] > arr[high]) high = j;
            }

            temp = arr[high];
            arr[high] = arr[arr.length - i];
            arr[arr.length - i] = temp;
        }
    }
}
