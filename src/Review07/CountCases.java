/*
 * TITLE: Review 07 - Count Cases
 * NAME: James Tung
 * DATE: 2024-02-15
 * DESCRIPTION:
 */

package Review07;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CountCases {
    public static void main(String[] args) {
        // Variables
        BufferedReader br;
        String path = "src/Review07/in/passage.txt";
        int upper = 0, lower = 0;
        int c;

        // Counting
        try {
            br = new BufferedReader(new FileReader(path));
            c = br.read();

            while (c != -1) {
                if (c >= 'A' && c <= 'Z') upper++;
                if (c >= 'a' && c <= 'z') lower++;
                c = br.read();
            }

            br.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        } catch (IOException e) {
            System.out.println("Error reading file.");
        }

        // Output
        System.out.println("Uppercase: " + upper);
        System.out.println("Lowercase: " + lower);
    }
}
