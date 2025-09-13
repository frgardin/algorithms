package com.algorithms.leetcode;

import java.util.HashMap;

public class leetcode3 {

    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> hs = new HashMap<>();

        int counter = 0;
        int ans = 0;
        int i = 0;

        while (i < s.length()) {
            char c = s.charAt(i);
            if (hs.containsKey(c)) {
                ans = Math.max(counter, ans);
                i = hs.get(c) + 1;
                hs.clear();
                counter = 0;
            } else {
                hs.put(c, i);
                counter++;
                i++;
            }
        }
        ans = Math.max(counter, ans);
        return ans;
    }
}
