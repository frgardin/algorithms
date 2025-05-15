package leetcode.old;

import java.util.*;

public class leetcode2900 {

    public static List<String> getLongestSubsequence(String[] words, int[] groups) {
        if (words.length == 1) {
            return List.of(words);
        }
        List<String> l0 = new LinkedList<>();
        List<String> l1 = new LinkedList<>();
        List<String> r = new LinkedList<>();
        int first = groups[0];
        for (int i = 0; i < groups.length; i++) {
            if (groups[i] == 0) {
                l0.add(words[i]);
            } else {
                l1.add(words[i]);
            }
        }
        int i = 0;
        int j = 0;
        if (first == 0) {
            if (l1.isEmpty()) return List.of(l0.getFirst());

            while (i < l0.size() && j < l1.size()) {
                if (i > j) {
                    r.add(l1.get(j));
                    j++;
                } else {
                    r.add(l0.get(i));
                    i++;
                }
            }
        } else {
            if (l0.isEmpty()) return List.of(l1.getFirst());

            while (i < l0.size() && j < l1.size()) {
                if (i >= j) {
                    r.add(l1.get(j));
                    j++;
                } else {
                    r.add(l0.get(i));
                    i++;
                }
            }
        }
        while (i < l1.size() && i < l0.size()) {
            r.add(l0.get(i));
            i++;
        }
        while (j < l1.size() && j < l0.size()) {
            r.add(l1.get(j));
            j++;
        }
        return r;
    }
}
