package sedgewick.course.module1;

import java.util.Arrays;

public class QuickUnionUF implements UF{

    private final int[] id;

    public QuickUnionUF(int N) {
        this.id = new int[N];
        for (int i = 0; i < N; i++) {
            id[i] = i;
        }
    }

    private int root(int i) {
        while(id[i] != i) {
            i = id[i];
        }
        return i;
    }

    @Override
    public void union(int p, int q) {
        int rp = root(p);
        int rq = root(q);
        id[rp] = rq;
    }

    @Override
    public boolean connected(int p, int q) {
        return root(p) == root(q);
    }

    public static void main(String[] args) {
        QuickUnionUF unionUF = new QuickUnionUF(5);

        unionUF.union(1, 2);
        unionUF.union(3, 4);
        unionUF.union(0, 4);

        System.out.println(Arrays.toString(unionUF.id));
    }
}
