package com.algorithms.codechef.roadmap;

import java.util.*;
import java.lang.*;

class FindArrayMin {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {
            int na=sc.nextInt();
            int nb=sc.nextInt();
            int nc=sc.nextInt();

            int aa[] = new int[na];
            int ab[] = new int[nb];
            int ac[] = new int[nc];

            for (int i =0;i<na;i++) {
                aa[i]=sc.nextInt();
            }
            for (int i =0;i<nb;i++) {
                ab[i]=sc.nextInt();
            }
            for (int i =0;i<nc;i++) {
                ac[i]=sc.nextInt();
            }

            int min=Integer.MAX_VALUE;
            for(int i : aa) {
                for (int j : ab) {
                    for (int k : ac) {
                        min=Math.min(f(i, j, k), min);
                    }
                }
            }
            System.out.println(min);
        }
    }

    private static int f(int i, int j, int k) {
        return Math.max(
                Math.max(
                        Math.abs(i-j),
                        Math.abs(i-k)
                ),
                Math.abs(j-k)
        );
    }
}