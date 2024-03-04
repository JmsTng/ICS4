/*
 * TITLE: Algorithms
 * NAME: James Tung
 * DATE: 02/27/2024
 * DESCRIPTION: A collection of common searching/sorting algorithms.
 */

import java.util.Arrays;

public class Algorithms {
    public static void main(String[] args) {
        int[] arr = new int[]{5, 1, 67, 2, 3, 7, 2};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(bin(arr, 2));
    }

    public static int seq(String[] list, String item) {
        for (int i = 0; i < list.length; i++) {
            if (item.equals(list[i])) return i;
        }
        return -1;
    }

    public static int seq(int[] list, int item) {
        for (int i = 0; i < list.length; i++) {
            if (item == list[i]) return i;
        }
        return -1;
    }

    public static int seq(double[] list, double item) {
        for (int i = 0; i < list.length; i++) {
            if (item == list[i]) return i;
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

    public static int bin(int[] list, int item) {
        int start = 0;
        int end = list.length;

        while (start < end) {
            if (item < list[(start + end) / 2])      end = (start + end) / 2;
            else if (item > list[(start + end) / 2]) start = (start + end) / 2 + 1;
            else                                     return (start + end) / 2;
        }
        return -1;
    }

    public static int bin(double[] list, double item) {
        int start = 0;
        int end = list.length;

        while (start < end) {
            if (item < list[(start + end) / 2])      end = (start + end) / 2;
            else if (item > list[(start + end) / 2]) start = (start + end) / 2 + 1;
            else                                     return (start + end) / 2;
        }
        return -1;
    }

    public static void selection(String[] list) {
        String temp;
        int lowest;

        for (int i = 0; i < list.length; i++) {
            lowest = i;

            for (int j = i; j < list.length; j++) {
                if (list[lowest].compareTo(list[j]) > 0) lowest = j;
            }

            temp = list[i];
            list[i] = list[lowest];
            list[lowest] = temp;
        }
    }

    public static void selection(int[] list) {
        int temp;
        int lowest;

        for (int i = 0; i < list.length; i++) {
            lowest = i;

            for (int j = i; j < list.length; j++) {
                if (list[j] < list[lowest]) lowest = j;
            }

            temp = list[i];
            list[i] = list[lowest];
            list[lowest] = temp;
        }
    }

    public static void selection(double[] list) {
        double temp;
        int lowest;

        for (int i = 0; i < list.length; i++) {
            lowest = i;

            for (int j = i; j < list.length; j++) {
                if (list[j] < list[lowest]) lowest = j;
            }

            temp = list[i];
            list[i] = list[lowest];
            list[lowest] = temp;
        }
    }

    public static void insertion(String[] list) {
        String temp;
        int j;

        for (int i = 1; i < list.length; i++) {
            j = i - 1;
            temp = list[i];

            while (j >= 0 && temp.compareTo(list[j]) < 0) {
                list[j + 1] = list[j];
                j--;
            }

            list[j + 1] = temp;
        }
    }

    public static void insertion(int[] list) {
        int temp;
        int j;

        for (int i = 1; i < list.length; i++) {
            j = i - 1;
            temp = list[i];

            while (j >= 0 && temp < list[j]) {
                System.out.println(Arrays.toString(list));
                list[j + 1] = list[j];
                j--;
            }

            list[j + 1] = temp;
        }
    }

    public static void insertion(double[] list) {
        double temp;
        int j;

        for (int i = 1; i < list.length; i++) {
            j = i - 1;
            temp = list[i];

            while (j >= 0 && temp < list[j]) {
                System.out.println(Arrays.toString(list));
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

    public static void bubble(int[] list) {
        int temp;

        for (int i = 0; i < list.length; i++) {

        }
    }
}
