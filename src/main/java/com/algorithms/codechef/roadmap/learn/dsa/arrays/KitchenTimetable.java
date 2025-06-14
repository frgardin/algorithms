package com.algorithms.codechef.roadmap.learn.dsa.arrays;

import java.util.*;

public class KitchenTimetable {

    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);

        int TC = sc.nextInt();

        while(TC-->0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];

            for (int i = 0 ; i < n;i++) {
                a[i] = sc.nextInt();
            }

            for (int i = 0 ; i < n;i++) {
                b[i] = sc.nextInt();
            }
            int c=0;

            for (int i = 0 ; i < n;i++) {
                if (i == 0 && a[0] >= b[0]) {
                    c++;
                } else if (i != 0 && (a[i] - a[i-1]) >= b[i]) {
                    c++;
                }
            }

            System.out.println(c);
        }

    }
}
