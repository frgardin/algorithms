package com.algorithms.leetcode;

public class leetcode66 {

    public int[] plusOne(int[] d) {
        int c = d.length - 1;
        while (c >= 0 && d[c] == 9) {
            d[c] = 0;
            c--;
        }
        if (c < 0) {
            int[] ans = new int[d.length + 1];
            ans[0] = 1;
            return ans;
        }
        d[c]++;
        return d;
    }

}
