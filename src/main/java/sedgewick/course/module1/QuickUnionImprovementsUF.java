package sedgewick.course.module1;

public class QuickUnionImprovementsUF implements UF {


    private final int[] id;
    private final int[] sz;

    public QuickUnionImprovementsUF(int N) {
        this.id = new int[N];
        this.sz = new int[N];
        for (int i = 0; i < N; i++) {
            id[i] = i;
            sz[i] = 1;
        }
    }

    private int root(int i) {
        while (id[i] != i) {
            id[i] = id[id[i]];
            i = id[i];
        }
        return i;
    }


    @Override
    public void union(int p, int q) {
        int rp = root(p);
        int rq = root(q);
        if (rq == rp) return;
        if (sz[rp] < sz[rq]) {
            id[rp] = rq;
            sz[rq] += sz[rp];
        } else {
            id[rp] = rq;
            sz[rq] += sz[rp];
        }
    }

    @Override
    public boolean connected(int p, int q) {
        return root(p) == root(q);
    }
}
