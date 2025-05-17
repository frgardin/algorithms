package com.algorithms.pedrini.recursividade;

import java.util.Arrays;

public class Bhaskara {

    public static double[] baskarar1(double a, double b, double c) {
        double delta = Math.sqrt(Math.pow(b, 2) - 4 * a * c);
        return new double[]{(-b + delta) / (2 * a), (-b - delta) / (2 * a)};
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(baskarar1(1, -1, -132)));
    }
}
