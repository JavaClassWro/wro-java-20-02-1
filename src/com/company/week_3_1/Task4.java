package com.company.week_3_1;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        int[] a = new int[]{2, 3, 3, 3, 6, 9, 9};
        int nonDuplicatePointer = 1;
        int pointer = 1;

        // wee keep two pointers:
        // 1. to keep a position of the array without duplicates
        // 2. to keep a position of the initial array
        // we know that the array is sorted, thus all duplicates are always together
        for (pointer = 1; pointer < a.length - 1; pointer++) {
            // for a given element a[pointer] we compare with the element in 'non-duplicate' array
            // if we do not have this element yet, then store in to the 'non-duplicate'
            if (a[nonDuplicatePointer-1] != a[pointer]) {
                a[nonDuplicatePointer] = a[pointer];
                nonDuplicatePointer++;
            }
        }
        System.out.println("New array length: "+nonDuplicatePointer);
        System.out.println("New array: "+ Arrays.toString(Arrays.copyOf(a, nonDuplicatePointer)));
    }
}
