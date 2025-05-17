package com.algorithms.pedrini.recursividade;

public class Multiplicacao {

    public static int multiplicacao(int x, int y) {
        return x * y;
    }

    public static int multiplicacaoRecursiva(int x, int y) {
        if (y == 1) return x;
        return x + multiplicacaoRecursiva(x, --y);
    }

    public static void main(String[] args) {
        System.out.println(multiplicacao(10, 123));
        System.out.println(multiplicacaoRecursiva(10, 123));
    }
}