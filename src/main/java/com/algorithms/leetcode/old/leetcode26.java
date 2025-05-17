package com.algorithms.leetcode.old;

import java.util.Arrays;

public class leetcode26 {

    public static int removeDuplicates(int[] nums) {
        int last = nums[0];
        int c = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != last) {
                last = nums[i];
                nums[c] = last;
                c++;
            }
        }
        return c;
    }

    public static int removeDuplicates2(int[] nums) {
        int j = 1;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] != nums[i - 1]){
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 2};


        System.out.println(removeDuplicates(nums));
        System.out.println(Arrays.toString(nums));
    }
}
