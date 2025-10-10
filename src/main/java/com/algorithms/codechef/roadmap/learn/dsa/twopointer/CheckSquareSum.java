package com.algorithms.codechef.roadmap.learn.dsa.twopointer;

import java.util.*;

public class CheckSquareSum {
    public static boolean checkSquareSum(long c) {
        // Write your code here
        double sc = Math.sqrt(c);
        int l = 1;
        int r = (int)sc;

        for (int i =l;i<r;i++) {
            for (int j =r;j>i;j--) {
                if (i*i+j*j==c) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long c = scanner.nextLong();

        if (checkSquareSum(c)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
