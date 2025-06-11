package com.algorithms.leetcode.old;

public class leetcode35 {

    public static int searchInsert(int[] nums, int target) {
        int i = nums.length / 2;
        while (i >= 0 && i < nums.length) {
            if (nums[i] < target) {
                if (i == nums.length - 1) {
                    return nums.length;
                }
                if (nums[i + 1] > target) {
                    return i + 1;
                }
                if ((nums.length -1 - i) % 2 != 0) {
                    i = i + i / 2+1;
                } else {
                    i = i + i / 2;
                }
            } else if (nums[i] > target) {
                if (i == 0) {
                    return 0;
                }
                if (nums[i-1] < target) {
                    return i;
                }
                i /= 2;
            } else {
                return i;
            }
        }
        return i;
    }

    public static void main(String[] args) {
        int[] ints = {1, 3, 5};
        int target = 5;

        System.out.println(searchInsert(ints, target));
    }
}
