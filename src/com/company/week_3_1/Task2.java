package com.company.week_3_1;

import java.util.Scanner;
import java.util.SortedMap;

public class Task2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to a calculator. Supported operations:");
        Double left = null;
        Double result = null;
        while (true) {
            int operation = 0;
            while (operation < 1 || operation > 5) {
                System.out.println("1. plus");
                System.out.println("2. minus");
                System.out.println("3. multiply");
                System.out.println("4. divide");
                System.out.println("5. quit");
                System.out.print("Choose an operation:");
                operation = scanner.nextInt();
                if (operation < 1 || operation > 5) {
                    System.out.println("No such option, try again.");
                }
                if (operation == 5) {
                    System.out.println("Exiting...");
                    return;
                }
            }

            if (left == null) {
                System.out.print("Left-side value:");
                left = scanner.nextDouble();
            } else {
                left = result;
            }

            System.out.print("Right-side value:");

            double right = scanner.nextDouble();

            switch (operation) {
                case 1:
                    result = left + right;
                    break;
                case 2:
                    result = left - right;
                    break;
                case 3:
                    result = left * right;
                    break;
                case 4:
                    result = left / right;
                    break;
                default:
            }

            System.out.println("You answer is " + result);
        }
    }

}
