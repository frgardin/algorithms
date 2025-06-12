package com.algorithms.codechef.roadmap.learn.dsa.arrays;

import java.util.Scanner;

public class TakeADiscountOrNot {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }

            int priceWithCupom = x;
            int priceWithoutCupom = 0;

            for (int i : a) {
                priceWithoutCupom+=i;
                priceWithCupom+=Math.max(0, i-y);
            }

            if (priceWithCupom < priceWithoutCupom) {
                System.out.println("COUPON");
            } else {
                System.out.println("NO COUPON");
            }
        }
    }
}
