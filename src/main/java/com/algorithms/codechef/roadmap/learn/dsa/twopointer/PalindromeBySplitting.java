package com.algorithms.codechef.roadmap.learn.dsa.twopointer;

import java.util.*;

public class PalindromeBySplitting {

    //TODO: IS NOT WORKING
    public static void main(String[] args) {
        // your code goes here
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-->0) {
            int n = sc.nextInt();

            int[] a = new int[n];

            for (int i=0;i<n;i++) a[i]=sc.nextInt();

            Deque<Integer> dq = new ArrayDeque<>();

            int l, r, ans = 0;

            if (n % 2 == 0) {
                l = n/2;
                r = l+1;
            } else {
                l = n/2-1;
                r = n/2+1;
            }

            if (!(l >=0 && r < n)) {
                System.out.println(0);
                continue;
            }


            dq.addFirst(a[l]);
            dq.addLast(a[r]);

            while (l >=0 && r < n) {
                int leftValue = dq.pollFirst();
                int rightValue = dq.pollLast();


                if (leftValue == rightValue) {
                    l--;
                    r++;
                    if (l >=0 && r < n) {
                        dq.addFirst(a[l]);
                        dq.addLast(a[r]);
                    }
                    continue;
                }
                if (leftValue < rightValue) {
                    ans++;
                    dq.addLast(leftValue);
                    dq.addLast(rightValue - leftValue);
                    continue;
                }
                ans++;
                dq.addFirst(rightValue);
                dq.addFirst(leftValue - rightValue);
            }

            System.out.println(ans);
        }
    }
}
