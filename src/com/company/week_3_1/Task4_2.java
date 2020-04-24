package com.company.week_3_1;

public class Task4_2 {
    public static void main(String[] args) {
        // Given an array of positive numbers and a positive number ‘k’,
        // find the maximum sum of any contiguous subarray of size ‘k’.
        int[] input = new int[]{2, 1, 5, 1, 3, 2};
        int k = 3;

        // the idea is to use a sliding window of size k. Every time we move the
        // window we also adjust the sum
        int maxSum = 0;
        int runningSum = 0;
        int begin = 0;
        int end = 0;
        while (end < input.length) {
            // increment the sum
            runningSum += input[end];
            // if the size of the window is more than k
            // then move begin and adjust the sum
            if (end-begin+1 > k) {
                runningSum -= input[begin];
                begin++;
            }
            // if window size is k then compare with the max sum
            maxSum = runningSum > maxSum && end-begin+1 == k ? runningSum : maxSum;
            end++;
        }
        System.out.println("The maximum sum of the subarray of size "+k+" is "+maxSum);
    }
}
