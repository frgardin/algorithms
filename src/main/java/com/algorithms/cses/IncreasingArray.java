package com.algorithms.cses;

import java.util.Scanner;


public class IncreasingArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        long sum = 0;
        long[] ar = new long[t];
        ar[0] = sc.nextInt();

        for (int i = 1; i < t; i++) {
            ar[i] = sc.nextInt();
            if (ar[i - 1] > ar[i]) {
                sum += ar[i - 1] - ar[i];
                ar[i] = ar[i - 1];
            }
        }
        System.out.println(sum);
        sc.close();
    }

}