/*
 * TITLE: Algorithms
 * NAME: James Tung
 * DATE: 02/27/2024
 * DESCRIPTION: A collection of common searching/sorting algorithms.
 */

public class Algorithms {
    /**
     * Sequential/Linear Search
     * Traverse the list and return when the target value is found.
     * Ideal for unsorted lists.
     *
     * @param arr   array to search through
     * @param item  item to find in array
     *
     * @return      index of the item in the array; -1 if not found
     */
    public static int seq(String[] arr, String item) {
        for (int i = 0; i < arr.length; i++) {
            if (item.equals(arr[i])) return i;
        }
        return -1;
    }

    public static int seq(int[] arr, int item) {
        for (int i = 0; i < arr.length; i++) {
            if (item == arr[i]) return i;
        }
        return -1;
    }

    public static int seq(double[] arr, double item) {
        for (int i = 0; i < arr.length; i++) {
            if (item == arr[i]) return i;
        }
        return -1;
    }

    /**
     * Binary Search
     * Repeatedly halves the searching area to close in on the target value.
     * Only works with sorted datasets.
     *
     * @param arr   array to search through
     * @param item  item to find in the array
     *
     * @return      index of the item in the array; -1 if not found
     */
    public static int bin(String[] arr, String item) {
        int start = 0;
        int end = arr.length;
        int middle;

        while (start < end) {
            middle = (start + end) / 2;
            if      (item.compareTo(arr[middle]) < 0) end = middle;
            else if (item.compareTo(arr[middle]) > 0) start = middle + 1;
            else                                       return middle;
        }
        return -1;
    }

    public static int bin(int[] arr, int item) {
        int start = 0;
        int end = arr.length;
        int middle;

        while (start < end) {
            middle = (start + end) / 2;
            if (item < arr[middle])      end = middle;
            else if (item > arr[middle]) start = middle + 1;
            else                         return middle;
        }
        return -1;
    }

    public static int bin(double[] arr, double item) {
        int start = 0;
        int end = arr.length;
        int middle;

        while (start < end) {
            middle = (start + end) / 2;
            if (item < arr[middle])      end = middle;
            else if (item > arr[middle]) start = middle + 1;
            else                         return middle;
        }
        return -1;
    }

    /**
     * Selection Sort
     * Find the max/min value and swap with the current index.
     *
     * @param arr   array to sort
     */
    public static void selection(String[] arr) {
        String temp;
        int lowest;

        for (int i = 0; i < arr.length; i++) {
            lowest = i;

            for (int j = i; j < arr.length; j++) {
                if (arr[lowest].compareTo(arr[j]) > 0) lowest = j;
            }

            temp = arr[i];
            arr[i] = arr[lowest];
            arr[lowest] = temp;
        }
    }

    public static void selection(int[] arr) {
        int temp;
        int lowest;

        for (int i = 0; i < arr.length; i++) {
            lowest = i;

            for (int j = i; j < arr.length; j++) {
                if (arr[j] < arr[lowest]) lowest = j;
            }

            temp = arr[i];
            arr[i] = arr[lowest];
            arr[lowest] = temp;
        }
    }

    public static void selection(double[] arr) {
        double temp;
        int lowest;

        for (int i = 0; i < arr.length; i++) {
            lowest = i;

            for (int j = i; j < arr.length; j++) {
                if (arr[j] < arr[lowest]) lowest = j;
            }

            temp = arr[i];
            arr[i] = arr[lowest];
            arr[lowest] = temp;
        }
    }

    /**
     * Insertion Sort
     * Shift elements to correctly position the next index.
     *
     * @param arr   array to sort
     */
    public static void insertion(String[] arr) {
        String temp;
        int j;

        for (int i = 1; i < arr.length; i++) {
            j = i - 1;
            temp = arr[i];

            while (j >= 0 && temp.compareTo(arr[j]) < 0) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = temp;
        }
    }

    public static void insertion(int[] arr) {
        int temp;
        int j;

        for (int i = 1; i < arr.length; i++) {
            j = i - 1;
            temp = arr[i];

            while (j >= 0 && temp < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = temp;
        }
    }

    public static void insertion(double[] arr) {
        double temp;
        int j;

        for (int i = 1; i < arr.length; i++) {
            j = i - 1;
            temp = arr[i];

            while (j >= 0 && temp < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = temp;
        }
    }

    /**
     * Bubble Sort
     * Swap unordered adjacent elements.
     *
     * @param arr   array to sort
     */
    public static void bubble(String[] arr) {
        String temp;

        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[i] = temp;
                }
            }
        }
    }

    public static void bubble(int[] arr) {
        int temp;

        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void bubble(double[] arr) {
        double temp;

        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }


    public static void shaker(String[] arr) {
        String temp;
        boolean flip = true;

        for (int i = 1; i < arr.length / 2 && flip; i++) {
            flip = false;
            for (int j = i - 1; j < arr.length - i; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flip = true;
                }
            }

            for (int j = arr.length - i - 1; j > i - 1; j--) {
                if (arr[j].compareTo(arr[j - 1]) < 0) {
                    temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    flip = true;
                }
            }
        }
    }
}
