package com.company.week_3_1;

import java.util.Random;
import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        int[] a = new int[]{1, 5, 2, 7, 2, 7, 4};

        int max = a[0];
        for (int e : a){
            max = e > max ? e : max;
        }
        System.out.println("Max value is "+max);
    }
}
