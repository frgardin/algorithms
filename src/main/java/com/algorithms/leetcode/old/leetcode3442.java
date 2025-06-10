package com.algorithms.leetcode.old;

import java.util.*;

public class leetcode3442 {

    public static int maxDifference(String s) {
        if (s.isEmpty()) {
            return 0;
        }

        char[] charArray = s.toCharArray();

        Arrays.sort(charArray);

        char current = charArray[0];

        TreeSet<Integer> tsOdd = new TreeSet<>();
        TreeSet<Integer> tsEven = new TreeSet<>();

        int acc=0;
        int i = 0;
        while(i < charArray.length) {
            if (charArray[i] == current) {
                acc++;
            } else {
                tsOdd.add(acc);
                tsEven.add(acc);
                acc = 1;
                current = charArray[i];
            }
            i++;
        }
        tsOdd.add(acc);
        tsEven.add(acc);
        int odd = 0;

        while (odd % 2 != 1) {
            odd = tsOdd.pollLast();
        }

        int even = 1;

        while (even % 2 != 0) {
            even = tsEven.pollFirst();
        }

        return Math.abs(odd - even);
    }

    public static void main(String[] args) {
        String s = "tzt";

        System.out.println(maxDifference(s));
    }
}
