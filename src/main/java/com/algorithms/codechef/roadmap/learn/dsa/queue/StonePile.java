package com.algorithms.codechef.roadmap.learn.dsa.queue;

import java.util.*;
import java.lang.*;
import java.io.*;

class StonePile
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);

        int TC = sc.nextInt();

        while(TC-->0) {
            int n = sc.nextInt();
            Queue<Integer> q = new LinkedList<>();;

            for (int i = 0; i < n;i++) {
                q.add(sc.nextInt());
            }

            int whichPlayer = 1;

            while (q.size() > 1) {
                if (whichPlayer == 0) {
                    move1(q);
                    move1(q);
                    move2(q);
                    whichPlayer = 1;
                } else if (whichPlayer == 1) {
                    move1(q);
                    move2(q);
                    whichPlayer = 0;
                }
            }

            if (whichPlayer == 0)    whichPlayer=1;
            else                    whichPlayer=0;

            System.out.printf("%d %d%n", whichPlayer, q.poll());

        }

    }


    private static void move1(Queue<Integer> q) {
        q.add(q.poll());
    }

    private static void move2(Queue<Integer> q) {
        q.poll();
    }
}
