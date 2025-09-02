package com.algorithms.leetcode;

import java.util.Comparator;
import java.util.PriorityQueue;

public class leetcode1792 {

    public static double maxAverageRatio(int[][] classes, int extraStudents) {

        double n = classes.length;
        double acc = 0.0;
        PriorityQueue<double[]> pq = new PriorityQueue<>(new Comparator<double[]>() {
            public int compare(double[] a, double[] b) {
                if (a[0] < b[0])
                    return 1;
                if (a[0] > b[0])
                    return -1;
                return 0;
            }
        });

        for (int i = 0; i < n; i++) {
            double pass = classes[i][0];
            double total = classes[i][1];
            double inc = (pass + 1.0) / (total + 1.0) - pass / total;
            pq.offer(new double[] { inc, pass, total });
        }

        while (extraStudents > 0) {
            double[] top = pq.poll();

            double pass = top[1] + 1;
            double total = top[2] + 1;
            double inc = (pass + 1.0) / (total + 1.0) - pass / total;

            pq.offer(new double[] { inc, pass, total });
            extraStudents--;
        }

        for (double[] v : pq) {
            acc += v[1] / v[2];
        }
        return acc / n;
    }

    public static void main(String[] args) {
        System.out.println(
                new leetcode1792().maxAverageRatio(new int[][] { { 2, 4 }, { 3, 9 }, { 4, 5 }, { 2, 10 } }, 4));

    }
}