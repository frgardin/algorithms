package com.algorithms.codechef.roadmap.learn.dsa.twopointer;

import java.util.Scanner;

public class SpecialSubstring {

    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            sc.nextLine();
            String s = sc.nextLine();

            int[] a = new int[26];

            int l = 0, r = 0, max = 0;

            while (r < n) {
                while (a[s.charAt(r) - 'a'] > s.charAt(r) - 'a') {
                    a[s.charAt(l) - 'a']--;
                    l++;
                }
                max = Math.max(max, r - l + 1);
                a[s.charAt(r) - 'a']++;
                r++;
            }

            System.out.println(max);
        }
    }
}
