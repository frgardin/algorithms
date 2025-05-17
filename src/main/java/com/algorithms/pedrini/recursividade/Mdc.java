package com.algorithms.pedrini.recursividade;

public class Mdc {

    public static int mdc(int x, int y) {
        if (y == 0) {
            return x;
        }
        return mdc(y, x % y);
    }

    public static void main(String[] args) {
        System.out.println(mdc(18, 12));
    }
}
