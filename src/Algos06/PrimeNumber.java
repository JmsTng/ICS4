/*
 * TITLE: Algorithms06 - Prime Number
 * NAME: James Tung
 * DATE: 03/18/2024
 * DESCRIPTION: Recursively check primality of numbers.
 */

package Algos06;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println(prime(10271));
    }

    public static boolean prime(int n) {
        return checkPrime(n, n - 1);
    }

    public static boolean checkPrime(int n, int d) {
        if (d == 1) {
            return true;
        } else if (n % d == 0) {
            return false;
        } else {
            return checkPrime(n, d - 1);
        }
    }
}
