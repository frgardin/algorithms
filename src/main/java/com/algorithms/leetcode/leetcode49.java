package com.algorithms.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class leetcode49 {

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> m = new HashMap<>();
        List<List<String>> ans = new ArrayList<>();

        for (String s : strs) {
            char[] cs = s.toCharArray();
            Arrays.sort(cs);
            String s2 = new String(cs);

            if (m.containsKey(s2)) {
                m.get(s2).add(s);
            } else {
                List<String> l = new ArrayList<>();
                l.add(s);
                m.put(s2, l);
                ans.add(l);
            }
        }

        return ans;
    }
}
