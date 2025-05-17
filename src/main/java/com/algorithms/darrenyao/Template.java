package com.algorithms.darrenyao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Template {

    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new FileReader("template.in"));
        PrintWriter w = new PrintWriter(
                new BufferedWriter(new FileWriter("template.out")));
        StringTokenizer st = new StringTokenizer(r.readLine());
        int n = Integer.parseInt(st.nextToken());
        w.close();
        r.close();
    }
}
