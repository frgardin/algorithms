package com.algorithms.codechef.roadmap.learn.dsa.arrays;

import java.util.*;

public class RedLightGreenLight {

    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);

        int TC = sc.nextInt();

        while(TC-->0) {
            int n = sc.nextInt();
            int h = sc.nextInt();

            int counter = 0;

            while (n-->0) {
                if (sc.nextInt() > h) {
                    counter++;
                }
            }

            System.out.println(counter);
        }

    }
}
