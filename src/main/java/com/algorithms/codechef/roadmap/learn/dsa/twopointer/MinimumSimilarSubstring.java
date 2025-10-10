package com.algorithms.codechef.roadmap.learn.dsa.twopointer;

import java.util.*;

public class MinimumSimilarSubstring {

	public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        sc.nextLine();

        String s = sc.nextLine();
        String t = sc.nextLine();

        int[] freq = new int[26];

        for (char c : t.toCharArray()) {
            freq[c-'a']++;
        }

        int left = 0, count = 0, minLength = Integer.MAX_VALUE, start = -1;
        int[] window = new int[26];


        for (int right = 0; right < s.length(); right++) {
            int index = s.charAt(right) - 'a';
            window[index]++;

            if (window[index] <= freq[index]) {
                count++;
            }

            while (count == t.length()) {
                if (right - left + 1 < minLength) {
                    minLength = right - left + 1;
                    start = left;
                }

                index = s.charAt(left) - 'a';
                window[index]--;

                if (window[index] < freq[index]) {
                    count--;
                }

                left++;
            }
        }

        if (minLength == Integer.MAX_VALUE) {
            System.out.println("IMPOSSIBLE");
        } else {
            System.out.println(minLength);
            System.out.println(s.substring(start, start + minLength));
        }

    }
}
