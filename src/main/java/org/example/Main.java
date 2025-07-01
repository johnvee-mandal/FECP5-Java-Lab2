package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter membership status (Regular, VIP, Premium): ");
        String status = scanner.nextLine();
        System.out.print("Enter age: ");
        int age = scanner.nextInt();
        double price = 0.0;

        if (status.equalsIgnoreCase("Regular")) {
            if (age < 18) {
                price = 50.0;
            } else if (age <= 64) {
                price = 100.0;
            } else {
                price = 75.0;
            }
        } else if (status.equalsIgnoreCase("VIP")) {
            if (age < 18) {
                price = 75.0;
            } else if (age <= 64) {
                price = 150.0;
            } else {
                price = 112.5;
            }
        } else if (status.equalsIgnoreCase("Premium")) {
            if (age < 18) {
                price = 100.0;
            } else if (age <= 64) {
                price = 200.0;
            } else {
                price = 150.0;
            }
        } else {
            System.out.println("Invalid membership status entered.");
            scanner.close(); 
            return;          
        }
        System.out.printf("Price: $%.2f%n", price);
        scanner.close();
    }
}