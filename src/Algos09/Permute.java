/*
 * TITLE: Algorithms09 - Permute
 * NAME: James Tung
 * DATE: 03/26/2024
 * DESCRIPTION: Generate all permutations of string s by rearranging characters.
 */

package Algos09;

public class Permute {
    public static void main(String[] args) {
        permute("Hello", "");
    }

    public static void permute(String in, String out) {
        in.
        if (in.isEmpty()) {
            System.out.println(out);
        } else {
            for (int i = 0; i < in.length(); i++) {
                permute(in.substring(0, i) + in.substring(i + 1), out + in.charAt(i));
            }
        }
    }
}
