package com.algorithms.codechef.roadmap.learn.dsa.stack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class LargestRectangleInHistogram {

    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        ;

        int TC = sc.nextInt();

        while (TC-- > 0) {

            int n = sc.nextInt();

            long[] a = new long[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }


            long maxArea = 0;
            ;


            Deque<Integer> dq = new ArrayDeque<>();


            for (int i = 0; i <= n; i++) {

                long h = (i == n) ? 0 : a[i];

                while (!dq.isEmpty() && h < a[dq.peek()]) {

                    long H = a[dq.pop()];

                    long W = dq.isEmpty() ? i : i - dq.peek() - 1;

                    maxArea = Math.max(maxArea, H * W);
                }
                dq.push(i);
            }

            System.out.println(maxArea);
        }

    }

}
