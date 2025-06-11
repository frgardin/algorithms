package com.algorithms.leetcode.old;

public class leetcode1920 {

    public int[] buildArray(int[] nums) {
        int[] aux = new int[nums.length];

        for (int i = 0; i < nums.length;i++) {
            aux[i] = nums[nums[i]];
        }

        return aux;
    }
}
