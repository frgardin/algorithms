package com.algorithms.leetcode;

//https://leetcode.com/problems/longest-subarray-of-1s-after-deleting-one-element/
public class leetcode1493 {

    public int longestSubarray(int[] nums) {
        int left = 0;
        int right = 0;
        boolean isLeft = true;
        int max = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            if (nums[i] == 0 && isLeft) {
                isLeft = false;
            } else if (nums[i] == 0 && !isLeft) {
                max = Math.max(left + right, max);
                left = right;
                right = 0;
            } else if (isLeft) {
                left++;
            } else {
                right++;
            }
        }
        if (!isLeft) {
            max = Math.max(left + right, max);
        } else {
            max = left - 1;
        }

        return max;
    }

    public static void main(String[] args) {
        leetcode1493 leetcode1493 = new leetcode1493();
        System.out.println(leetcode1493.longestSubarray(new int[] { 1, 1, 0, 1 }));
    }

}
