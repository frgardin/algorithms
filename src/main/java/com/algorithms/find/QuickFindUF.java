package com.algorithms.find;

public class QuickFindUF implements UF{

    private int[] id;
    private int N;
    private int count;

    public QuickFindUF(int N) {
        this.N = N;
        this.count = N;
        this.id = new int[N];

        for (int i = 0; i < N; i++) {
            this.id[i] = i;
        }
    }

    @Override
    public void union(int p, int q) {
        if (connected(p, q)) return;
        count--;
        for (int i = 0; i < N; i++) {
            if (id[i] == id[q]) {
                id[i] = id[p];
            }
        }
    }

    @Override
    public int find(int p) {
        return id[p];
    }

    @Override
    public boolean connected(int p, int q) {
        return id[p] == id[q];
    }

    @Override
    public int count() {
        return count;
    }
}
