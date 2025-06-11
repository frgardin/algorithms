package com.algorithms.leetcode.old;

public class leetcode35 {

    public static int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int ans = nums.length;
        while (start <= end) {
            int mid = start + (end-start)/2;
            if (nums[mid] >= target) {
                ans = mid;
                end = mid - 1;
            } else start = mid + 1;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] ints = {1, 3, 5, 6};
        int target = 7;

        System.out.println(searchInsert(ints, target));
    }
}
