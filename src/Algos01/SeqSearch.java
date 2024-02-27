/*
 * TITLE: Sequential (Linear) Search
 * NAME: James Tung
 * DATE: 02/27/2024
 * DESCRIPTION:
 */

package Algos01;

public class SeqSearch {
    public static void main(String[] args) {
        System.out.println(seqSearch("one2three", new String[]{"Hello", "World", "one2three", "1two3"}));
    }

    public static int seqSearch(String item, String[] list) {
        int res = -1;
        boolean found = false;

        for (int i = 0; i < list.length && !found; i++) {
            if (item.equals(list[i])) {
                res = i;
                found = true;
            }
        }

        return res;
    }
}
