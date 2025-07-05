package com.algorithms.codechef.roadmap.learn.dsa.queue;

import java.util.*;
import java.lang.*;
import java.io.*;

class Necklace
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc = new Scanner(System.in);

        int TC = sc.nextInt();;

        while (TC-->0) {
            int n,k;

            n = sc.nextInt();
            k = sc.nextInt();

            Queue<Integer> q = new LinkedList<>();

            for (int i = 0; i < n;i++) {
                q.add(sc.nextInt());
            }

            for (int i = 0; i < k; i++) {
                q.add(q.poll());
            }

            StringBuilder sb = new StringBuilder();

            for (int i = 0; i <n;i++) {
                sb.append(q.poll());
                sb.append(' ');
            }

            System.out.println(sb);

        }
    }
}
