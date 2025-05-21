package com.algorithms.usaco;

import java.io.*;
import java.util.*;

/*
ID: frgardin
LANG: JAVA
TASK: test
LINK: https://usaco.org/index.php?page=viewproblem2&cpid=665
*/
public class cowsignal {

    public static void main(String[] args) throws Exception{
        BufferedReader f = new BufferedReader(new FileReader("cowsignal.in"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("cowsignal.out")));
        StringTokenizer st = new StringTokenizer(f.readLine());

        int m, n, k;

        m = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();

        int i = 0;
        while (i++ < m) {
            String s = f.readLine();

            int j = 0;

            while (j++ < k) {
                for (char c : s.toCharArray()) {
                    int l = 0;
                    while(l++ < k) {
                        sb.append(c);
                    }
                }
                sb.append('\n');
            }
        }

        out.print(sb);
        f.close();
        out.close();
    }
}
