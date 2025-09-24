package com.algorithms.codechef.roadmap.learn.dsa.twopointer;

import java.util.Scanner;

public class SortArrayByParity {
    public static void sortArrayByParity(int[] nums) {
        int n = nums.length;
        int l = 0, r = n-1;
        int[] ans = new int[n];

        for (int i : nums) {
            if (isOdd(i)) {
                ans[l++] = i;
            } else {
                ans[r--] = i;
            }
        }

        for (int i = l; i < ((n-l)/2)+l; i++) {
            int temp = ans[i];
            ans[i]= ans[n-1-(i-l)];
            ans[n-1-(i-l)]=temp;
        }

        System.arraycopy(ans, 0, nums, 0, n);
    }

    private static boolean isOdd(int i) {
        return i % 2 != 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] nums = new int[N];
        for (int i = 0; i < N; i++) {
            nums[i] = scanner.nextInt();
        }

        sortArrayByParity(nums);

        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
