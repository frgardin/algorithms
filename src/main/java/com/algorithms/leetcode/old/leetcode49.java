package com.algorithms.leetcode.old;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class leetcode49 {

    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> m = new HashMap<>();

        for (String s : strs) {
            String stringSorted = s.chars().sorted()
                    .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                    .toString();
            if (m.containsKey(stringSorted)) {
                m.get(stringSorted).add(s);
            } else {
                LinkedList<String> l = new LinkedList<>();
                l.add(s);
                m.put(stringSorted, l);
            }
        }

        return m.values().stream().collect(Collectors.toList());
    }
}
