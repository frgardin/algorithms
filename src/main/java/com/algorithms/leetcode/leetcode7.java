package com.algorithms.leetcode;

public class leetcode7 {
    public int reverse(int x) {
        int ans = 0;

        while (Math.abs(x) > 0) {
            int nextValue = ans * 10 + x % 10;
            if (nextValue / 10 != ans)
                return 0;
            ans = nextValue;
            x /= 10;
        }
        return ans;
    }
}
