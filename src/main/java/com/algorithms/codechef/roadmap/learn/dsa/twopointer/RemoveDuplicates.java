package com.algorithms.codechef.roadmap.learn.dsa.twopointer;

import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int s = n;
            int[] a = new int[n];

            for (int i = 0; i < n; i++)
                a[i] = sc.nextInt();

            int l = 0;
            int r = 1;
            StringBuilder sb = new StringBuilder();

            while (r < n) {
                if (a[l] == a[r]) {
                    r++;
                    s--;
                } else {
                    sb.append(a[l]);
                    sb.append(' ');
                    l = r;
                    r++;
                }
            }
            sb.append(a[l]);

            System.out.println(s);
            System.out.println(sb);
        }
    }
}
