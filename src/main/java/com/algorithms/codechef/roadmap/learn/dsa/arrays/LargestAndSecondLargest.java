package com.algorithms.codechef.roadmap.learn.dsa.arrays;

import java.util.Scanner;

public class LargestAndSecondLargest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }

            int max = 0;

            for (int i : a) {
                max = Math.max(max, i);
            }

            int secondMax = 0;

            for (int i : a) {
                if (secondMax < i && i != max) {
                    secondMax = i;
                }
            }

            System.out.println(max + secondMax);
        }
    }
}
