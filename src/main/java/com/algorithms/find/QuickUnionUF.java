package com.algorithms.find;

public class QuickUnionUF implements UF{
    protected int[] id;
    protected final int N;
    protected int count;

    public QuickUnionUF(int N) {
        this.N=N;
        this.count=N;
        this.id = new int[N];

        for (int i = 0; i < N; i++) {
            this.id[i] = i;
        }
    }

    @Override
    public void union(int p, int q) {
        int pRoot = find(p);
        int qRoot = find(q);

        if (pRoot == qRoot) return;

        id[qRoot] = pRoot;
        count--;
    }

    @Override
    public int find(int p) {
        while(p != id[p]) {
            p = id[p];
        }
        return p;
    }

    @Override
    public boolean connected(int p, int q) {
        return find(p) == find(q);
    }

    @Override
    public int count() {
        return count;
    }
}
