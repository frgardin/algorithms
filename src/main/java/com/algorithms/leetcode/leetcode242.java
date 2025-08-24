package com.algorithms.leetcode;


import java.util.Arrays;

class leetcode242 {

    private static String merge(String s1, String s2) {
        int l1 = 0;
        int l2 = 0;
        StringBuilder sb = new StringBuilder();

        while (l1 < s1.length() && l2 < s2.length()) {
            if (s1.charAt(l1) < s2.charAt(l2)) {
                sb.append(s1.charAt(l1));
                l1++;
            } else {
                sb.append(s2.charAt(l2));
                l2++;
            }
        }

        while (l1 < s1.length()) {
            sb.append(s1.charAt(l1));
            l1++;
        }

        while (l2 < s2.length()) {
            sb.append(s2.charAt(l2));
            l2++;
        }

        return sb.toString();
    }

    private static String sort(String s) {
        if (s.length() <= 1) {
            return s;
        }
        int mid = s.length() / 2;
        String s1 = sort(s.substring(mid + 1, s.length()));
        String s2 = sort(s.substring(0, mid));
        return merge(s1, s2);
    }

    public boolean isAnagram(String s, String t) {
        char[] cs = s.toCharArray();
        char[] ts = t.toCharArray();

        Arrays.sort(cs);
        Arrays.sort(ts);

        return Arrays.equals(cs, ts);
    }

    public static void main(String[] args) {
        String s = "uoiea";

        String sort = sort(s);

        System.out.println(sort);
    }
}
