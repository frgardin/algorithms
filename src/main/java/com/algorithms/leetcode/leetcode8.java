package com.algorithms.leetcode;

import java.util.Set;

public class leetcode8 {
    private static final Set<Character> NUMBERS = Set.of(
            '0',
            '1',
            '2',
            '3',
            '4',
            '5',
            '6',
            '7',
            '8',
            '9');

    public int myAtoi(String s) {
        int ans = 0;
        int i = 0;

        Character firstChar = null;
        boolean isNegative = false;

        while (i < s.length()) {
            if (firstChar == null) {
                if (NUMBERS.contains(s.charAt(i))) {
                    firstChar = s.charAt(i);
                    ans += s.charAt(i) - '0';
                } else if (s.charAt(i) == '-') {
                    firstChar = s.charAt(i);
                    isNegative = true;
                } else if (s.charAt(i) == '+') {
                    firstChar = s.charAt(i);
                } else if (s.charAt(i) == ' ') {

                } else {
                    return 0;
                }

            } else {
                if (!NUMBERS.contains(s.charAt(i))) {
                    return isNegative ? (-1) * ans : ans;
                }
                int sum = s.charAt(i) - '0';
                int possibleValue = ans * 10 + sum;

                if (possibleValue / 10 != ans) {
                    return isNegative ? Integer.MIN_VALUE : Integer.MAX_VALUE;
                }
                ans = possibleValue;
            }
            i++;
        }
        return isNegative ? (-1) * ans : ans;
    }
}
