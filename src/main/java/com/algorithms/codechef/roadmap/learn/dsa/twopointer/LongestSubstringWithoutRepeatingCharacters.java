package com.algorithms.codechef.roadmap.learn.dsa.twopointer;

import java.util.Scanner;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main (String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        int max=0;

        int[] set = new int[26];


        int l=0;
        int r=0;

        while (r<s.length()) {
            while (set[s.charAt(r) - 'a'] > 0) {
                set[s.charAt(l) - 'a']--;
                l++;
            }
            set[s.charAt(r) - 'a']++;
            max = Math.max(r - l + 1, max);
            r++;
        }

        System.out.println(max);
    }
}
