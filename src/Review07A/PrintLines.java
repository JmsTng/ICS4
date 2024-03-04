/*
 * TITLE: Review 08 - Print Lines
 * NAME: James Tung
 * DATE: 2024-02-15
 * DESCRIPTION: Print lines from a file.
 */

package Review07A;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class PrintLines {
    public static void main(String[] args) {
        // Variables
        BufferedReader br;
        String path = "src/Review07A/in/line.txt";
        String line;

        // Reading
        try {
            br = new BufferedReader(new FileReader(path));
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        } catch (IOException e) {
            System.out.println("Error reading file.");
        }
    }
}
