package com.algorithms.codechef.roadmap.learn.dsa.arrays;

import java.util.Scanner;

public class CopsAndTheThiefDevu {
    private static final int MAX = 100;
    private static final int MIN = 1;


    private static class Range {
        int min;
        int max;

        Range(int min, int max) {
            this.max = max;
            this.min = min;
        }

        public boolean isInsideRange(int n) {
            return n >= min && n <=max;
        }
    }


    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);

        int TC = sc.nextInt();

        while(TC-->0) {
            int m = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();

            int run = x * y;

            Range[] rs = new Range[m];
            int[] houses = new int[m];

            for (int i = 0; i < m;i++) {
                houses[i] = sc.nextInt();
                rs[i] = new Range(houses[i]-run, houses[i]+run);
            }

            int counter = 0;

            for (int i = MIN; i <= MAX;i++) {
                boolean found = true;
                for (int j = 0; j < m;j++) {
                    found &= !rs[j].isInsideRange(i);
                }
                if (found) {
                    counter++;
                }
            }

            System.out.println(counter);
        }

    }
}
