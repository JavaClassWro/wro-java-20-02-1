package com.company.week_3_1;

import java.util.Random;
import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        int memory_number = new Random().nextInt(10);
        Scanner scanner = new Scanner(System.in);
        int guessed_number;
        do {
            System.out.print("Bet your number: ");
            guessed_number = scanner.nextInt();

            if (memory_number == guessed_number) System.out.println("Congratulations, you are right!");
            else System.out.println("Sorry, you are wrong.");
        } while(guessed_number != memory_number);
    }
}
