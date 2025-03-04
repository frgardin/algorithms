package leetcode;

import java.util.*;

public class leetcode387 {

    public static int firstUniqChar(String s) {
        char[] sc = s.toCharArray();
        int n = s.length();
        Map<Character, Integer> m = new HashMap<>(n);
        Map<Character, Boolean> mb = new HashMap<>(n);
        for (int i = 0; i < n;i++) {
            if (m.containsKey(sc[i])) {
                mb.put(sc[i], false);
                continue;
            }
            m.put(sc[i], i);
            mb.put(sc[i], true);
        }

        for (int i = 0; i < n; i++) {
            if (mb.get(sc[i])) {
                return m.get(sc[i]);
            }
        }
        return -1;
    }

    //BEST ONE
    public static int firstUniqChar2(String s) {
        char[] sc = s.toCharArray();
        int n = s.length();
        Map<Character, Integer> m = new HashMap<>(n);
        Set<Character> list = new HashSet<>(n);
        for (int i = 0; i < n;i++) {
            if (m.containsKey(sc[i])) {
                list.remove(sc[i]);
                continue;
            }
            m.put(sc[i], i);
            list.add(sc[i]);
        }
        return list.isEmpty() ? -1 : m.get(list.stream().findFirst().get());
    }

    public static int firstUniqChar3(String s) {
        Map<Character, Integer> map = new HashMap<>();
        char[] sc = s.toCharArray();
        for (char c : sc) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (int i = 0; i < sc.length; i++) {
            if (map.get(sc[i]) == 1) return i;
        }
        return -1;
    }

    public static int firstUniqChar4(String s) {
        int[] count = new int[26];
        char[] sc = s.toCharArray();
        for (char c : sc) {
            count[c - 'a']++;
        }
        int first = s.length();
        for (int i = 0; i < 26; i++) {
            if (count[i] == 1) {
                first = Math.min(first, s.indexOf(i + 'a'));
            }
        }
        return first == s.length() ? -1 : first;
    }

    public static void main(String[] args) {
        System.out.println(firstUniqChar4("loveleetcode"));
    }
}
