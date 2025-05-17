package com.algorithms.pedrini.recursividade;

public class Damas {

    private static void imprimirSolucao(int[] v, int n) {
        int i;
        for (i = 0; i < n; i++) {
            System.out.printf("%d ", v[i]);
        }
        System.out.println();
    }

    private static boolean posicaoValida(int[] v, int k) {
        int i;

        for (i = 0; i < k; i++) {
            if ((v[i] == v[k]) || (Math.abs(v[i] - v[k]) == (k - i))) {
                return false;
            }
        }
        return true;
    }

    private static void damas(int[] v, int k, int n) {
        int i;

        if (k == n) {
            imprimirSolucao(v, n);
        } else {
            for (i = 1; i <= n; i++) {
                v[k] = i;
                if (posicaoValida(v, k)) {
                    damas(v, k + 1, n);
                }
            }
        }
    }

    public static void main(String[] args) {
        damas(new int[8], 0, 8);
    }
}
