package com.dev.java8;

import java.util.HashSet;

public class ArrayElements {

    public static void main(String args[]) {
        ArrayElements result = new ArrayElements();
        int arr[] = {1, 2, 3, 5, 6, 7, 8, 9};
        int n = arr.length;
        System.out.println("Length of the Longest consecutive subsequence is " + result.solution(arr));
    }

    public int solution(int[] A) {
        HashSet<Integer> S = new HashSet<Integer>();
        int ans = 0;

        for (int i = 0; i < A.length; ++i)
            S.add(A[i]);

        for (int i = 0; i < A.length; ++i) {
            if (!S.contains(A[i] - 1)) {
                int j = A[i];
                while (S.contains(j))
                    j++;
                if (ans < j - A[i])
                    ans = j - A[i];
            }
        }
        return ans;
    }

}
