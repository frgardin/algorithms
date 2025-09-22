package com.algorithms.codechef.roadmap.learn.dsa.twopointer;

import java.util.Scanner;

public class DifferencePairs {

    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int b = sc.nextInt();

            int[] a = new int[n];

            for (int i = 0; i < n; i++)
                a[i] = sc.nextInt();

            System.out.println(diffPairs(a, n, b));

        }
        sc.close();
    }

    private static int diffPairs(int[] a, int n, int b) {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (Math.abs(a[i] - a[j]) == b) {
                    return 1;
                }
            }
        }
        return 0;
    }
}
