/*
 * TITLE: Hanoi
 * NAME: James Tung
 * DATE: 03/18/2024
 * DESCRIPTION: Simple program to solve the Towers of Hanoi
 */

public class Hanoi {
    public static void main(String[] args) {
        hanoi(7);
    }

    public static void hanoi(int height) {
        hanoi_player(height, 1, 3);
    }

    public static void hanoi_player(int height, int from, int to) {
        int spare = 1;
        while (spare == from || spare == to) spare++;

        if (height <= 0) System.out.println("Exit.");
        else if (height == 1) {
            System.out.println("Move " + from + ", " + to);
        }
        else {
            hanoi_player(height - 1, from, spare);
            System.out.println("Move " + from + ", " + to);
            hanoi_player(height - 1, spare, to);
        }
    }
}
