package leetcode.old;

import java.util.*;

public class leetcode1 {


    public static int[] twoSum1(int[] nums, int target) {
        int l = 0;
        while (l < nums.length - 1) {
            int r = l + 1;
            while (r < nums.length) {
                if (nums[l] + nums[r] == target) {
                    return new int[]{l, r};
                }
                r++;
            }
            l++;
        }
        return new int[0];
    }

    public static int[] twoSum2(int[] nums, int target) {
        Map<Integer, Integer> m = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (m.containsKey(nums[i])) {
                return new int[]{m.get(nums[i]), i};
            }
            m.put(target - nums[i], i);
        }
        return new int[0];
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum2(new int[]{2, 7, 11, 15}, 9)));
    }
}
