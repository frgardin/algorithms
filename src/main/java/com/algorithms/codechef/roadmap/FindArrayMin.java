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
            int i=0,j=0,k=0;

            while(i<na && j<nb && k<nc) {
                int a=aa[i], b=ab[j],c=ac[k];

                int curMin=Math.min(Math.min(a,b), c);
                int curMax=Math.max(Math.max(a,b), c);
                min=Math.min(min, curMax-curMin);

                if (curMin == a)        i++;
                else if (curMin == b)   j++;
                else                    k++;
            }


            System.out.println(min);
        }
    }
}