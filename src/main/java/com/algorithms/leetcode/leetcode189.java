package com.algorithms.leetcode;

import java.util.Arrays;

public class leetcode189 {

    public static void rotate(int[] nums, int k) {
        if (k == 0) {
            return;
        }
        int[] temp = new int[k];
        for (int i = 0; i < k; i++) {
            temp[i] = nums[Math.abs((nums.length - k + i)) % nums.length];
        }
        for (int i = 0; i < Math.ceil((double) nums.length / k); i++) {
            for (int j = 0; j < k; j++) {
                int index = (i * k + j) % nums.length;
                int next = nums[index];
                nums[index] = temp[j];
                temp[j] = next;
            }
        }
    }

    public void rotate2(int[] nums, int k) {
        int n = nums.length;
        k %= n;
        reverse(nums, 0, n - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);
    }

    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 2;

        rotate(nums, k);

        System.out.println(Arrays.toString(nums));

    }
}
