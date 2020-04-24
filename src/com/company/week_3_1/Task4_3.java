package com.company.week_3_1;

import java.util.Arrays;

public class Task4_3 {
    public static void main(String[] args) {
        // Given an array of integers (values from 0 to 9),
        // find the length of the longest subarray in it
        // with no more than K distinct digits.
        int[] input = new int[]{1, 5, 1, 1, 2, 3};
        int k = 2;
        int maxLen = 0;

        // the main idea is to use a sliding window and count
        // the number of unique (distinct) digits we encounter

        // we know there are only 10 digits from 0 to 9
        // initialize an array, each element is a counter for
        // for a corresponding digit. For example, counter[2] is
        // a counter for a digit '2'. All the counters are
        // initialised to 0
        int[] counter = new int[10];

        // initialise a beginning and the end of our sliding window
        int begin = 0;
        // consider we just added the 1st element
        int end = 0;
        // start expanding our window
        while(end < input.length) {
            // first we take the last added element and increase a counter
            counter[input[end]]++;
            // next we check how many unique digits we encountered so far
            // remember that we need not more than k
            int distinct = 0;
            for (Integer element : counter) {
                if (element > 0) distinct++;
            }
            // if a number of distinct digits is more than required
            // then we shrink our window from the start and adjust the counter
            // remember we also can't make the window smaller than 1
            while (distinct > k && begin <= end) {
                counter[input[begin]]--;
                begin++;
            }
            // if a number of distinct digits is equal to k then we remember the length
            // which is a end-begin+1
            if (distinct == k) maxLen = end-begin+1 > maxLen ? end-begin+1 : maxLen;
            // if a number of distinct digits is less than or equal to the k then expand the window
            end++;
        }
        System.out.println("The length of the longest subarray of "+Arrays.toString(input)+" with no more than "+k+
                " distinct digits is "+maxLen);
    }
}
