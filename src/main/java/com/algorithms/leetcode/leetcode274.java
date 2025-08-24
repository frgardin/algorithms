package com.algorithms.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class leetcode274 {

    public static int hindex(int[] nums) {
        int n = nums.length;
        Map<Integer, Integer> m = new HashMap<>(n + 1);
        for (int i = 0; i <= n; i++) {
            m.put(i, 0);
        }
        int h = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= nums[i] && j <= n; j++) {
                m.put(j, m.get(j) + 1);
                if (m.get(j) == j && m.get(j) > h) {
                    h = j;
                }
            }
        }
        return h;
    }

    //PASS IN 24 TCs
    public static int hindex2(int[] nums) {
        if (nums.length == 0) return 0;
        if (nums.length == 1 && nums[0] > 0) return 1;
        int n = nums.length;
        Arrays.sort(nums);
        if (nums[n-1] == 0) return 0;
        for (int i = n - 1; i > 0; i--) {
            if (nums[i - 1] < i) {
                return n - i;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(hindex2(new int[]{3, 0, 6, 1, 5}));
    }
}
