package com.algorithms.codechef.roadmap.learn.dsa.twopointer;

import java.util.Scanner;

public class CoronavirusSpread {

    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; i++) a[i] = sc.nextInt();

            int min = n;
            int max = 0;

            int l = 0;
            int r = 1;

            while (r < n) {
                if (a[r] - a[r - 1] > 2) {
                    min = Math.min(r - l, min);
                    max = Math.max(r - l, max);
                    l = r;
                }
                r++;
            }
            min = Math.min(r - l, min);
            max = Math.max(r - l, max);

            System.out.printf("%d %d%n", min, max);
        }
        sc.close();
    }
}
