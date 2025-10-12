package com.algorithms.codechef.roadmap.learn.dsa.twopointer;

import java.util.*;

public class CollegeLife5 {

    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-->0) {
            int n = sc.nextInt();

            int m = sc.nextInt();

            int p =0;

            int ni = 0;
            int mi = 0;
            int ans=0;

            int[] an = new int[n];
            int[] am = new int[m];

            for (int i =0;i<n;i++) an[i]=sc.nextInt();
            for (int i =0;i<m;i++) am[i]=sc.nextInt();

            while (ni < n && mi < m) {
                int f = an[ni];
                int c = am[mi];

                if (p == 0 && f < c) {
                    ni++;
                    continue;
                }
                if (p == 1 && f < c) {
                    ans++;
                    p=0;
                    ni++;
                    continue;
                }
                if (p == 0 && f > c) {
                    ans++;
                    p=1;
                    mi++;
                    continue;
                }
                if (p == 1 && f > c) {
                    mi++;
                }
            }

            if (ni < n && p==1)ans++;
            if (mi < m && p==0)ans++;


            System.out.println(ans);
        }
    }
}
