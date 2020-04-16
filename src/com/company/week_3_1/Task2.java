package com.company.week_3_1;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        double eurToPln = 4.53;
        double meterToCentimeter = 100;

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. EUR to PLN");
            System.out.println("2. Meters to Centimeters");
            System.out.println("3. exit");
            System.out.print("Please choose a convert option:");
            int option = scanner.nextInt();
            double value;
            switch (option) {
                case 1:
                    System.out.print("How many EUR: ");
                    value = scanner.nextDouble();
                    System.out.println(value + "EUR is equivalent to " + value * eurToPln + "PLN");
                    return;
                case 2:
                    System.out.print("How many meters: ");
                    value = scanner.nextDouble();
                    System.out.println(value + "m is equivalent to " + value * meterToCentimeter + "cm");
                    return;
                case 3:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.print("No such option, please try again.");
            }
        }
    }

}
