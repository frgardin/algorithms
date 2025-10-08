package com.algorithms.sedgewick;


import edu.princeton.cs.introcs.StdIn;

public class Permutation {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

        RandomizedQueue<String> rq = new RandomizedQueue<>();

        while (!StdIn.isEmpty()) {
            String s = StdIn.readString();
            rq.enqueue(s);
        }

        for (int i = 0; i < n; i++) {
            System.out.println(rq.dequeue());
        }
    }
}