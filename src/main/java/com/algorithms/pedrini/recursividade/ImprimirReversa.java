package com.algorithms.pedrini.recursividade;

public class ImprimirReversa {

    public static void imprimirReversa(String s) {
        if (s.isEmpty()) return;
        System.out.print(s.charAt(s.length() - 1));
        imprimirReversa(s.substring(0, s.length() - 1));
    }

    public static void main(String[] args) {
        imprimirReversa("abcd");
    }
}
