package com.algorithms.codechef.roadmap.learn.dsa.arrays;

import java.util.Scanner;

public class FindMaximumInArray {

    public static void main(String[] args) throws java.lang.Exception {


        Scanner sc = new Scanner(System.in);

        int TC = sc.nextInt();

        while (TC-- > 0) {
            int n = sc.nextInt();
            int max = 0;

            while (n-- > 0) {
                max = Math.max(sc.nextInt(), max);
            }
            System.out.println(max);
        }
    }
}
