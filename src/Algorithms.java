/*
 * TITLE: Algorithms
 * NAME: James Tung
 * DATE: 02/27/2024
 * DESCRIPTION: A collection of common searching/sorting algorithms.
 */

import java.util.Arrays;

public class Algorithms {
    public static void main(String[] args) {
        System.out.println(bin(new String[]{"a", "b", "c", "d", "e", "f", "g", "h"}, "a"));
        System.out.println(bin(new String[]{"a", "b", "c", "d", "e", "f", "g", "h"}, "e"));
        System.out.println(bin(new String[]{"a", "b", "c", "d", "e", "f", "g", "h"}, "f"));

        String[] arr = new String[]{"g", "f", "h", "e", "", "a", "bc", "b"};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
        arr = new String[]{"g", "f", "h", "e", "", "a", "bc", "b"};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
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
            if      (item.compareTo(list[middle]) < 0) end = middle;
            else if (item.compareTo(list[middle]) > 0) start = middle + 1;
            else                                       return middle;
        }
        return -1;
    }

    public static void insertion(String[] list) {
        String temp;

        for (int i = 1; i < list.length; i++) {
            int j = i - 1;
            temp = list[i];

            while (j >= 0 && temp.compareTo(list[j]) < 0) {
                list[j + 1] = list[j];
                j--;
            }

            list[j + 1] = temp;
        }
    }

    public static void bubble(String[] list) {
        String temp;

        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if (list[j].compareTo(list[i]) > 0) {
                    temp = list[j];
                    list[j] = list[i];
                    list[i] = temp;
                }
            }
        }
    }
}
