package com.company.week_3_1;

public class Task4 {
    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 3, 4, 6};
        int target = 6;

        // we use a bruteforce solution, as to this moment we do not know what is a binary search or a map.
        for (int i = 0; i < a.length - 1; i++) {
            // for a given element a[i] we find it's counterparty target - a[i]
            // this is the value we are going to look for
            for (int j = i+1; j < a.length; j++) {
                if (a[j] == target - a[i]) {
                    System.out.println("Found elements on positions "+i+" and "+j);
                    return;
                }
            }
        }
        System.out.println("Could not find such elements.");
    }
}
