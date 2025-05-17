package com.algorithms.pedrini.recursividade;

public class Fibonacci {

    public static int fibonacci(int n) {
        if (n == 1 || n == 0) return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }


    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i : a){
            System.out.println("fibonacci(" + i + ") = " + fibonacci(i));
        }
    }
}
