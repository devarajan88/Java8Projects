package com.dev.java8;

public class Solution {

    public static int solution(int[] A) {
        // write your code in Java SE 8
        int j = 0, i;
        for (i = 0; i < A.length; i++) {
            if (A[i] <= 0) {
                int temp;
                temp = A[i];
                A[i] = A[j];
                A[j] = temp;
                // increment count of non-positive
                // integers
                j++;
            }
        }

        return j;
    }

    public static int findMissingPositive(int arr[], int size) {
        int i;

        // Mark arr[i] as visited by making
        // arr[arr[i] - 1] negative. Note that
        // 1 is subtracted because index start
        // from 0 and positive numbers start from 1
        for (i = 0; i < size; i++) {
            int x = Math.abs(arr[i]);
            if (x - 1 < size && arr[x - 1] > 0)
                arr[x - 1] = -arr[x - 1];
        }

        // Return the first index value at which
        // is positive
        for (i = 0; i < size; i++)
            if (arr[i] > 0)
                return i + 1; // 1 is added becuase indexes
        // start from 0

        return size + 1;
    }

    static int findMissing(int arr[], int size) {
        // First separate positive and
        // negative numbers
        int shift = solution(arr);
        int arr2[] = new int[size - shift];
        int j = 0;
        for (int i = shift; i < size; i++) {
            arr2[j] = arr[i];
            j++;
        }
        // Shift the array and call
        // findMissingPositive for
        // positive part
        return findMissingPositive(arr2, j);
    }

    public static void main(String[] args) {
        int arr[] = {1, 3, 6, 4, 1, 2};
        int arr_size = arr.length;
        int missing = findMissing(arr, arr_size);
        System.out.println("The smallest positive missing number is " + missing);
    }

}
