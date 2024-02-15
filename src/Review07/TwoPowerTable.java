/*
 * TITLE: Review 07 - Powers of Two Table
 * NAME: James Tung
 * DATE: 02/15/2024
 * DESCRIPTION:
 */

package Review07;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TwoPowerTable {
    public static void main(String[] args) {
        // Variables
        BufferedWriter writer;
        Scanner sc = new Scanner(System.in);
        String dir = "src/Review07/out/";
        String path = "src/Review07/out/twoPowerTable.html";
        String out;
        int max;

        // Input
        System.out.print("Enter the maximum power to raise 2 to: ");
        max = sc.nextInt();

        // Calculate & Output
        out = """
                <html>
                  <head>
                    <title>Powers of Two</title>
                    <style>
                      table {
                        border: 1px solid black;
                      }
                    
                      th, td {
                        border: 1px solid black;
                        padding: 5px;
                        text-align: center;
                      }
                    </style>
                  </head>
                  <body>
                    <table>
                      <tr><th>Exponent</th><th>Value</th></tr>
                      """;

        for (int i = 0; i <= max; i++) {
            out += "      <tr><td>%d</td><td>%.0f</td></tr>\n".formatted(i, Math.pow(2, i));
        }

        out += """
                    </table>
                  </body>
                </html>""";
        try {
            new File(dir).mkdirs();
            writer = new BufferedWriter(new FileWriter(path));
            writer.write(out);
            writer.close();
        } catch (IOException e) {
            System.out.println("Error writing to file.");
        }

        System.out.println("File written.");
    }
}
