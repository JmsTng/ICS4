/*
 * TITLE: Review 04 - MakeUppercase
 * NAME: James Tung
 * DATE: 2024-02-07
 * DESCRIPTION: Converts a string to uppercase.
 */

import java.util.Scanner;

public class MakeUppercase {
    public static void main(String[] args) {
        // Variables
        Scanner sc = new Scanner(System.in);
        String input;

        // Input
        System.out.print("Enter a string: ");
        input = sc.nextLine();

        // Logic
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) >= 'a' && input.charAt(i) <= 'z') {  // If the character is lowercase
                System.out.print((char) (input.charAt(i) - 'a' + 'A'));  // Shift by the difference between 'a' and 'A'
            } else {  // If the character is not a lowercase English letter, print it as is
                System.out.print(input.charAt(i));
            }
        }
    }
}
