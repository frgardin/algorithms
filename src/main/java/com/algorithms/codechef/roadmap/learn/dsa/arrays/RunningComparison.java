package com.algorithms.codechef.roadmap.learn.dsa.arrays;

import java.util.Scanner;

public class RunningComparison {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }

            for (int i = 0; i < n; i++) {
                b[i] = scanner.nextInt();
            }
            int c=0;

            for (int i = 0; i < n; i++) {
                if (Math.max(a[i], b[i]) <= Math.min(a[i], b[i]) * 2) {
                    c++;
                }
            }

            System.out.println(c);
        }
    }
}
