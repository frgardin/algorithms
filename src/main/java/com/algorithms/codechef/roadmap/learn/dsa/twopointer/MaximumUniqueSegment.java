package com.algorithms.codechef.roadmap.learn.dsa.twopointer;

import java.util.*;

public class MaximumUniqueSegment {

    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc = new Scanner(System.in);

        int t=sc.nextInt();

        while (t-->0) {
            int n = sc.nextInt();

            int[] c = new int[n];
            int[] w = new int[n];

            for (int i =0;i<n;i++) c[i]=sc.nextInt();
            for (int i =0;i<n;i++) w[i]=sc.nextInt();

            Set<Integer> set = new HashSet<>();

            long max = 0, count=0;
            int  l=0, r=0;

            while (r<n) {

                while (r<n && !set.contains(c[r])) {
                    set.add(c[r]);
                    count+=w[r];
                    max=Math.max(count, max);
                    r++;
                }


                if (r < n) {
                    while (set.contains(c[r])) {
                        set.remove(c[l]);
                        count-=w[l];
                        l++;
                    }
                }

            }

            System.out.println(max);
        }
    }
}
