package com.algorithms.pedrini.recursividade;

public class Hanoi {

    private static final String MESSAGE = "mover o disco %d do pino %c para o pino %c%n";

    private static void hanoi(int n, char a, char b, char c) {
        if (n == 1) {
            System.out.printf(MESSAGE, n, a, c);
        } else {
            hanoi(n - 1, a, c, b);
            System.out.printf(MESSAGE, n, a, c);
            hanoi(n - 1, b, a, c);
        }
    }

    public static void main(String[] args) {
        hanoi(4, 'a', 'b', 'c');
    }
}
