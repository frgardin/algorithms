package com.algorithms.leetcode;

public class leetcode1929 {

    public int[] getConcatenation(int[] nums) {
        int[] ii = new int[2*nums.length];

        for (int i = 0; i<nums.length;i++) {
            ii[i] = nums[i];
            ii[i+nums.length] = nums[i];
        }

        return ii;
    }
}
