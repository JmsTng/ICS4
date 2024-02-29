/*
 * TITLE: Algorithms
 * NAME: James Tung
 * DATE: 02/27/2024
 * DESCRIPTION: A collection of common searching/sorting algorithms.
 */

public class Algorithms {
    public static void main(String[] args) {
        System.out.println(bin(new String[]{"a", "b", "c", "d", "e", "f", "g", "h"}, "b"));
        System.out.println(bin(new String[]{"a", "b", "c", "d", "e", "f", "g", "h"}, "e"));
        System.out.println(bin(new String[]{"a", "b", "c", "d", "e", "f", "g", "h"}, "f"));
    }
    public static int seq(String[] list, String item) {
        for (int i = 0; i < list.length; i++) {
            if (item.equals(list[i])) return i;
        }
        return -1;
    }

    public static int bin(String[] list, String item) {
        int start = 0;
        int end = list.length - 1;
        int middle;

        while (start < end) {
            middle = (start + end) / 2;
            System.out.printf("%s %s %d %d %d %d%n", list[middle], item, list[middle].compareTo(item), start, middle, end);
            if      (list[middle].compareTo(item) < 0) end = middle;
            else if (list[middle].compareTo(item) > 0) start = middle + 1;
            else                                       return middle;
        }
        return -1;
    }
}
