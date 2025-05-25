package com.algorithms.usaco;

import java.io.*;
import java.util.*;

/*
ID: gardinf1
LANG: JAVA
TASK: mixmilk
*/
public class mixmilk {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("mixmilk.in"));
        PrintWriter pw = new PrintWriter(new FileWriter("mixmilk.out"));

        StringTokenizer st1 = new StringTokenizer(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        StringTokenizer st3 = new StringTokenizer(br.readLine());

        int c1 = Integer.parseInt(st1.nextToken());
        int m1 = Integer.parseInt(st1.nextToken());
        int c2 = Integer.parseInt(st2.nextToken());
        int m2 = Integer.parseInt(st2.nextToken());
        int c3 = Integer.parseInt(st3.nextToken());
        int m3 = Integer.parseInt(st3.nextToken());


        int r1 = m1;
        int r2 = m2;
        int r3 = m3; 


        int actual = 1;
        int counter = 1;


        while (counter <= 4) {
        
            if (actual == 1) {
                if ((r1 + r2) > c2) {
                    r1 = r1 + r2 - c2;
                    r2 = c2;
                } else {
                    r2 = r1 + r2;
                    r1 = 0;
                }
            } else if (actual == 2) {
                if ((r2 + r3) > c3) {
                    r2 = r2 + r3 - c3;
                    r3 = c3;
                } else {
                    r3 = r2 + r3;
                    r2 = 0;
                }
            } else {
                 if ((r3 + r1) > c1) {
                    r3 = r3 + r1 - c1;
                    r1 = c1;
                } else {
                    r1 = r3 + r1;
                    r3 = 0;
                }
            }

            counter++;
            actual = (actual + 1) == 4 ? 1 : (actual + 1);
        }

        StringBuilder sb = new StringBuilder();

        sb.append(r1);
        sb.append('\n');
        sb.append(r2);
        sb.append('\n');
        sb.append(r3);

        pw.print(sb);
        br.close();
        pw.close();
    }
}
