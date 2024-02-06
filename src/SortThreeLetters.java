/*
 * TITLE: Review 02 - Sort Three Letters
 * NAME: James Tung
 * DATE: 2024-02-05
 * DESCRIPTION: This program takes three letters as input and returns them in alphabetical order.
 */

import java.util.Scanner;

public class SortThreeLetters {
    public static void main(String[] args) {
        // Variables
        Scanner sc = new Scanner(System.in);
        char[] letters = new char[3];
        char temp;

        // Input
        System.out.print("Enter the first letter: ");
        letters[0] = sc.next().charAt(0);
        System.out.print("Enter the second letter: ");
        letters[1] = sc.next().charAt(0);
        System.out.print("Enter the third letter: ");
        letters[2] = sc.next().charAt(0);

        // Validation
        for (int i = 0; i < 3; i++) {
            if (!Character.isLetter(letters[i])) {
                System.out.println("Input was not a letter.");
                return;
            }
        }

        // Output
        if (letters[0] > letters[1]) {
            if (letters[0] > letters[2]) {
                temp = letters[0];
                letters[0] = letters[2];
                letters[2] = temp;
            }
        }

    }
}
