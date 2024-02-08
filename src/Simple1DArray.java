/*
 * TITLE: Review 03 - Simple 1D Array
 * NAME: James Tung
 * DATE: 02/07/2024
 * DESCRIPTION: Perform multiple tasks on an array.
 */

import java.util.Scanner;

public class Simple1DArray {
    public static void main(String[] args) {
        // Variables
        Scanner sc = new Scanner(System.in);
        int[] arr;
        int n, temp;
        int sampleSum = 0;

        // Part (a)
        System.out.print("Enter a number: ");
        n = sc.nextInt();
        arr = new int[n];

        // Part (b)
        for (int i = 0; i < n; i++) {  // Loop through all elements of arr
            arr[i] = 1;
        }

        // Part (c)
        for (int i = 0; i < n; i++) {
            System.out.print("Enter a number: ");
            arr[i] = sc.nextInt();
        }

        // Part (d)
        temp = arr[0];
        arr[0] = arr[arr.length-1];
        arr[arr.length-1] = temp;

        // Part (e)
        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) arr[i] *= -1;
        }

        // Part (f)
        for (int i : arr) {
            sampleSum += i;
        }
        System.out.println(sampleSum);

        // Part (g)
        for (int i : arr) {
            if (i % 2 == 0) System.out.println(i);
        }
    }
}
