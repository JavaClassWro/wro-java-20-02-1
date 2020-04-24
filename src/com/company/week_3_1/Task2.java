package com.company.week_3_1;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        double eurToPln = 4.53;
        double meterToCentimeter = 100;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Your temperature is ");
        double temperature = scanner.nextDouble();
        System.out.println("Do you have a cough?");
        System.out.println("1. Yes");
        System.out.println("2. No");
        boolean cough = scanner.nextInt() == 1;
        System.out.println("Do you have a chest pain?");
        System.out.println("1. Yes");
        System.out.println("2. No");
        boolean pain = scanner.nextInt() == 1;

        if (temperature < 36.6) {
            System.out.println("Your temperature is to low, call the ambulance.");
        } else if (temperature > 36.6 && temperature <= 37.5) {
            if (cough && pain) {
                System.out.println("You might have a virus infection, a medical doctor consultation is advised.");
            } else {
                System.out.println("Nothing serious so far, but keep the observation.");
            }
        } else if (temperature > 37.5 && temperature <= 41) {
            if (cough || pain) {
                System.out.println("Dangerous situation, contact your doctor.");
            } else {
                System.out.println("Situation is not critical, but medical consultation is advised.");
            }
        } else if (temperature > 41) {
            System.out.println("Your temperature is to high, call the ambulance.");
        } else {
            System.out.println("You are fine, stay at home.");
        }
    }

}
