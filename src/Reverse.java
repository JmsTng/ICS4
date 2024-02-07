/*
 * TITLE: Review 03 - Reverse
 * NAME: James Tung
 * DATE: 02/07/2024
 * DESCRIPTION: Reverse an array using a second array, and inline.
 */

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        // Variables
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[14];
        int[] reversed, reversedInline;

        // Input
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter a number: ");
            arr[i] = sc.nextInt();
        }

        // Reversing
        reversed = reverse(arr);
        reversedInline = reverseInline(arr);

        // Output
        for (int i : reversed) {  // First method
            System.out.println(i);
        }

        for (int i : reversedInline) {  // Second method
            System.out.println(i);
        }
    }

    public static int[] reverse(int[] arr) {
        // Variables
        int length = arr.length;
        int[] res = new int[length];

        // Reversing
        for (int i = 0; i < length; i++) {
            res[length - i - 1] = arr[i];
        }

        return res;
    }

    public static int[] reverseInline(int[] arr) {
        // Variables
        int length = arr.length;
        int temp;

        // Reversing
        for (int i = 0; i < length / 2; i++) {
            temp = arr[i];
            arr[i] = arr[length - i - 1];
            arr[length - i - 1] = temp;
        }

        return arr;
    }
}
