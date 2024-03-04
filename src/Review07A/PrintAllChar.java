/*
 * TITLE: Review 08 - PrintAllChar
 * NAME: James Tung
 * DATE: 2024-02-15
 * DESCRIPTION: Print all characters from a file on separate lines.
 */

package Review07A;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class PrintAllChar {
    public static void main(String[] args) {
        // Variables
        BufferedReader br;
        String path = "src/Review07A/in/allChar.txt";
        int c;

        // Reading
        try {
            br = new BufferedReader(new FileReader(path));
            while ((c = br.read()) != -1) {
                if (c != '\n' && c != '\r' && c != '\t' && c != ' ') System.out.println((char) c);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error.");
        } catch (IOException e) {
            System.out.println("Error reading file.");
        }
    }
}
