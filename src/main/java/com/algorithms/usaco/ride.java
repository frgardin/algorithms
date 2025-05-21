package com.algorithms.usaco;

import java.io.*;

/*
ID: gardinf1
LANG: JAVA
TASK: ride
*/
public class ride {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("ride.in"));
        PrintWriter pw = new PrintWriter(new FileWriter("ride.out"));
        String cs = br.readLine();
        int acc = 1;
        for (char c : cs.toCharArray()) {
            acc *= c - 'A' + 1;
        }
        int ms = acc % 47;
        String gs = br.readLine();
        acc = 1;
        for (char c : gs.toCharArray()) {
            acc *= c - 'A' + 1;
        }
        int mg = acc % 47;

        pw.println(ms == mg ? "GO" : "STAY");
        pw.close();
        br.close();
    }
}
