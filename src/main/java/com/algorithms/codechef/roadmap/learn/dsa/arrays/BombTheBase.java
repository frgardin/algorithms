package com.algorithms.codechef.roadmap.learn.dsa.arrays;

import java.util.Scanner;

public class BombTheBase {

    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);

        int TC = sc.nextInt();


        while (TC-->0) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            int[] a = new int[n];

            for (int i = 0; i<n;i++) {
                a[i] = sc.nextInt();
            }
            int i=n-1;

            while(i>=0) {
                if (a[i] < x) {
                    break;
                }
                i--;
            }

            System.out.println(i+1);
        }
    }
}

