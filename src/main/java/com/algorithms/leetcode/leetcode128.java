package com.algorithms.leetcode;

import java.util.HashSet;

public class leetcode128 {

    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        HashSet<Integer> hs = new HashSet<>(n);

        for (int num : nums) hs.add(num);

        int ans =0 ;

        for (int num : hs) {
            if (!hs.contains(num-1)) {
                int size=1;
                while (hs.contains(num+size)) {
                    size++;
                }
                ans = Math.max(size, ans);
            }
        }

        return ans;
    }
}
