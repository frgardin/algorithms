package com.algorithms.codechef.roadmap.learn.dsa.deque;

import java.util.*;
import java.lang.*;
import java.io.*;

class SuspenseString
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);

        int TC = sc.nextInt();

        while (TC-->0) {
            int n = sc.nextInt();

            String s = sc.next();

            Deque<Character> dqS = new LinkedList<>();
            Deque<Character> dqT = new LinkedList<>();

            for (char c : s.toCharArray()) {
                dqS.addLast(c);
            }

            boolean isAlice = true;

            while (!dqS.isEmpty()) {
                if (isAlice) {
                    char c = dqS.pollFirst();
                    if (c == '0') {
                        dqT.addFirst(c);
                    } else {
                        dqT.addLast(c);
                    }

                    isAlice = false;
                } else {
                    char c = dqS.pollLast();
                    if (c == '0') {
                        dqT.addLast(c);
                    } else {
                        dqT.addFirst(c);
                    }

                    isAlice = true;
                }
            }

            StringBuilder sb= new StringBuilder();

            for (char c : dqT) {
                sb.append(c);
                //sb.append(' ');
            }

            System.out.println(sb);

        }

    }
}
