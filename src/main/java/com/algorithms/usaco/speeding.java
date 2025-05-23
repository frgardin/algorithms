package com.algorithms.usaco;/*
ID: gardinf1
LANG: JAVA
TASK: speeding
*/
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;


class speeding {

    static class Pair {
        int first;
        int second;

        Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }

        static Pair of(int f, int s) {
            return new Pair(f, s);
        }

        @Override
        public String toString() {
            return "(" + this.first + ", " + this.second + ")";
        }
    }


    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("speeding.in"));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("speeding.out")));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int ni = 0;
        int mi = 0;

        List<Integer> nl = new ArrayList<>(100);
        List<Integer> ml = new ArrayList<>(100);
        int max = 0;
        while (ni < 100) {
            StringTokenizer nst = new StringTokenizer(br.readLine());
            int nLen = Integer.parseInt(nst.nextToken());
            int nSpeed = Integer.parseInt(nst.nextToken());
            for (int i = ni; i < ni + nLen; i++) {
                nl.add(nSpeed);
            }
            ni += nLen;
        }
        while (mi < 100) {
            StringTokenizer nst = new StringTokenizer(br.readLine());
            int mLen = Integer.parseInt(nst.nextToken());
            int mSpeed = Integer.parseInt(nst.nextToken());
            for (int i = mi; i < mi + mLen; i++) {
                ml.add(mSpeed);
            }
            mi += mLen;
        }

        for (int i = 0; i < 100; i++) {
            max = Math.max(max, ml.get(i) - nl.get(i));
        }

        pw.print(max);
        br.close();
        pw.close();
    }
}	