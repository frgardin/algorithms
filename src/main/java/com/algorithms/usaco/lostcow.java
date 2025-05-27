package com.algorithms.usaco;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class lostcow {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("lostcow.in"));
        PrintWriter pw = new PrintWriter(new PrintWriter("lostcow.out"));


        StringTokenizer st = new StringTokenizer(br.readLine());

        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());

        int acc = 0;
        int pos = x;
        if (x < y) {
            for (int i = 1; pos < y; i *= -2) {
                int newPos = Math.min(x + i, y);
                acc += Math.abs(newPos - pos);
                pos = newPos;
            }
        } else if (x > y) {
            for (int i = 1; pos > y; i *= -2) {
                int newPos = Math.max(x + i, y);
                acc += Math.abs(newPos - pos);
                pos = newPos;
            }
        }

        pw.print(acc);
        br.close();
        pw.close();
    }
}