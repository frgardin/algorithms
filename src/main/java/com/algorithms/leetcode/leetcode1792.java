package com.algorithms.leetcode;

public class leetcode1792 {

    static class Pair {
        int i;
        double v;

        Pair(int i, double v) {
            this.i = i;
            this.v = v;
        }
    }

    public double maxAverageRatio(int[][] classes, int extraStudents) {
        
        double n = classes.length;
        double acc = 0.0;
        
        while (extraStudents>0) {
            Pair p = new Pair(-1, Double.MIN_VALUE);
            for (int i =0;i<n;i++) {
                double v = getAvg(classes[i], 1)-getAvg(classes[i], 0);
                if (p.v<v){
                    p.i=i;
                    p.v=v;
                }
            }
            classes[p.i][0]++;
            classes[p.i][1]++;
            extraStudents--;
        }
        
        for (int i =0;i<n;i++){
            acc+=getAvg(classes[i],0);
        }
        return acc/n;
    }

    private static double getAvg(int[] clazz, int extraStudents) {
        return ((double) clazz[0] + (double) extraStudents) / ((double) clazz[1] + (double) extraStudents);
    }

    public static void main(String[] args) {
        System.out.println(new leetcode1792().maxAverageRatio(new int[][]{{2,4},{3,9},{4,5},{2,10}}, 4));

    }
}