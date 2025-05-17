package com.algorithms.cses;

import java.util.Scanner;

public class MissingNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a  = new int[n-1];
        long sum = 0;

        for (int i = 0; i < n-1; i++) {
            a[i] = sc.nextInt();
            sum += a[i];
        }

        sc.close();

        System.out.println((long) n * (n+1)/2 - sum);

    }
}
