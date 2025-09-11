package com.algorithms.leetcode;

public class leetcode66 {

    public int[] plusOne(int[] d) {
        int n = d.length;

        if (d[n - 1] == 9) {
            int c = n - 1;
            int[] ans = new int[n + 1];
            boolean all9 = true;
            for (int i = 0; i < n; i++) {
                ans[i] = d[i];
                all9 = all9 && d[i] == 9;
            }
            if (all9) {
                while (c >= 0 && ans[c] == 9) {
                    ans[c] = 1;
                    ans[c + 1] = 0;
                    c--;
                }
                return ans;
            }
            while (d[c] == 9) {
                d[c] = 0;
                c--;
            }
            d[c]++;
            return d;
        }
        d[n - 1]++;
        return d;
    }
}
