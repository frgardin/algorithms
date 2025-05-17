package com.algorithms.pedrini.recursividade;

public class Fatorial {

    public static int fatorial(int n) {
        int produto = 1;

        for (int i = 1; i <= n; i++)
            produto = produto * i;
        return produto;
    }

    public static int fatorialRecursivo(int n) {
        if (n == 1 || n == 0) return 1;
        return n * fatorialRecursivo(n - 1);
    }

    public static void main(String[] args)   {
        System.out.println(fatorialRecursivo(10));
        System.out.println(fatorial(10));
    }
}
