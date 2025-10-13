package com.algorithms.codechef.roadmap.learn.dsa.twopointer;

import java.util.*;

public class FindingTheSubarrayWithMinimumSumOfSizeK {

    public static long findMinSumSubarray(int n, int k, int[] arr) {
        // Write your code here
        long sum = 0;

        for (int i=0;i<k;i++) sum+=arr[i];

        long currentSum=sum;

        for (int l=0, r=k;r<n;l++, r++) {
            currentSum-=arr[l];
            currentSum+=arr[r];
            sum=Math.min(currentSum, sum);
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        scanner.close();
        System.out.println(findMinSumSubarray(n, k, arr));
    }
}
