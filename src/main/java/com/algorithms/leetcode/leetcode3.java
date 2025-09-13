package com.algorithms.leetcode;

import java.util.HashSet;

public class leetcode3 {

    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> hs = new HashSet<>();

        int ans= 0;
        int init=0;
        int i=0;

        for(char c : s.toCharArray()) {
            while (hs.contains(c)) {
                hs.remove(s.charAt(init));
                init++;
            }
            hs.add(c);            
            ans = Math.max(ans, i-init+1);
            i++;
        }
        
        return ans;
    }
}
