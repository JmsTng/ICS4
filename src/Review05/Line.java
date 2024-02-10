/*
 * TITLE: Review 05 - Line
 * NAME: James Tung
 * DATE: 2024-02-10
 * DESCRIPTION: This program contains methods to calculate the length and slope of a line.
 */

package Review05;

public class Line {
    public static void main(String[] args) {

    }

    public static double length(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static double slope(int x1, int y1, int x2, int y2) {
        return (double) (y2 - y1) / (x2 - x1);
    }
}
