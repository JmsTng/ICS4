/*
 * TITLE: Review 04 - Encrypt
 * NAME: James Tung
 * DATE: 2024-02-07
 * DESCRIPTION: Encrypts a string by shifting each character by 2, except for the first and last characters, which are swapped.
 */

package Review04;

import java.util.Scanner;

public class Encrypt {
    public static void main(String[] args) {
        // Variables
        Scanner sc = new Scanner(System.in);
        String[] inputs;
        String output = "";
        char current;

        // Input
        System.out.print("Enter a string: ");
        inputs = sc.nextLine().split(" ");

        // Logic
        for (String input : inputs) {
            output += input.charAt(input.length() - 1);  // Add the last character to the output
            for (int i = 1; i < input.length() - 1; i++) {  // Loop through all characters except the last
                current = input.charAt(i);
                output += current == ' ' ? current : (char) (current + 2);  // Add the current character + 2 to the output; don't shift spaces
            }
            output += input.charAt(0);  // Add the first character to the output
            output += " ";  // Add a space for the next word
        }
        output = output.substring(0, output.length() - 1);  // Remove the last space

        // Output
        System.out.println(output);
    }
}
