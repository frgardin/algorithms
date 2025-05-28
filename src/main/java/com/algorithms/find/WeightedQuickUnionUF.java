package com.algorithms.find;

public class WeightedQuickUnionUF extends QuickUnionUF implements UF{
    private int[]sz;

    public WeightedQuickUnionUF(int N) {
        super(N);

        for (int i = 0; i < N; i++) {
            this.sz[i] = 1;
        }
    }

    @Override
    public void union(int p, int q) {
        int pRoot = find(p);
        int qRoot = find(q);

        if (pRoot == qRoot) return;
        count--;
        if (sz[pRoot] < sz[qRoot]) {
            id[qRoot] = id[pRoot];
            sz[pRoot] += sz[qRoot];
        } else {
            id[pRoot] = id[qRoot];
            sz[qRoot] += sz[pRoot];
        }
    }
}
