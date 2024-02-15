/*
 * TITLE: Review 07 - StarTable
 * NAME: James Tung
 * DATE: 02/15/2024
 * DESCRIPTION: Write an N*M rectangle of asterisks to a file named "star.txt" where N and M are provided by the user.
 */

package Review07;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class StarTable {
    public static void main(String[] args) {
        // Variables
        BufferedWriter writer;
        Scanner sc = new Scanner(System.in);
        String dir = "src/Review07/out/";
        String path = "src/Review07/out/star.txt";
        char[][] table;
        int height, width;

        // Input
        System.out.print("Enter the height of the table: ");
        height = sc.nextInt();
        System.out.print("Enter the width of the table: ");
        width = sc.nextInt();

        // Processing
        table = new char[height][width];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                table[i][j] = '*';
            }
        }

        // Writing
        try {
            new File(dir).mkdirs();
            writer = new BufferedWriter(new FileWriter(path));
            for (int i = 0; i < height; i++) {
                for (int j = 0; j < width; j++) {
                    writer.write(table[i][j]);
                }
                writer.newLine();
            }

            writer.close();
        } catch (IOException e) {
            System.out.println("Error with file.");
        }
    }
}
