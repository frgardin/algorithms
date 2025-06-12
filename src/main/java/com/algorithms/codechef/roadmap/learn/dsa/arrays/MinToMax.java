package com.algorithms.codechef.roadmap.learn.dsa.arrays;

import java.util.Scanner;

public class MinToMax {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }


            int min = Integer.MAX_VALUE;

            for(int i = 0; i < n; i++)
                min = Math.min(a[i], min);


            int counter = 0;

            for(int i : a) {
                if (i != min) {
                    counter++;
                }
            }

            System.out.println(counter);

        }
    }
}
