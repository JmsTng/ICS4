/*
 * TITLE: Review 07 - Add Numbers
 * NAME: James Tung
 * DATE: 2024-02-15
 * DESCRIPTION: Add numbers from a file.
 */

package Review07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class AddNumbers {
    public static void main(String[] args) {
        // Variables
        Scanner sc;
        String path = "src/Review07/in/numbers.txt";
        double sum = 0;

        // Summing
        try {
            sc = new Scanner(new File(path));
            while (sc.hasNextDouble()) {
                sum += sc.nextDouble();
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (InputMismatchException e) {
            System.out.println("Error parsing number");
        } finally {
            System.out.println("Sum: " + sum);
        }
    }
}
