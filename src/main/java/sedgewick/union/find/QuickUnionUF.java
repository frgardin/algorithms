package sedgewick.union.find;

public class QuickUnionUF implements UF{

    private final int[] id;
    private final int N;
    private int count;

    public QuickUnionUF(int N) {
        this.id = new int[N];
        this.N = N;
        this.count = N;

        for (int i = 0; i < N; i++) {
            id[i] = i;
        }
    }


    @Override
    public void union(int p, int q) {
        if(find(p) == find(q)) return;
        count--;
        id[p] = q;
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
