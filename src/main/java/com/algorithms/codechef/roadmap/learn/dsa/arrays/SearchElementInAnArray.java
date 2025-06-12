package com.algorithms.codechef.roadmap.learn.dsa.arrays;

import java.util.Scanner;

public class SearchElementInAnArray {

    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int x = sc.nextInt();

        boolean b = false;
        while(n-->0) {
            if (sc.nextInt() == x) {
                b = true;
                break;
            }
        }

        if (b) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
