package com.algorithms.pedrini.recursividade;

public class Palindromo {

    public static boolean palindromo(String s, int n) {
        if (n <= 1) return true;
        if (s.charAt(0) == s.charAt(n - 1)) return palindromo(s.substring(1, n-1), n - 2);
        return false;
    }

    public static void main(String[] args) {
        System.out.println(palindromo("aabbaaa", 7));
    }
}
