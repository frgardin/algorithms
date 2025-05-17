package com.algorithms.pedrini.recursividade;

public class Soma {

    public static int soma(int x, int y) {
        return x + y;
    }

    public static int somaRecursiva(int x, int y) {
        if (y == 0) return x;
        return somaRecursiva(++x, --y);
    }

    public static void main(String[] args) {
        System.out.println(soma(10, 7));
        System.out.println(somaRecursiva(10,7));
    }
}
