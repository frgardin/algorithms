package com.algorithms.pedrini.recursividade;

public class PowerFunction {

    private static int power(int a, int n) {
        if (n == 0) return 1;
        return a * power(a, n-1);
    }

    private static int powerFaster(int a, int n) {
        if (n == 0) return 1;

        int subProblem = powerFaster(a, n / 2);
        int subProblem1 = subProblem * subProblem;

        if ((n&1) == 1) {
            return a * subProblem1;
        } else {
            return subProblem1;
        }
    }

    public static void main(String[] args) {
        System.out.println(power(3, 10));
        System.out.println(powerFaster(3, 10));
    }
}
