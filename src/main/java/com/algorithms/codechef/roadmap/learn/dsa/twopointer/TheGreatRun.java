package com.algorithms.codechef.roadmap.learn.dsa.twopointer;

import java.util.Scanner;

public class TheGreatRun {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            int[] arr = new int[n];

            for (int i = 0; i < n; i++)
                arr[i] = sc.nextInt();

            int l = 0;
            int r = k - 1;

            int sum = 0;
            for (int i = l; i <= r; i++) {
                sum += arr[i];
            }

            int ans = sum;

            while (r < n - 1) {
                ans = Math.max(ans, sum);
                r++;
                sum += arr[r];
                sum -= arr[l];
                l++;
            }
            ans = Math.max(ans, sum);

            System.out.println(ans);
        }
        sc.close();
    }
}
