package com.algorithms.find;

public class QuickFindUF implements UF {

    private final int N;
    private final int[] id;
    private int count;

    public QuickFindUF(int N) {
        this.id = new int[N];
        this.N = N;
        this.count = N;

        for (int i = 0; i < N; i++) {
            id[i] = i;
        }
    }

    @Override
    public void union(int p, int q) {
        if (connected(p, q)) {
            return;
        }
        int pID = id[p];
        int qID = id[q];
        count--;
        for (int i = 0; i < N; i++) {
            if (id[i] == pID) {
                id[i] = qID;
            }
        }
    }

    @Override
    public int find(int p) {
        if (p > N - 1) {
            throw new IllegalArgumentException("The UF size is " + N);
        }
        return id[p];
    }

    @Override
    public boolean connected(int p, int q) {
        if (p > N - 1 || q > N - 1) {
            throw new IllegalArgumentException("The UF size is " + N);
        }
        return id[p] == id[q];
    }

    @Override
    public int count() {
        return count;
    }
}
