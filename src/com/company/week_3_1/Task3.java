package com.company.week_3_1;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        int memory_number = 987;
        Scanner scanner = new Scanner(System.in);

        int guessed_number = scanner.nextInt();

        if (memory_number == guessed_number) System.out.println("Congratulations, you are right!");
        else System.out.println("Sorry, you are wrong.");
    }
}
