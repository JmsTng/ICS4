/*
 * TITLE: Review 01 - Fastfood
 * NAME: James Tung
 * DATE: 2024-02-05
 * DESCRIPTION:
 */

import java.util.Scanner;

public class Fastfood {
    public static void main(String[] args) {
        // Variables
        Scanner sc = new Scanner(System.in);
        int burgers, fries, sodas;
        double subtotal, total, payment, change;

        // Constants
        final double PST = 8;
        final double GST = 5;
        final double BURGER_PRICE = 1.69;
        final double FRIES_PRICE = 1.09;
        final double SODA_PRICE = 0.99;

        // Input
        System.out.print("Enter the number of burgers: ");
        burgers = sc.nextInt();
        System.out.print("Enter the number of fries: ");
        fries = sc.nextInt();
        System.out.print("Enter the number of sodas: ");
        sodas = sc.nextInt();

        // Calculations
        subtotal = (burgers * BURGER_PRICE + fries * FRIES_PRICE + sodas * SODA_PRICE);
        total = subtotal * ((PST + GST) / 100 + 1);

        // Output
        System.out.printf("The subtotal is $%.2f.%n", subtotal);
        System.out.printf("The tax (PST %.0f%% + GST %.0f%%) is $%.2f.%n", PST, GST, subtotal * (PST + GST) / 100);
        System.out.printf("The total is $%.2f.%n", total);

        // Payment (part b)
        System.out.print("Enter the amount tendered: ");
        payment = sc.nextDouble();
        change = payment - total;
        System.out.printf("Your change is $%.2f.%n", change);
    }
}
