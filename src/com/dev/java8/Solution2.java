package com.dev.java8;

import java.util.Set;
import java.util.TreeSet;

public class Solution2 {

    public static void main(String[] args) {

        Solution2 solution2 = new Solution2();
        int[] array = {2, 3, 4, 1, 2, 1};
        System.out.println(solution2.solution(array));
    }

    public int solution(int[] array) {
        int length = 0;

        int tempMaxLen = 0;
        int prevEvenNum = 0, prevOddNum = 0;
        int oddNum, evenNum;

        Set<Integer> maxSize = new TreeSet<>();

        for (int i = 0; i < array.length; i++) {
            if ((i + 1) % 2 != 0) { // odd case
                oddNum = array[i];
                if (i == 0) {
                    prevOddNum = oddNum;
                    tempMaxLen++;
                    continue;
                }

                if (oddNum == prevOddNum) {
                    tempMaxLen++;
                } else {
                    maxSize.add(tempMaxLen);
                    tempMaxLen = 0;
                    prevOddNum = oddNum;
                }
            } else { // even case
                evenNum = array[i];
                if (i == 1) {
                    prevEvenNum = evenNum;
                    tempMaxLen++;
                    continue;
                }
                if (evenNum == prevEvenNum) {
                    tempMaxLen++;
                } else {
                    maxSize.add(tempMaxLen);
                    tempMaxLen = 0;
                    prevEvenNum = evenNum;
                }
            }
        }

        length = tempMaxLen;

        System.out.println(maxSize);

        return length;
    }

}
