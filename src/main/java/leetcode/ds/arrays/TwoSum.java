package leetcode.ds.arrays;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

    static class Solution {
        public static int[] twoSum(int[] nums, int target) {
            HashMap<Integer, Integer> m = new HashMap<>();
            int n = nums.length;

            for (int i = 0; i < n; i++) {

                int diff = target - nums[i];

                if (m.containsKey(nums[i])) {
                    return new int[]{i, m.get(nums[i])};
                }

                m.put(diff, i);
            }

            return new int[0];
        }
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(Solution.twoSum(new int[]{2, 7, 11, 15}, 9)));
    }
}
