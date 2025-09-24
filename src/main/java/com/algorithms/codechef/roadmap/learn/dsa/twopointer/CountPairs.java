package com.algorithms.codechef.roadmap.learn.dsa.twopointer;

import java.util.Scanner;

public class CountPairs {
    public static long countPairsLessThanX(int[] arr, int x) {
        // Write your code here
        int l = 0;

        int n = arr.length;
        int r = n-1;
        long ans =0;

        while (l<r) {
            if (arr[l]+arr[r] < x) {
                ans+=r-l;
                l++;
            } else {
                r--;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        System.out.println(countPairsLessThanX(arr, x));
    }

}
