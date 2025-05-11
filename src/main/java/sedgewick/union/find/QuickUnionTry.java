package sedgewick.union.find;

public class QuickUnionTry implements UF{

    private final int[] id;
    private int count;

    public QuickUnionTry(int N){
        this.id = new int[N];
        this.count = N;

        for (int i = 0; i < N;i++) {
            id[i] = i;
        }
    }

    @Override
    public void union(int p, int q) {
        if (connected(p, q)) return;
        count--;
        id[p] = q;
    }

    @Override
    public int find(int p) {
        while (id[p] != p) {
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
