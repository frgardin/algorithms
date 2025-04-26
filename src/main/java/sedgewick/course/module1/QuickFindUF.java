package sedgewick.course.module1;

import java.util.Arrays;

public class QuickFindUF implements UF{

    private final int[] id;


    public QuickFindUF(int N) {
        id = new int[N];
        for(int i = 0; i < N; i++) {
            id[i] = i;
        }
    }

    @Override
    public void union(int p, int q) {
        int pid = id[p];
        int qid = id[q];
        for (int i = 0; i < id.length; i++) {
            if (id[i] == pid) {
                id[i] = qid;
            }
        }
    }

    @Override
    public boolean connected(int p, int q) {
        return id[p] == id[q];
    }

    public static void main(String[] args) {
        QuickFindUF quickFindUF = new QuickFindUF(5);

        quickFindUF.union(1, 2);
        quickFindUF.union(3, 4);
        quickFindUF.union(0, 4);

        System.out.println(Arrays.toString(quickFindUF.id));
    }
}
