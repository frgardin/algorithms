package helio.pedrini.recursividade;

import java.util.Arrays;

public class PermutacaoArray {

    private static void troca(int[]v, int a, int b) {
        int aux = v[a];
        v[a] = v[b];
        v[b] = aux;
    }

    private static void permutacao(int[] v, int k, int n) {
        if (k == n - 1) {
            System.out.println(Arrays.toString(v));
        } else {
            for (int i = k; i < n;i++) {
                troca(v, k, i);
                permutacao(v, k + 1, n);
                troca(v, k, i);
            }
        }
    }

    public static void main(String[] args) {
        permutacao(new int[]{1, 2, 3}, 0, 3);
    }
}
