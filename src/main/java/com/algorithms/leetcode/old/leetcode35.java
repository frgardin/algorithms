package com.algorithms.leetcode.old;

public class leetcode35 {

    public static int searchInsert(int[] nums, int target) {
        int i = nums.length / 2;
        while (i > 0 && i < nums.length) {
            if (nums[i] < target) {
                i /= 2;
            } else if (nums[i] > target) {
                i = i + i / 2;
            } else {
                return i;
            }
        }
        if (nums[0] == target) {
            return 0;
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] ints = {1, 3, 5, 6};
        int target = 2;

        System.out.println(searchInsert(ints, target));
    }
}
