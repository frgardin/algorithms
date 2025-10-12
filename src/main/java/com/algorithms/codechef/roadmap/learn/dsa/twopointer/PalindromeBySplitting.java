package com.algorithms.codechef.roadmap.learn.dsa.twopointer;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class PalindromeBySplitting {

    public static void main(String[] args) {
        // your code goes here
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            Deque<Integer> dq = new ArrayDeque<>();

            for (int i = 0; i < n; i++) dq.addLast(sc.nextInt());

            int ans = 0;

            while (dq.size() > 1) {
                int l = dq.pollFirst(), r = dq.pollLast();
                if (l == r) continue;
                ans++;
                if (l < r) dq.addLast(r - l);
                else dq.addFirst(l - r);
            }

            System.out.println(ans);
        }
    }
}
