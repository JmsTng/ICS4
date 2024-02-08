/*
 * TITLE: Review 03 - Marks
 * NAME: James Tung
 * DATE: 02/07/2024
 * DESCRIPTION: Calculate the average of each student's marks, and compare them to the class average.
 */

package Review03;

import java.util.Scanner;

public class Marks {
    public static void main(String[] args) {
        // Variables
        Scanner sc = new Scanner(System.in);
        int[][] marks;
        int students, tests;
        int highest = 0;
        double highestAvg = -1;
        double[] averages;
        double avg = 0;

        // Input
        System.out.print("Enter the number of students: ");
        students = sc.nextInt();
        System.out.print("Enter the number of tests: ");
        tests = sc.nextInt();
        marks = new int[students][tests];
        averages = new double[students];

        for (int i = 0; i < students; i++) {
            for (int j = 0; j < tests; j++) {
                System.out.printf("Enter the mark for student %d, test %d: ", i + 1, j + 1);
                marks[i][j] = sc.nextInt();
                avg += marks[i][j];  // Sum up marks
            }

            // Calculate average
            avg /= tests;
            System.out.printf("The average mark for student %d is %.2f%n", i + 1, avg);
            averages[i] = avg;

            // Check for highest average
            if (avg > highestAvg) {
                highest = i + 1;
                highestAvg = avg;
            }
            avg = 0;
        }

        // Output
        System.out.printf("The student with the highest average is student %d with an average of %.2f%n", highest, highestAvg);
        for (int i = 0; i < students; i++) {
            avg += averages[i];
        }

        avg /= students;

        for (int i = 0; i < students; i++) {
            if (averages[i] > avg) {
                System.out.printf("Student %d is above the class average", i + 1);
            }
        }
    }
}
