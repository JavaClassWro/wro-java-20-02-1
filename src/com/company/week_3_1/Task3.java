package com.company.week_3_1;

import java.util.Random;
import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        int[] a = new int[]{1, 5, 2, 7, 2, 7, 4};

        int max = a[0];
        int second_to_max = a[0];
        for (int e : a){
            if (max < e) {
                second_to_max = max;
                max = e;
            }
        }
        System.out.println("Second to max value is "+second_to_max);
    }
}
