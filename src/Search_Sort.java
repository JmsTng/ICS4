/*
 * TITLE: Searches
 * NAME: James Tung
 * DATE: 02/27/2024
 * DESCRIPTION: A collection of common searching/sorting algorithms.
 */

public class Search_Sort {
    public static int seq(String[] list, String item) {
        for (int i = 0; i < list.length; i++) {
            if (item == list[i]) return i;
        }
        return -1;
    }
}
