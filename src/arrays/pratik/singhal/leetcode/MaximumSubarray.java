package arrays.pratik.singhal.leetcode;


/*
Given an integer array nums, find the
subarray
with the largest sum, and return its sum.



Example 1:

Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: The subarray [4,-1,2,1] has the largest sum 6.

Example 2:

Input: nums = [1]
Output: 1
Explanation: The subarray [1] has the largest sum 1.

Example 3:

Input: nums = [5,4,-1,7,8]
Output: 23
Explanation: The subarray [5,4,-1,7,8] has the largest sum 23.



Constraints:

    1 <= nums.length <= 105
    -104 <= nums[i] <= 104



Follow up: If you have figured out the O(n) solution, try coding another solution using the divide and conquer approach, which is more subtle.
 */

import java.util.Arrays;

public class MaximumSubarray {

    public static int maxSubArray(int[] nums) {
        int max = nums[0];
        int size = nums.length;
        for (int i = 0; i < size; i++) {
            for (int j = i; j < size; j++) {
                int possibleMax = calcSumOfSubArray(nums, i, j);
                if (possibleMax > max) {
                    max = possibleMax;
                }
            }
        }
        return max;
    }

    public static int calcSumOfSubArray(int[] nums, int index1, int index2) {
        int sum = 0;
        for (int i = index1; i <= index2; i++) {
            sum += nums[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] n1 = {-2,1,-3,4,-1,2,1,-5,4};
        int[] n2 = {1};
        int[] n3 = {5,4,-1,7,8};

        System.out.println(maxSubArray(n1));
        System.out.println(maxSubArray(n2));
        System.out.println(maxSubArray(n3));
    }
}
