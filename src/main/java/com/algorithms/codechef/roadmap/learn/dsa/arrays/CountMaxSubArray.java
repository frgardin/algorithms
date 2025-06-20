package com.algorithms.codechef.roadmap.learn.dsa.arrays;

import java.util.Scanner;

public class CountMaxSubArray {


    public static int countSubarrays(int[] arr, int N, int K) {
        int counter = 0;

        for (int i = 0; i < N;i++) {
            for (int j = i; j < N;j++) {
                int max = Integer.MIN_VALUE;
                for (int k = i; k <= j;k++) {
                    max = Math.max(max, arr[k]);
                }
                if (max == K) {
                    counter++;
                }

            }
        }

        return counter;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        int K = scanner.nextInt();

        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }

        // Calculate and store the count
        int count = countSubarrays(arr, N, K);
        System.out.println(count);

        // Close scanner (optional)
        scanner.close();
    }
}
