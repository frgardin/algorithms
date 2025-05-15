package leetcode.old;

import java.util.*;

public class leetcode2900 {

    public static List<String> getLongestSubsequence(String[] words, int[] groups) {
        if (words.length == 1) {
            return List.of(words);
        }
        int i = 1;
        List<String> l = new ArrayList<>();
        List<Integer> g = new ArrayList<>();
        l.add(words[0]);
        g.add(groups[0]);

        while(i < groups.length) {
            if (g.getLast() != groups[i]) {
                l.add(words[i]);
                g.add(groups[i]);
            }
            i++;
        }
        return l;
    }
}
