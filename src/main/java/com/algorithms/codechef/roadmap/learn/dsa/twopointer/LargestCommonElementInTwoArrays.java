package com.algorithms.codechef.roadmap.learn.dsa.twopointer;

import java.util.*;

public class LargestCommonElementInTwoArrays {
    public static int largestCommonElement(int[] arr1, int[] arr2) {
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int i = 0;
        int j = 0;

        int n = arr1.length;
        int m = arr2.length;

        int ans =-1;

        while (i < n && j <m) {
            if (arr1[i] == arr2[j]) {
                ans = Math.max(arr1[i],ans);
                i++;
                j++;
                continue;
            }
            if (arr1[i] > arr2[j]) {
                j++;
                continue;
            }
            i++;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[m];
        for (int i = 0; i < n; i++) arr1[i] = sc.nextInt();
        for (int i = 0; i < m; i++) arr2[i] = sc.nextInt();
        System.out.println(largestCommonElement(arr1, arr2));
    }
}
